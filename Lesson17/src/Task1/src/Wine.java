package Task1.src;

import java.time.LocalDate;
import java.time.Period;


public class Wine {
    private String name;
    private String trademark;
    private String country;
    private LocalDate bottlingDate;
    private String description;

    public Wine() {
    }

    public Wine(String name, String trademark, String country, LocalDate bottlingDate, String description) {
        this.name = name;
        this.trademark = trademark;
        this.country = country;
        this.bottlingDate = bottlingDate;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getBottlingDate() {
        return bottlingDate;
    }

    public void setBottlingDate(LocalDate bottlingDate) {
        this.bottlingDate = bottlingDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int countYearsOfWine(LocalDate date){
        return Period.between(bottlingDate, date).getYears();
    }

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", trademark='" + trademark + '\'' +
                ", country='" + country + '\'' +
                ", bottlingDate=" + bottlingDate +
                ", description='" + description + '\'' +
                '}';
    }
}
