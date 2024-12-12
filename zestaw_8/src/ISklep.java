import java.time.LocalDate;

public interface ISklep {
    String getNazwaSklepu();
    LocalDate getDataPowstania();
    void dodajProdukt(Produkt produkt, int ilosc);
    void wyswietlOferty();
    Produkt wyszukajProdukt(String nazwa);
    void zakupy(KoszykZakupowy koszyk, String nazwa, int ilosc);

    default void wyswietlSzczegoly() {
        System.out.println("Sklep: " + getNazwaSklepu());
        System.out.println("Data powstania: " + getDataPowstania());
        wyswietlOferty();
    }
}
