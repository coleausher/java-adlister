import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
    private long id;
    private long sales;
    private String artistName;
    private String recordName;
    private String genre;
    private Date releaseDate;
    private Date hireDate;
}
