public class Quote{



    private String Quote;
    private String author;


    public Quote( Author author, String Quote) {
        this.Quote = Quote;
        this.author = String.valueOf(author);
        }

// Getters and setters

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
