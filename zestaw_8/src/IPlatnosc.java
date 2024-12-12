import java.sql.SQLOutput;

public interface IPlatnosc {
    void zaplac(double kwota);
    String getStatusPlatnosci();
    double getKwota();

    default boolean czyOplacona() {
        return "Opłacone".equals(getStatusPlatnosci());
    }

    default void wyswietlSzczegoly() {
        System.out.println("Status platnosci: " + getStatusPlatnosci());
        System.out.println("Kwota do zaplaty: " + getKwota());
    }
}
