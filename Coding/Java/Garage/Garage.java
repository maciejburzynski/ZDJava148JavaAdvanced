package Garage;

import java.util.ArrayList;

public class Garage {
    private double length;
    private double width;
    private double height;
    private boolean isFreeStanding;
    private boolean isLight;
    private boolean isHeat;
    private boolean isWindow;
    private int parkingPlaces;
    private ArrayList<Lumper> lumpers;

    public Garage(double length, double width, double height, boolean isFreeStanding, boolean isLight, boolean isHeat, boolean isWindow, int parkingPlaces, ArrayList<Lumper> lumpers) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.isFreeStanding = isFreeStanding;
        this.isLight = isLight;
        this.isHeat = isHeat;
        this.isWindow = isWindow;
        this.parkingPlaces = parkingPlaces;
        this.lumpers = lumpers;
    }
    public double calculateTotalLumpersValue() {
        double totalValue = 0;
        for(Lumper lumper : lumpers) {
            totalValue += lumper.getEstimatedValue();
        }
        return totalValue;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean isFreeStanding() {
        return isFreeStanding;
    }

    public boolean isLight() {
        return isLight;
    }

    public boolean isHeat() {
        return isHeat;
    }

    public boolean isWindow() {
        return isWindow;
    }

    public int getParkingPlaces() {
        return parkingPlaces;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setFreeStanding(boolean freeStanding) {
        isFreeStanding = freeStanding;
    }

    public void setLight(boolean light) {
        isLight = light;
    }

    public void setHeat(boolean heat) {
        isHeat = heat;
    }

    public void setWindow(boolean window) {
        isWindow = window;
    }

    public void setParkingPlaces(int parkingPlaces) {
        this.parkingPlaces = parkingPlaces;
    }
    public ArrayList<Lumper> getLumpers() {
        return lumpers;
    }

    public void setLumpers(ArrayList<Lumper> lumpers) {
        this.lumpers = lumpers;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", isFreeStanding=" + isFreeStanding +
                ", isLight=" + isLight +
                ", isHeat=" + isHeat +
                ", isWindow=" + isWindow +
                ", parkingPlaces=" + parkingPlaces +
                '}';
    }
}
