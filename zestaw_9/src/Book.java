import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private double[] reviews;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.reviews = new double[0];
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double[] getReviews() {
        return reviews;
    }

    public void addReview(double review) {
        reviews = Arrays.copyOf(reviews, reviews.length + 1);
        reviews[reviews.length - 1] = review;
    }

    public void removeReview(double review) {
        reviews = Arrays.stream(reviews).filter(r -> r != review).toArray();
    }

    @Override
    public String toString() {
        return "Book: title - " + title + ", author - " + author + ", review - " + Arrays.toString(reviews);
    }

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
