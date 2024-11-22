import java.util.List;

class KoszykZakupowy {
    List<String> listaProduktow;

    public void dodajProdukt(List<String> listaProduktow, Produkt produkt) {
        listaProduktow.add(produkt.nazwa);
    }
}
