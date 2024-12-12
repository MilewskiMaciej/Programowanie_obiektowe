public interface IKlient {
    String getImie(String imie);
    String getNazwisko();
    Adres getAdres();
    void dodajZamowienie(Zamowienie zamowienie);
    void wyswietlHistorieZamowien();
    double obliczLacznyKosztZamowien();

    default void wyswietlPodsumowanieZamowien() {
        System.out.println("Podsumowanie zamowien:");
        wyswietlHistorieZamowien();
        System.out.println("Łączny koszt zamówień: " + obliczLacznyKosztZamowien());
    }
}
