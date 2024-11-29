public class Main {
    public static void main(String[] args) {
        Sklep sklep = new Sklep();
        Produkt produkt1 = new Produkt("napoj", 3.99, 30);
        Produkt produkt2 = new Produkt("baton", 1.49, 50);
        sklep.dodajProdukt(produkt1);
        sklep.dodajProdukt(produkt2);
        sklep.wyswietlOferty();
        Klient klient = new Klient("Jan", "Kowal");
        sklep.zakupy(klient, "napoj", 10);
        sklep.zakupy(klient, "banan", 3);
        klient.wyswietlHistorieZamowien();
        double koszt = klient.obliczLacznyKosztZamowien();
        System.out.println("Laczna kwota zamowien: " + koszt);
        Magazyn magazyn = new Magazyn(produkt1, 90);

    }
}