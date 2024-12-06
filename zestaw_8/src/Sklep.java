import java.util.Map;
import java.time.LocalDate;

public class Sklep {
    private String nazwaSklepu;
    private LocalDate dataPowstania;
    private Magazyn magazynSklepu;

    public Sklep(String nazwaSklepu, LocalDate dataPowstania, Magazyn magazynSklepu) {
        if(dataPowstania.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Ty nie muożesz mieć daty z przyszłości");
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
        for(Produkt produkt : magazynSklepu.produkty.keySet()) {
            if(produkt.getNazwa().equalsIgnoreCase(nazwa)) {
                return produkt;
            }
        }
        throw new IllegalArgumentException("Ty nie muożesz znaleźć " + nazwa);
    }

    public void zakupy(KoszykZakupowy koszyk, String nazwaProduktu, int ilosc) {
        Produkt produkt = wyszukajProdukt(nazwaProduktu);
        if(magazynSklepu.getIloscProduktu(produkt) >= ilosc) {
            koszyk.dodajProdukt(produkt, ilosc);
            magazynSklepu.zdejmijProdukt(produkt, ilosc);
        } else {
            throw new IllegalArgumentException("Ty nie masz wystarczającej ilości produktu w magazynie");
        }
    }
}
