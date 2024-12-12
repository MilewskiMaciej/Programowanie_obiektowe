public interface IKoszykZakupowy {
    void dodajProdukt(Produkt produkt, int ilosc);
    void usunProdukt(Produkt produkt, int ilosc);
    void wyswietlZawartoscKoszyka();
    double obliczCalkowitaWartosc();

    default void podsumowanieKoszyka() {
        System.out.println("Podsumowanie:");
        wyswietlZawartoscKoszyka();
        System.out.println("Calkowita wartosc: " + obliczCalkowitaWartosc());
    }
}
