import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        // Create instances of Album
        Album album1 = new Album();
        Album album2 = new Album();

        // Create instances of Author
        Author author1 = new Author(1, "Amelia Earhart");
        Author author2 = new Author(2, "Woody Allen");

        // Create instances of Quote with associated Author and Album
        Quote quote1 = new Quote(author1, "The most difficult thing is the decision to act, the rest is merely tenacity.");
        Quote quote2 = new Quote(author2, "Eighty percent of success is showing up.");

        // Create an ArrayList to store Quote instances
        List<Quote> quotes = new ArrayList<>();


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
