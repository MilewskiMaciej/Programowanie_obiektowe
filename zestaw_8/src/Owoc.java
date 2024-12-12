public abstract class Owoc {
    private String nazwa;

    public Owoc(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if(nazwa == null || nazwa.isEmpty()) {
            throw new IllegalArgumentException("Nazwa owocu nie może być pusta");
        }
        this.nazwa = nazwa;
    }

    public abstract String smak();

    public abstract void umyj();

    public abstract void zjedz();
}
