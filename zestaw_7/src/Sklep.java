import java.util.Map;
import java.time.LocalDate;

public class Sklep {
    String nazwaSklepu;
    LocalDate dataPowstania;
    Magazyn magazynSklepu;

    public Sklep(String nazwaSklepu, LocalDate dataPowstania, Magazyn magazynSklepu) {
        if(dataPowstania.isAfter(LocalDate.now())) {
            System.out.println("Data powstania jest w przyszłości, a to jest nielegalne.");
        }
        this.nazwaSklepu = nazwaSklepu;
        this.dataPowstania = dataPowstania;
        this.magazynSklepu = magazynSklepu;
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        magazynSklepu.dodajProdukt(produkt, ilosc);
    }

    public void wyswietlOferty() {
    magazynSklepu.wyswietlAsortyment();
    }

    public Produkt wyszukajProdukt(String nazwa) {
        for(Map.Entry<Produkt, Integer> entry : magazynSklepu.produkty.entrySet()) {
            if(entry.getKey().getNazwa().equalsIgnoreCase(nazwa)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public boolean zakupy(KoszykZakupowy koszyk, String nazwaProduktu, int ilosc) {
        Produkt produkt = wyszukajProdukt(nazwaProduktu);
        if (produkt != null && magazynSklepu.zdejmijProdukt(produkt, ilosc)) {
            koszyk.dodajProdukt(produkt, ilosc);
            return true;
        }
        return false;
    }
}
