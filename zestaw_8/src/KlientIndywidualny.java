public class KlientIndywidualny extends Klient {
    private final String PESEL;

    public KlientIndywidualny(String imie, String nazwisko, Adres adres, String PESEL) {
        super(imie, nazwisko, adres);
        if(PESEL == null || PESEL.isEmpty() || !PESEL.matches("\\{11}")) {
            throw new IllegalArgumentException("Nieprawidłowy PESEL.");
        }
        this.PESEL = PESEL;
    }

    public String getPESEL() {
        return PESEL;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + PESEL.hashCode();
    }
}
