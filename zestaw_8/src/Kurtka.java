public class Kurtka extends ProduktPrzemyslowy implements IUbranie {
    private String rozmiar;
    private String material;

    public Kurtka(String nazwa, double cena, int iloscNaMagazynie, String kategoria, int okresGwarancji, String rozmiar, String material) {
        super(nazwa, cena, iloscNaMagazynie, kategoria, okresGwarancji);
        this.rozmiar = rozmiar;
        this. material = material;
    }

    public String getRozmiar() {
        return rozmiar;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void wypierz() {
        System.out.println("Wypraned");
    }

    public void zaloz() {
        System.out.println("Założoned");
    }

    public void wyprasuj() {
        System.out.println("Wyprasowaned");
    }

    public void wysusz() {
        System.out.println("Wysuszoned");
    }

    public void zniszcz() {
        System.out.println("Zniszczoned");
    }
}
