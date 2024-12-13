public class Laptop extends ProduktPrzemyslowy implements IUrzadzenieElektroniczne {
    private String procesor;
    private int ram;

    public Laptop(String nazwa, double cena, int iloscNaMagazynie, String kategoria, int okresGwarancji, String procesor, int ram) {
        super(nazwa, cena, iloscNaMagazynie, kategoria, okresGwarancji);
        this.procesor = procesor;
        this.ram = ram;
    }

    public String getProcesor() {
        return procesor;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public void napraw() {
        System.out.println("Naprawioned");
    }

    @Override
    public void uzyj() {
        System.out.println("Użyted");
    }

    @Override
    public void zepsuj() {
        System.out.println("Zepsuted");
    }

    @Override
    public void wlacz() {
        System.out.println("Włączoned");
    }

    @Override
    public void wylacz() {
        System.out.println("Wyłączoned");
    }
}
