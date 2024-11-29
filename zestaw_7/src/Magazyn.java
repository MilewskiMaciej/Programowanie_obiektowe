import java.util.HashMap;
import java.util.Map;

public class Magazyn {
    Map<Produkt, Integer> produkty;

    public Magazyn() {
        this.produkty = new HashMap<>();
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        produkty.put(produkt, produkty.getOrDefault(produkt, 0) + ilosc);
    }

    public void wyswietlAsortyment() {
        System.out.println("Asortyment magazynu: ");
        for(Map.Entry<Produkt, Integer> entry : produkty.entrySet()) {
            System.out.println(entry.getKey().getNazwa() + " - Ilosc " + entry.getValue());
        }
    }

    public boolean zdejmijProdukt(Produkt produkt, int ilosc) {
        if(produkty.containsKey(produkt) && produkty.get(produkt) >= ilosc) {
            produkty.put(produkt, produkty.get(produkt) - ilosc);
            if(produkty.get(produkt) == 0) {
                produkty.remove(produkt);
            }
            return true;
        } else {
            System.out.println("Nie ma wystarczajacej ilosci produktu " + produkt.getNazwa());
            return false;
        }
    }

    public int getIloscProduktu(Produkt produkt) {
        return produkty.getOrDefault(produkt, 0);
    }
}
