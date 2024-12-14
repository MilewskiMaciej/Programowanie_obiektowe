import java.util.Objects;

public final class ImmutableBook {
    private final String title;
    private final String author;
    private final String isbn;

    public ImmutableBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "ImmutableBook{" + "title="+ title + ", author=" + author + ", isbn=" + isbn + "}";
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        ImmutableBook that = (ImmutableBook) o;
        return Objects.equals(title, that.title) && Objects.equals(author, that.author) && Objects.equals(isbn, that.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, isbn);
    }
}
