import java.util.HashMap;
import java.util.Map;

class KoszykZakupowy {
    Map<Produkt, Integer> produkty;

    public KoszykZakupowy() {
        this.produkty = new HashMap<>();
    }
    public void dodajProdukt(Produkt produkt, int ilosc) {
        if (produkt != null && ilosc <= produkt.iloscNaMagazynie) {
            produkt.usunZMagazynu(ilosc);
            produkty.put(produkt, produkty.getOrDefault(produkt, 0) + ilosc);
            System.out.println("Dodano " + ilosc + " sztuk " + produkt.nazwa + " do koszyka");
        } else {
            System.out.println("Ty nie muozesz dodac " + produkt.nazwa + " do koszyka");
        }
    }
    public void wyswietlZawartoscKoszyka() {
        System.out.println("Twoj koszyk:");
        for(Map.Entry<Produkt, Integer> entry : produkty.entrySet()) {
            System.out.println("- " + entry.getKey().getNazwa() + ", ilosc: " + entry.getValue());
        }
    }

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

    public void usunProdukt(Produkt produkt, int ilosc) {
        if(produkty.containsKey(produkt)) {
            int aktualnaIlosc = produkty.get(produkt);
            if (ilosc >= aktualnaIlosc) {
                produkty.remove(produkt);
            } else {
                produkty.put(produkt, aktualnaIlosc - ilosc);
            }
        } else {
            System.out.println("Produkt " + produkt.nazwa + " nie znajduje sie w koszyku");
        }
    }
}
