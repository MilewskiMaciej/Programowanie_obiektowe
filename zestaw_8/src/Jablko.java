public class Jablko extends ProduktSpozywczy implements Owoc {
    public Jablko(String nazwa, double cena, int iloscNaMagazynie, String dataWaznosci) {
        super(nazwa, cena, iloscNaMagazynie, dataWaznosci);
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
