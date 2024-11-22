class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int c) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = c;
    }

    public void wyswietlInformacje() {
        System.out.println("Nazwa produktu: " + nazwa);
        System.out.println("Cena: " + cena);
        System.out.println("Ilosc na magazynie: " + iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int ilosc) {
        iloscNaMagazynie += ilosc;
        System.out.println("Ilosc " + nazwa + " po dodaniu: " + iloscNaMagazynie);
    }

    public void usunZMagazynu(int u) {
        if(iloscNaMagazynie >= u && u > 0) {
            iloscNaMagazynie -= u;
            System.out.println("Ilosc " + nazwa + " po usunieciu: " + iloscNaMagazynie);
        } else {
            System.out.println("Nie mozna usunac produktu");
        }
    }
}