import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produkt produkt1 = new Produkt("Mleko", 4.50, 50);
        Produkt produkt2 = new Produkt("Chlyb", 3, 50);
        Produkt produkt3 = new Produkt("Maseł", 8, 50);
        Magazyn magazyn = new Magazyn();
        magazyn.dodajProdukt(produkt1, 50);
        magazyn.dodajProdukt(produkt2, 30);
        magazyn.dodajProdukt(produkt3, 20);
        magazyn.wyswietlAsortyment();
        Sklep sklep = new Sklep("Uobi", LocalDate.of(2000, 5, 15), magazyn);
        sklep.dodajProdukt(produkt1, 20);
        sklep.dodajProdukt(produkt2, 20);
        sklep.dodajProdukt(produkt3, 20);
        KoszykZakupowy koszyk = new KoszykZakupowy();
        sklep.zakupy(koszyk, "Mleko", 10);
        sklep.zakupy(koszyk, "Chlyb", 5);
        koszyk.wyswietlZawartoscKoszyka();
        magazyn.wyswietlAsortyment();
    }
}