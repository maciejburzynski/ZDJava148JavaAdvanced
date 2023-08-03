package Homework.taskGarage;

import java.util.List;

public class Garage {
    private double lenght;
    private double width;
    private double height;
    private boolean isFreestanding;
    private boolean isHeated;
    private boolean isWindowed;
    private int parkingSpace;
    private List<Lumper> lumpers;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isFreestanding() {
        return isFreestanding;
    }

    public void setFreestanding(boolean freestanding) {
        isFreestanding = freestanding;
    }

    public boolean isHeated() {
        return isHeated;
    }

    public void setHeated(boolean heated) {
        isHeated = heated;
    }

    public boolean isWindowed() {
        return isWindowed;
    }

    public void setWindowed(boolean windowed) {
        isWindowed = windowed;
    }

    public int getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(int parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public List<Lumper> getLumpers() {
        return lumpers;
    }

    public void setLumpers(List<Lumper> lumpers) {
        this.lumpers = lumpers;
    }

    public Garage(double lenght, double width, double height, boolean isFreestanding, boolean isHeated, boolean isWindowed, int parkingSpace, List<Lumper> lumpers) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.isFreestanding = isFreestanding;
        this.isHeated = isHeated;
        this.isWindowed = isWindowed;
        this.parkingSpace = parkingSpace;
        this.lumpers = lumpers;
    }

    public Garage() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    }

