public abstract class Ubranie {
    private String typ;

    public Ubranie(String typ) {
        this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        if(typ == null || typ.isEmpty()) {
            throw new IllegalArgumentException("Typ ubrania nie może być pusty");
        }
        this.typ = typ;
    }

    public abstract void wypierz();

    public abstract void zaloz();

    public abstract void wyprasuj();

    public abstract void wysusz();

    public abstract void zniszcz();
}
