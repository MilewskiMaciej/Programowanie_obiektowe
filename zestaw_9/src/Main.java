public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Bite of '87", "Scott Cawthon");
        book.addReview(4.5);
        book.addReview(5.0);
        book.addReview(1.0);
        book.removeReview(5.0);
        System.out.println(book);

        FantasyBook fantasybook = new FantasyBook("Orbit", "J.R.R. Tolkien", "High Fantasy");
        fantasybook.addReview(1.0);
        fantasybook.addReview(1.5);
        System.out.println(fantasybook);

        FantasyBook fantasybook2 = new FantasyBook("Orbit", "J.R.R. Tolkien", "Low Fantasy");
        fantasybook2.addReview(1.0);
        fantasybook2.addReview(1.5);
        System.out.println(fantasybook2);
        System.out.println(fantasybook.equals(fantasybook2));
    }
}