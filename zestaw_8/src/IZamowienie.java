public interface IZamowienie {
    void finalizujZamowienie();
    void zwrocProdukt(Produkt produkt, int ilosc);
    void wyswietlZamowienie();
    void ustawStatusZamowienia(String status);
    String getStatusZamowienia();

    default void wyswietlStatus() {
        System.out.println("Status zamowienia: " + getStatusZamowienia());
    }
}
