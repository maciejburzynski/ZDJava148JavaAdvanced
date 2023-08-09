package homework.exercise3;

public class Vehicle implements Comparable<Vehicle>{
    private int yearOfProduction;
    private int serialNumber;

    private Car car;

    public Vehicle(int yearOfProduction, int serialNumber, Car car) {
        this.yearOfProduction = yearOfProduction;
        this.serialNumber = serialNumber;
        this.car = car;
    }




    @Override
    public int compareTo(Vehicle other) {
        return Integer.compare(this.yearOfProduction, other.yearOfProduction);
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "yearOfProduction=" + yearOfProduction +
                ", serialNumber=" + serialNumber +
                ", car=" + car +
                '}';
    }
}







