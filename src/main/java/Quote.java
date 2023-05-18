public class Quote{


    private int id;
    private String Quote;
    private String author;


    public Quote(int id, Author author, String Quote) {
        this.id = id;
        this.Quote = Quote;
        this.author = String.valueOf(author);
        }

// Getters and setters

public int getId() {
        return id;
        }

public void setId(int id) {
        this.id = id;
        }

public String getQuote() {
        return Quote;
        }

public void setQuote(String Quote) {
        this.Quote = Quote;
        }

public String getAuthor() {
        return author;
        }

public void setAuthor(Author author) {
        this.author = String.valueOf(author);
        }
        }
