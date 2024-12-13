public class Marchewka extends ProduktSpozywczy implements IWarzywo {
    private String odmiana;
    private double dlugosc;

    public Marchewka(String nazwa, double cena, int iloscNaMagazynie, String dataWaznosci, String odmiana, double dlugosc, boolean czyEkologiczne) {
        super(nazwa, cena, iloscNaMagazynie, dataWaznosci, czyEkologiczne);
        this.odmiana = odmiana;
        this.dlugosc = dlugosc;
    }

    public String getOdmiana() {
        return odmiana;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    @Override
    public String smak() {
        return "Słodki czy coś takiego";
    }

    @Override
    public void umyj() {
        System.out.println("Myję");
    }

    @Override
    public void zjedz() {
        System.out.println("JEM.");
    }
}
