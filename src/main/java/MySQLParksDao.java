import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MySQLParksDao implements Parks{

    private Connection connection;
    private Config config = new Config();


    public MySQLParksDao() {
    try{
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection( config.getUrl(), config.getUser(), config.getPassword());

    }catch(Exception e){
        throw new RuntimeException("Error connecting to database.");
        }
    }



    @Override
    public List<Park> allParks() {
        try{
            Statement statement = connection.createStatement();

            String selectParks = "SELECT * FROM national_parks";

            ResultSet rs = statement.executeQuery(selectParks);

            List<Park> parks = new ArrayList<>();

            while(rs.next()){
//                System.out.println("id: " + rs.getLong("id"));
//                System.out.println("name: " + rs.getString("name"));
//                System.out.println("description: " + rs.getString("description"));
//                System.out.println("location: " + rs.getString("location"));
                parks.add(new Park(rs.getLong("id"), rs.getString("name"), rs.getString("description"), rs.getString("location")));
            }



            return parks;





        }catch(Exception e){
            throw new RuntimeException("Error creating statement");
        }
    }






    // insert parks
    @Override
    public void insertPark(String name, String description, String location) {
        try{
            Statement statement = connection.createStatement();

            statement.executeUpdate("INSERT INTO national_parks(name, description, location) VALUES('' + name + ',' + desription + ',' + location + )");

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()){
                System.out.println("New record has been inserted!");
            }


        }catch(Exception e){
            throw new RuntimeException("Error adding park to database");
        }
    }
}
