public class Platnosc {
    double kwota;
    String statusPlatnosci;

    public Platnosc(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Nieoplacone";
    }

    public void zaplac(double kwota) {
        if(kwota >= this.kwota) {
            this.kwota = 0;
            this.statusPlatnosci = "Oplacone";
            System.out.println("Platnosc zostala zrealizowana");
        } else {
            System.out.println("Niewystarczajaca kwota");
        }
    }
    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }
}
