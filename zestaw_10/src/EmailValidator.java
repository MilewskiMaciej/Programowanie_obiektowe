class NiepoprawnyFormatDanychException extends Exception {
    public NiepoprawnyFormatDanychException(String message) {
        super(message);
    }
}

public class EmailValidator {
    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        if(!dane.matches(emailRegex)) {
            throw new NiepoprawnyFormatDanychException("Niepoprawny format danych");
        }
    }
}