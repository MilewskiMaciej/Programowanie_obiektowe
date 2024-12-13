public class Jablko extends ProduktSpozywczy implements IOwoc {
    private String kolor;
    private boolean czyEkologiczne;

    public Jablko(String nazwa, double cena, int iloscNaMagazynie, String dataWaznosci, boolean czyEkologiczne) {
        super(nazwa, cena, iloscNaMagazynie, dataWaznosci, czyEkologiczne);
        this.kolor = kolor;
        this.czyEkologiczne = czyEkologiczne;
    }

    public String getKolor() {
        return kolor;
    }

    public boolean isCzyEkologiczne() {
        return czyEkologiczne;
    }

    @Override
    public String smak() {
        return "SŁodki i kwaśny";
    }

    @Override
    public void umyj() {
        System.out.println("Japko jest myte");
    }

    @Override
    public void zjedz() {
        System.out.println("JEM.");
    }
}
