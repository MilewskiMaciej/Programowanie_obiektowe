import java.util.Map;
import java.util.HashMap;

public class Sklep {
    Magazyn magazyn;

    public Sklep() {
        this.magazyn = new Magazyn();
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        magazyn.dodajProdukt(produkt, ilosc);
    }

    public void wyswietlOferty() {
    magazyn.wyswietlAsortyment();
    }

    public Produkt wyszukajProdukt(String nazwa) {
        for(Map.Entry<Produkt, Integer> entry : magazyn.produkty.entrySet()) {
            if(entry.getKey().getNazwa.equalsIgnoreCase(nazwa)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public boolean zakupy(KoszykZakupowy koszyk, String nazwaProduktu, int ilosc) {
        Produkt produkt = wyszukajProdukt(nazwaProduktu);
        if (produkt != null && magazyn.zdejmijProdukt(produkt, ilosc)) {
            koszyk.dodajProdukt(produkt, ilosc);
            return true;
        }
        return false;
    }
}
