import java.util.ArrayList;
import java.util.List;

public class Klient {
    String imie;
    String nazwisko;
    Adres adres;
    List<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.listaZamowien = new ArrayList<>();
    }

    public void dodajZamowienie(Zamowienie zamowienie) {
        listaZamowien.add(zamowienie);
        System.out.println("Dodano zamowienie dla klienta: " + imie + " " + nazwisko);
    }

    public void wyswietlHistorieZamowien() {
        System.out.println("Historia zamowien dla klienta: " + imie + " " + nazwisko);
        if(listaZamowien.isEmpty()) {
            System.out.println("Brak zamowien");
        } else {
            for(int i = 0; i < listaZamowien.size(); i++) {
                System.out.println("Zamowienie " + (i + 1) + ":");
                listaZamowien.get(i).wyswietlZamowienie();
                System.out.println("Adres: ");
                adres.pokaz();
                System.out.println();
            }
        }
    }

    public double obliczLacznyKosztZamowien() {
        double koszt = 0;
        for(Zamowienie zamowienie : listaZamowien) {
            koszt += zamowienie.koszyk.obliczCalkowitaWartosc();
        }
        return koszt;
    }
}
