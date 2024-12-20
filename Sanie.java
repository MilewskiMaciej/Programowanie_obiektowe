import java.util.List;

public class Sanie {
    List<Renifer> listaReniferow;

    public void dodajRenifera(Renifer renifer) {
        listaReniferow.add(renifer);
    }

    public double sumaPredkosci() {
        double suma = 0;
        for(Renifer r : listaReniferow) {
            suma += r.getPredkosc();
        }
        return suma;
    }

    public Renifer najwolniejszyRenifer() {
        Renifer min = listaReniferow.get(0);
        for(Renifer renifer : listaReniferow) {
            if(renifer.getPredkosc() < min.getPredkosc()) {
                min = renifer;
            }
        }
        return min;
    }
}
