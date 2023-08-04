package composition.garage;

import java.util.HashSet;
import java.util.Set;

public class Garage {
    private int garageNum;
    private double height;
    private double width;
    private double length;
    private boolean isWindow;
    private int numOfParkingSpaces;
    private boolean isHeated;
    private Set<Lumper> lumpers;

    public Garage(int garageNum,
                  double height,
                  double width,
                  double length,
                  boolean isWindow,
                  int numOfParkingSpaces,
                  boolean isHeated) {
        this.garageNum = garageNum;
        this.height = height;
        this.width = width;
        this.length = length;
        this.isWindow = isWindow;
        this.numOfParkingSpaces = numOfParkingSpaces;
        this.isHeated = isHeated;
        this.lumpers = new HashSet<>();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isWindow() {
        return isWindow;
    }

    public void setWindow(boolean window) {
        isWindow = window;
    }

    public int getNumOfParkingSpaces() {
        return numOfParkingSpaces;
    }

    public void setNumOfParkingSpaces(int numOfParkingSpaces) {
        this.numOfParkingSpaces = numOfParkingSpaces;
    }

    public boolean isHeated() {
        return isHeated;
    }

    public void setHeated(boolean heated) {
        isHeated = heated;
    }

    public Set<Lumper> getLumpers() {
        return lumpers;
    }

    public void setLumpers(Set<Lumper> lumpers) {
        this.lumpers = lumpers;
    }

    public void addLumper(Lumper lumper) {

        lumpers.add(lumper);
    }

    public void removeLumper(Lumper lumper) {

        lumpers.remove(lumper);
    }

    public int getGarageNum() {
        return garageNum;
    }

    public void setGarageNum(int garageNum) {
        this.garageNum = garageNum;
    }

    public int getSummaryLumpersValue(){
        int summaryLumpersValue = 0;
        for(Lumper lumper : lumpers){
            summaryLumpersValue += lumper.getEstimatedValue();
        }
        return summaryLumpersValue;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "garageNum=" + garageNum +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", isWindow=" + isWindow +
                ", numOfParkingSpaces=" + numOfParkingSpaces +
                ", isHeated=" + isHeated +
                ", lumpers=" + lumpers +
                '}';
    }
}



