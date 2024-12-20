import java.util.Objects;

public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;

    public Elf(String imie, int wiek, String stanowisko) {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
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

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek < 0) {
            throw new IllegalArgumentException("Wiek nie może być ujemny");
        }
        this.wiek = wiek;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        if(stanowisko == null || stanowisko.isEmpty()) {
            throw new IllegalArgumentException("Stanowisko nie może być puste");
        }
        this.stanowisko = stanowisko;
    }

    public void przedstawSie() {
        System.out.println("Cześć, nazywam się " + imie + ", mam " + wiek + " lat, a moje stanowisko pracy to " + stanowisko);
    }

    @Override
    public String toString() {
        return "Elf[imie=" + getImie() + ",wiek=" + wiek + ",stanowisko=" + stanowisko + "]";
    }

    @Override
    public boolean equals(Object o) {
        Elf elf = (Elf) o;
        return Objects.equals(imie, elf.imie) && Objects.equals(wiek, elf.wiek) && Objects.equals(stanowisko, elf.stanowisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, wiek, stanowisko);
    }
}
