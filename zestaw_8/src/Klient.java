import java.util.ArrayList;
import java.util.List;

public class Klient {
    private String imie;
    private String nazwisko;
    private Adres adres;
    private List<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko, Adres adres) {
        setImie(imie);
        setNazwisko(nazwisko);
        setAdres(adres);
        this.listaZamowien = new ArrayList<>();
    }

    public String getImie(String imie) {
        return imie;
    }

    public void setImie(String imie) {
        if(imie == null || imie.isEmpty()) {
            throw new IllegalArgumentException("Ty nie muożesz być bezimienny");
        }
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if(nazwisko == null || nazwisko.isEmpty()) {
            throw new IllegalArgumentException("Ty nie muożesz nie mieć nazwiska");
        }
        this.nazwisko = nazwisko;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        if(adres == null) {
            throw new IllegalArgumentException("Ty nie muożesz mieć pustego adresu");
        }
        this.adres = adres;
    }

    @Override
    public int hashCode() {
        return imie.hashCode() + nazwisko.hashCode() + adres.hashCode();
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
