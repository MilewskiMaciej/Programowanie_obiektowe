import java.util.*;

public class Zamowienie implements IZamowienie {
    KoszykZakupowy koszyk;
    String statusZamowienia;
    Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszyk, String statusZamowienia) {
        this.koszyk = koszyk;
        this.statusZamowienia = statusZamowienia;
        this.platnosc = new Platnosc(koszyk.obliczCalkowitaWartosc());
    }

    @Override
    public String getStatusZamowienia() {
        return statusZamowienia;
    }

    @Override
    public void ustawStatusZamowienia(String nowyStatus) {
        this.statusZamowienia = nowyStatus;
        System.out.println("Status twojego zamowienia zostal zmieniony na " + statusZamowienia);
    }

    @Override
    public void wyswietlZamowienie() {
        System.out.println("Status zamowienia: " + statusZamowienia);
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println("Status platnosci: " + platnosc.getStatusPlatnosci());
    }

    @Override
    public void finalizujZamowienie() {
        if(platnosc.getStatusPlatnosci().equals("Oplacone")) {
            this.statusZamowienia = "Gotowe do wysylki";
            System.out.println("Zamowienie jest gotowe do wysylki");
        } else {
            System.out.println("Zamowienie zostalo odrzucone");
        }
    }

    @Override
    public void zwrocProdukt(Produkt produkt, int ilosc) {
        if(koszyk.contains(produkt)) {
            koszyk.usunProdukt(produkt, ilosc);
            produkt.dodajDoMagazynu(ilosc);
            System.out.println("Zwrocono " + ilosc + " sztuk " + produkt.nazwa);
        } else {
            System.out.println("Produkt nie znajduje sie w koszyku");
        }
    }
}
