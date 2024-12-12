public class Platnosc implements IPlatnosc {
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Nieoplacone";
    }

    @Override
    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        if(kwota < 0) {
            throw new IllegalArgumentException("Ty nie muożesz dodać ujemnej kwuoty");
        }
        this.kwota = kwota;
    }

    @Override
    public void zaplac(double kwota) {
        if(kwota >= this.kwota) {
            this.kwota = 0;
            this.statusPlatnosci = "Oplacone";
            System.out.println("Platnosc zostala zrealizowana");
        } else {
            throw new IllegalArgumentException("Ty nie muożesz za to zapuacić");
        }
    }

    @Override
    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(kwota).hashCode() + statusPlatnosci.hashCode();
    }
}
