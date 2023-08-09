package composition.homework.exercise5.composition;

import composition.homework.exercise5.composition.shoelace.Shoelace;

public class Shoe {
    private String brand;

    private Size size;

    private Shoelace shoelace;
    private  boolean isLeather;
    private boolean isComfortable;

    public Shoe(String brand, Size size, Shoelace shoelace, boolean isLeather, boolean isComfortable) {
        this.brand = brand;
        this.size = size;
        this.shoelace = shoelace;
        this.isLeather = isLeather;
        this.isComfortable = isComfortable;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isLeather() {
        return isLeather;
    }

    public void setLeather(boolean leather) {
        isLeather = leather;
    }

    public boolean isComfortable() {
        return isComfortable;
    }

    public void setComfortable(boolean comfortable) {
        isComfortable = comfortable;
    }



    public Shoelace getShoelace() {
        return shoelace;
    }

    public void setShoelace(Shoelace shoelace) {
        this.shoelace = shoelace;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "name='" + brand + '\'' +
                ", size" +  size +", " +shoelace+
                ", isLeather=" + isLeather +
                ", isComfortable=" + isComfortable +
                '}';
    }
}
