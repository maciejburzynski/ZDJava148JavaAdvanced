package homework.exerciseSelfMade.OPTIONAL;

public class Adress {

    private String zipCode;
    private String city;
    private String street;

    private int numberOfStreet;
    private int numberofHouse;

    public Adress(String zipCode, String city, String street, int numberOfStreet, int numberofHouse) {
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfStreet() {
        return numberOfStreet;
    }

    public void setNumberOfStreet(int numberOfStreet) {
        this.numberOfStreet = numberOfStreet;
    }

    public int getNumberofHouse() {
        return numberofHouse;
    }

    public void setNumberofHouse(int numberofHouse) {
        this.numberofHouse = numberofHouse;
    }


    @Override
    public String toString() {
        return "Adress{" +
                "zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", numberOfStreet=" + numberOfStreet +
                ", numberofHouse=" + numberofHouse +
                '}';
    }
}
