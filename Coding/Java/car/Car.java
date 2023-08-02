package car;

public enum Car {
    FERRARI("Ferrari",1000000, 600),
    PORSCHE("Porsche",900000, 550),
    MERCEDES("Mercedes",950000, 400),
    BMW("Bmw",500000, 400),
    OPEL("Opel",100000, 200),
    FIAT("Fiat",80000, 120),
    TOYOTA("Toyota",90000, 150);
    private String name;
    private double price;
    private double horsePower;
    Car (String name, double price, double housePower) {
        this.name = name;
        this.price = price;
        this.horsePower = horsePower;
    }
    public boolean isPremium () {
        return this.price > 100000;
    }
    public boolean isRegular () {
        return !isPremium();
    }
    public boolean isFasterThan(Car otherCar) {
        double result = this.horsePower - otherCar.horsePower;
        if (result > 0) {
            System.out.println(this.name + " jest szybszy od " + otherCar.name);
        } else if (result < 0) {
            System.out.println(this.name + " nie jest szybszy od " + otherCar.name);
        } else {
            System.out.println(this.name + " i " + otherCar.name + " mają taką samą moc");
        }
        return result > 0;
    }
}
