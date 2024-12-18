import java.util.HashMap;
import java.util.Map;

public class KoszykZakupowy implements IKoszykZakupowy {
    private Map<Produkt, Integer> produkty;

    public KoszykZakupowy() {
        this.produkty = new HashMap<>();
    }

    @Override
    public void dodajProdukt(Produkt produkt, int ilosc) {
        if(ilosc <= 0) {
            throw new IllegalArgumentException("Ty nie muożesz mieć zerowej ilości produktu");
        }
        produkty.put(produkt, produkty.getOrDefault(produkt, 0) + ilosc);
    }

    @Override
    public void wyswietlZawartoscKoszyka() {
        System.out.println("Twoj koszyk:");
        for(Map.Entry<Produkt, Integer> entry : produkty.entrySet()) {
            System.out.println("- " + entry.getKey().getNazwa() + ", ilosc: " + entry.getValue());
        }
    }

    @Override
    public double obliczCalkowitaWartosc() {
        double suma = 0;
        for(Map.Entry<Produkt, Integer> entry : produkty.entrySet()) {
            suma += entry.getKey().getCena() * entry.getValue();
        }
        return suma;
    }

    public boolean contains(Produkt produkt) {
        return produkty.containsKey(produkt);
    }

    @Override
    public void usunProdukt(Produkt produkt, int ilosc) {
        if(!produkty.containsKey(produkt) || produkty.get(produkt) < ilosc) {
            throw new IllegalArgumentException("Ty nie muożesz usunąć tego produktu");
        }
        produkty.put(produkt, produkty.get(produkt) - ilosc);
        if(produkty.get(produkt) == 0) {
            produkty.remove(produkt);
        }
    }
}
