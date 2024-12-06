public class Adres {
    private String ulica;
    private String numerDomu;
    private String numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, String numerDomu, String numerMieszkania, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public Adres(String ulica, String numerDomu, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public void pokaz() {
        System.out.println(kodPocztowy + " " + miasto);
        System.out.println(ulica + " " + numerDomu + (numerMieszkania.isEmpty() ? "" : "/" + numerMieszkania));
    }

    public boolean przed(Adres inny) {
        return this.kodPocztowy.compareTo(inny.kodPocztowy) < 0;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        if(ulica == null || ulica.isEmpty()) {
            throw new IllegalArgumentException("Ty nie muożesz mieć pustej nazwy ulicy");
        }
        this.ulica = ulica;
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        if(numerDomu == null || numerDomu.isEmpty()) {
            throw new IllegalArgumentException("Ty nie muożesz mieć pustego numeru domu");
        }
        this.numerDomu = numerDomu;
    }

    public String getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(String numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if(miasto == null || miasto.isEmpty()) {
            throw new IllegalArgumentException("Ty nie muożesz mieć pustej nazwy domu");
        }
        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if(kodPocztowy == null || kodPocztowy.isEmpty()) {
            throw new IllegalArgumentException("Ty nie muożesz mieć pustego kodu pocztowego");
        }
        this.kodPocztowy = kodPocztowy;
    }
}
