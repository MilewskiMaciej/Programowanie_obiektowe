public class KlientFirmowy extends Klient {
    private final String NIP;
    private final String REGON;

    public KlientFirmowy(String imie, String nazwisko, Adres adres, String NIP, String REGON) {
        super(imie, nazwisko, adres);
        if(NIP == null || NIP.isEmpty() || !NIP.matches("\\d{10}")) {
            throw new IllegalArgumentException("Nieprawidłowy NIP.");
        }
        if (REGON == null || REGON.isEmpty() || !REGON.matches("\\d{9}")) {
            throw new IllegalArgumentException("Nieprawidłowy REGON.");
        }
        this.NIP = NIP;
        this.REGON = REGON;
    }

    public String getNIP() {
        return NIP;
    }

    public String getREGON() {
        return REGON;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + NIP.hashCode() + REGON.hashCode();
    }
}
