import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Fabryka {
    ArrayList<Elf> listaElfow;
    private int dlGeo;
    private int szGeo;

    public Fabryka(ArrayList<Elf> listaElfow, int dlGeo, int szGeo) {
        this.listaElfow = listaElfow;
        this.dlGeo = dlGeo;
        this.szGeo = szGeo;
    }

    public int getDlGeo() {
        return dlGeo;
    }

    public void setDlGeo(int dlGeo) {
        if(dlGeo < -180 || dlGeo > 180) {
            throw new IllegalArgumentException("Długość geograficzna musi się mieścić w zakresie od -180 do 180");
        }
        this.dlGeo = dlGeo;
    }

    public int getSzGeo() {
        return szGeo;
    }

    public void setSzGeo(int szGeo) {
        if(szGeo < -90 || szGeo > 90) {
            throw new IllegalArgumentException("Szerokość geograficzna musi się mieścić w zakresie od -90 do 90");
        }
        this.szGeo = szGeo;
    }

    public void dodajPracownika(Elf elf) {
        listaElfow.add(elf);
    }

    public void usunPracownika(Elf elf) {
        listaElfow.remove(elf);
    }

    public Elf najstarszyPracownik() {
        Elf max = listaElfow.get(0);
        for(Elf elf : listaElfow) {
            if(elf.getWiek() > max.getWiek()) {
                max = elf;
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "Fabryka[dlGeo= + " + getDlGeo() + ",szGeo=" + getSzGeo() + "]";
    }

    @Override
    public boolean equals(Object o) {
        Fabryka fabryka = (Fabryka) o;
        return Objects.equals(dlGeo, fabryka.dlGeo) && Objects.equals(szGeo, fabryka.szGeo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dlGeo, szGeo);
    }
}
