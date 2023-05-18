import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
    private long id;
    private String artistName;
    private String recordName;
    private Date releaseDate;
    private long sales;
    private String genre;


    public Album(){}

    public Album(long id, long sales, String artistName, String recordName, String genre, Date releaseDate, Date hireDate) {
        this.id = id;
        this.artistName = artistName;
        this.recordName = recordName;
        this.releaseDate = releaseDate;
        this.sales = sales;
        this.genre = genre;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public long getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
