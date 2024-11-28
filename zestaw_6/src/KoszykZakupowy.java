import java.util.List;
import java.util.ArrayList;

class KoszykZakupowy {
    List<Produkt> listaProduktow;

    public KoszykZakupowy() {
        this.listaProduktow = new ArrayList<>();
    }
    public void dodajProdukt(Produkt produkt, int ilosc) {
        if (produkt != null && ilosc <= produkt.iloscNaMagazynie) {
            produkt.usunZMagazynu(ilosc);
            listaProduktow.add(new Produkt(produkt.nazwa, produkt.cena, ilosc));
            System.out.println("Dodano " + ilosc + " sztuk " + produkt.nazwa + " do koszyka");
        } else {
            System.out.println("Ty nie muozesz dodac " + produkt.nazwa + " do koszyka");
        }
    }
    public void wyswietlZawartoscKoszyka() {
        System.out.println("Twoj koszyk:");
        for(Produkt produkt : listaProduktow) {
            System.out.println("- " + produkt.nazwa + ", ilosc: " + produkt.iloscNaMagazynie);
        }
    }

    public double obliczCalkowitaWartosc() {
        double suma = 0;
        for(Produkt produkt : listaProduktow) {
            suma += produkt.cena * produkt.iloscNaMagazynie;
        }
        return suma;
    }

    public boolean contains(Produkt produkt) {
        return listaProduktow.contains(produkt);
    }

    public void usunProdukt(Produkt produkt, int ilosc) {
        if(listaProduktow.contains(produkt)) {
            int usuniete = 0;
            for(int i = 0; i < ilosc; i++) {
                if(listaProduktow.remove(produkt)) {
                    usuniete++;
                }
            }
            produkt.dodajDoMagazynu(usuniete);
            System.out.println("Usunieto " + usuniete + " sztuk " + produkt.nazwa);
        } else {
            System.out.println("Produkt " + produkt.nazwa + " nie znajduje sie w koszyku");
        }
    }
}
