import java.util.HashMap;
import java.util.Map;

public class Magazyn implements IMagazyn {
    Map<Produkt, Integer> produkty;

    public Magazyn() {
        this.produkty = new HashMap<>();
    }

    @Override
    public void dodajProdukt(Produkt produkt, int ilosc) {
        if(ilosc <= 0) {
            throw new IllegalArgumentException("Ty nie muożesz dodać 0 produktów");
        }
        produkty.put(produkt, produkty.getOrDefault(produkt, 0) + ilosc);
    }

    @Override
    public void wyswietlAsortyment() {
        System.out.println("Asortyment magazynu: ");
        for(Map.Entry<Produkt, Integer> entry : produkty.entrySet()) {
            System.out.println(entry.getKey().getNazwa() + " - Ilosc " + entry.getValue());
        }
    }

    @Override
    public void zdejmijProdukt(Produkt produkt, int ilosc) {
        if(!produkty.containsKey(produkt) && produkty.get(produkt) < ilosc) {
            throw new IllegalArgumentException("Ty nie muożesz mieć ujemnej ilości produktów");
        }
        produkty.put(produkt, produkty.get(produkt) - ilosc);
        if(produkty.get(produkt) == 0) {
            produkty.remove(produkt);
        }
    }

    @Override
    public int getIloscProduktu(Produkt produkt) {
        return produkty.getOrDefault(produkt, 0);
    }
}
