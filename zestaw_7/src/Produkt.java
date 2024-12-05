class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int c) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = c;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
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

    public boolean usunZMagazynu(int u) {
        if(iloscNaMagazynie >= u && u > 0) {
            iloscNaMagazynie -= u;
            System.out.println("Ilosc " + nazwa + " po usunieciu: " + iloscNaMagazynie);
            return true;
        } else {
            System.out.println("Nie mozna usunac produktu");
            return false;
        }
    }
}