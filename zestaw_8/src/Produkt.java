public class Produkt implements IProdukt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int c) {
        setNazwa(nazwa);
        setCena(cena);
        setIloscNaMagazynie(c);
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if(nazwa == null || nazwa.isEmpty()) {
            throw new IllegalArgumentException("Ty nie muożesz dać pustej nazwy");
        }
        this.nazwa = nazwa;
    }

    @Override
    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if(cena <= 0) {
            throw new IllegalArgumentException("Ty nie muożesz dać zerowej czy ujemnej ceny");
        }
        this.cena = cena;
    }

    @Override
    public int getIloscNaMagazynie() { return iloscNaMagazynie; }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        if(iloscNaMagazynie < 0) {
            throw new IllegalArgumentException("Ty nie muożesz dać ujemnej ilości");
        }
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Nazwa produktu: " + nazwa);
        System.out.println("Cena: " + cena);
        System.out.println("Ilosc na magazynie: " + iloscNaMagazynie);
    }

    @Override
    public void dodajDoMagazynu(int ilosc) {
        iloscNaMagazynie += ilosc;
        System.out.println("Ilosc " + nazwa + " po dodaniu: " + iloscNaMagazynie);
    }

    @Override
    public boolean usunZMagazynu(int u) {
        if(iloscNaMagazynie >= u && u > 0) {
            iloscNaMagazynie -= u;
            System.out.println("Ilosc " + nazwa + " po usunieciu: " + iloscNaMagazynie);
            return true;
        } else {
            System.out.println("Ty nie muożesz usunac produktu");
            return false;
        }
    }

    @Override
    public int hashCode() {
        return nazwa.hashCode() + Double.valueOf(cena).hashCode();
    }
}