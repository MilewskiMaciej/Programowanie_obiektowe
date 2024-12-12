public abstract class Warzywo {
    private String nazwa;

    public Warzywo(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if(nazwa == null || nazwa.isEmpty()) {
            throw new IllegalArgumentException("Nazwa warzywa nie może być pusta");
        }
        this.nazwa = nazwa;
    }

    public abstract String smak();

    public abstract void umyj();

    public abstract void zjedz();
}
