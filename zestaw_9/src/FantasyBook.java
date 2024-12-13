import java.util.Objects;
import java.util.Arrays;

public class FantasyBook extends Book {
    private String fantasySubgenre;

    public FantasyBook(String title, String author, String fantasySubgenre) {
        super(title, author);
        this.fantasySubgenre = fantasySubgenre;
    }

    public String getFantasySubgenre() {
        return fantasySubgenre;
    }

    public void setFantasySubgenre(String fantasySubgenre) {
        this.fantasySubgenre = fantasySubgenre;
    }

    @Override
    public String toString() {
        return "Fantasy Book: title - " + getTitle() + ", author - " + getAuthor() + ", reviews - " + Arrays.toString(getReviews()) + ", fantasy subgenre - " + getFantasySubgenre();
    }

    @Override
    public boolean equals(Object o) {
        return fantasySubgenre.equals(this.fantasySubgenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fantasySubgenre);
    }
}
