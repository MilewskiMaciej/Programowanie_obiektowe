import java.util.ArrayList;
import java.util.List;

public class Sklep {
    List<Produkt> produkty;

    public Sklep() {
        this.produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
        System.out.println("Dodano " + produkt.nazwa + " do sklepu");
    }

    public void wyswietlOferty() {
        System.out.println("Oferta sklepu: ");
        for(Produkt produkt : produkty) {
            produkt.wyswietlInformacje();
        }
    }

    public Produkt wyszukajProdukty(String nazwa) {
        for(Produkt produkt : produkty) {
            if(produkt.nazwa.equalsIgnoreCase(nazwa)) {
                return produkt;
            }
        }
        System.out.println("Nie znaleziono " + nazwa + " w sklepie");
        return null;
    }

    public void zakupy(Klient klient, String nazwaProduktu, int ilosc) {
        Produkt produkt = wyszukajProdukty(nazwaProduktu);
        if(produkt != null && produkt.iloscNaMagazynie >= ilosc) {
            KoszykZakupowy koszyk = new KoszykZakupowy();
            Zamowienie zamowienie = new Zamowienie(koszyk, "Nowe");
            klient.dodajZamowienie(zamowienie);
            koszyk.dodajProdukt(produkt, ilosc);
            System.out.println("Dodano " + ilosc + " sztuk " + nazwaProduktu + " do koszyka");
        } else {
            System.out.println("Produkt zostal wyprzedany");
        }
    }
}
