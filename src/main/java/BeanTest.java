import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        // Create instances of Album
        Album album1 = new Album();
        Album album2 = new Album();

        // Create instances of Author
        Author author1 = new Author(1, "Author 1");
        Author author2 = new Author(2, "Author 2");

        // Create instances of Quote with associated Author and Album
        Quote quote1 = new Quote(1, author1, album1.toString());
        Quote quote2 = new Quote(2, author2, album2.toString());

        // Create an ArrayList to store Quote instances
        ArrayList<Quote> quotes = new ArrayList<>();


        // Add the quotes to the ArrayList
        quotes.add(quote1);
        quotes.add(quote2);


        // Iterate over the quotes and print the content and author name
        for (Quote quote : quotes) {
            System.out.println("Quote: " + quote.getQuote());
            System.out.println("Author: " + quote.getAuthor());
            System.out.println();

        }
    }
}
