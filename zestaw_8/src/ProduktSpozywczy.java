public class ProduktSpozywczy extends Produkt {
    private String dataWaznosci;
    private boolean czyEkologiczny;

    public ProduktSpozywczy(String nazwa, double cena, int iloscNaMagazynie, String dataWaznosci, boolean czyEkologiczny) {
        super(nazwa, cena, iloscNaMagazynie);
        this.dataWaznosci = dataWaznosci;
        this.czyEkologiczny = czyEkologiczny;
    }

    public String getDataWaznosci() {
        return dataWaznosci;
    }

    public void setDataWaznosci(String dataWaznosci) {
        if(dataWaznosci == null || dataWaznosci.isEmpty()) {
            throw new IllegalArgumentException("Data ważności nie może być pusta.");
        }
        this.dataWaznosci = dataWaznosci;
    }

    public boolean isCzyEkologiczny() {
        return czyEkologiczny;
    }

    public void setCzyEkologiczny(boolean czyEkologiczny) {
        this.czyEkologiczny = czyEkologiczny;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Data waznosci: " + dataWaznosci);
        System.out.println("Czy ekologiczny: " + (czyEkologiczny ? "Tak" : "Nie"));
    }
}
