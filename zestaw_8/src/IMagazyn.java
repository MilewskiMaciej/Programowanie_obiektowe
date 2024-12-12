public interface IMagazyn {
    void dodajProdukt(Produkt produkt, int ilosc);
    void wyswietlAsortyment();
    void zdejmijProdukt(Produkt produkt, int ilosc);
    int getIloscProduktu(Produkt produkt);
}
