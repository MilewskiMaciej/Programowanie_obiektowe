public class ProduktPrzemyslowy extends Produkt {
    private String kategoria;
    private int okresGwarancji;

    public ProduktPrzemyslowy(String nazwa, double cena, int iloscNaMagazynie, String kategoria, int okresGwarancji) {
        super(nazwa, cena, iloscNaMagazynie);
        this.kategoria = kategoria;
        this.okresGwarancji = okresGwarancji;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        if(kategoria == null || kategoria.isEmpty()) {
            throw new IllegalArgumentException("Kategoria nie może być pusta.");
        }
        this.kategoria = kategoria;
    }

    public int getOkresGwarancji() {
        return okresGwarancji;
    }

    public void setOkresGwarancji(int okresGwarancji) {
        if(okresGwarancji < 0) {
            throw new IllegalArgumentException("Okres gwarancji nie może być ujemny.");
        }
        this.okresGwarancji = okresGwarancji;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Kategoria: " + kategoria);
        System.out.println("Okres gwarancji: " + okresGwarancji + "miesięcy");
    }
}
