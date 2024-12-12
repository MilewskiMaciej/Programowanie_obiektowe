public interface IProdukt {
    String getNazwa();
    double getCena();
    int getIloscNaMagazynie();
    void dodajDoMagazynu(int ilosc);
    boolean usunZMagazynu(int ilosc);
    void wyswietlInformacje();

    default double obliczWartoscMagazynu() {
        return getCena() * getIloscNaMagazynie();
    }

    default boolean czyDostepny(int ilosc) {
        return getIloscNaMagazynie() > ilosc;
    }
}
