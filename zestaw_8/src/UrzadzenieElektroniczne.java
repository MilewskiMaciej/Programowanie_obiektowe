public abstract class UrzadzenieElektroniczne {
    private String nazwa;

    public UrzadzenieElektroniczne(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if(nazwa == null || nazwa.isEmpty()) {
            throw new IllegalArgumentException("Nazwa urzadzenia nie moze byc pusta");
        }
        this.nazwa = nazwa;
    }

    public abstract void napraw();

    public abstract void uzyj();

    public abstract void zepsuj();

    public abstract void wlacz();

    public abstract void wylacz();
}
