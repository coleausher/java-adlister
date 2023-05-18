package models;

import java.io.Serializable;
import java.time.LocalDate;

public class NationalPark implements Serializable {
    private long id;
    private String name;
    private String location;
    private LocalDate dateOfEstablishment;
    private String Description;

    public NationalPark() {};

    public NationalPark(long id, String name, String location, LocalDate localdate, String description) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    public void setDateOfEstablishment(LocalDate dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


}
