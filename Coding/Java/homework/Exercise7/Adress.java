package homework.Exercise7;

public class Adress {

    private String zipCode;
    private String city;
    private String street;

    private String numberOfStreet;
    private String numberofHouse;

    public Adress(String zipCode,String city, String street,  String numberOfStreet, String numberofHouse) {
        this.zipCode = zipCode;
        this.city = city;
        this.street = street;
        this.numberOfStreet = numberOfStreet;
        this.numberofHouse = numberofHouse;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumberOfStreet() {
        return numberOfStreet;
    }

    public void setNumberOfStreet(String numberOfStreet) {
        this.numberOfStreet = numberOfStreet;
    }

    public String getNumberofHouse() {
        return numberofHouse;
    }

    public void setNumberofHouse(String numberofHouse) {
        this.numberofHouse = numberofHouse;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "zipCode='" + zipCode + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", numberOfStreet='" + numberOfStreet + '\'' +
                ", numberofHouse='" + numberofHouse + '\'' +
                '}';
    }
}
