import java.util.Objects;

public class Renifer {
    private String imie;
    private int predkosc;

    public Renifer(String imie, int predkosc) {
        this.imie = imie;
        this.predkosc = predkosc;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie == null || imie.isEmpty()) {
            throw new IllegalArgumentException("Imię nie może być puste");
        }
        this.imie = imie;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        if(predkosc < 0) {
            throw new IllegalArgumentException("Prędkość nie może być ujemna");
        }
        this.predkosc = predkosc;
    }

    public void nakarmRenifera() {
        predkosc = predkosc + 5;
    }

    @Override
    public String toString() {
        return "Renifer[imie=" + getImie() + ",predkosc=" + getPredkosc() + "]";
    }

    @Override
    public boolean equals(Object o) {
        Renifer renifer = (Renifer) o;
        return Objects.equals(imie, renifer.imie) && Objects.equals(predkosc, renifer.predkosc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, predkosc);
    }
}
