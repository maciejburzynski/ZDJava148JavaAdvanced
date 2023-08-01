package composition.homework.exercise1;
import java.util.List;

public class Garage {
    private int garageNumber;
    private double length;
    private double width;
    private double height;
    private boolean isFreeStanding;
    private boolean isHeated;
    private boolean isLighted;
    private boolean haveWindows;
    private int numberOfParkingSpaces;
    private List<Lumper> lumpers;

    private static int nextGarageNumber = 1;

    public Garage(double length, double width, double height, boolean isFreeStanding, boolean isHeated,
                  boolean isLighted, boolean haveWindows, int numberOfParkingSpaces, List<Lumper> lumpers) {
        this.garageNumber = generateGarageNumber();
        this.length = length;
        this.width = width;
        this.height = height;
        this.isFreeStanding = isFreeStanding;
        this.isHeated = isHeated;
        this.isLighted = isLighted;
        this.haveWindows = haveWindows;
        this.numberOfParkingSpaces = numberOfParkingSpaces;
        this.lumpers = lumpers;
    }

    private int generateGarageNumber() {
        return nextGarageNumber++;
    }

    public int getGarageNumber() {
        return garageNumber;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
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

    public boolean isFreeStanding() {
        return isFreeStanding;
    }

    public void setFreeStanding(boolean freeStanding) {
        isFreeStanding = freeStanding;
    }

    public boolean isHeated() {
        return isHeated;
    }

    public void setHeated(boolean heated) {
        isHeated = heated;
    }

    public boolean isLighted() {
        return isLighted;
    }

    public void setLighted(boolean lighted) {
        isLighted = lighted;
    }

    public boolean isHaveWindows() {
        return haveWindows;
    }

    public void setHaveWindows(boolean haveWindows) {
        this.haveWindows = haveWindows;
    }

    public int getNumberOfParkingSpaces() {
        return numberOfParkingSpaces;
    }

    public void setNumberOfParkingSpaces(int numberOfParkingSpaces) {
        this.numberOfParkingSpaces = numberOfParkingSpaces;
    }

    public List<Lumper> getLumpers() {
        return lumpers;
    }

    public void setLumpers(List<Lumper> lumpers) {
        this.lumpers = lumpers;
    }


    public int lumpersTotalPrice(){
        double totalPrice = 0;
        for(Lumper lump: lumpers)
            totalPrice+= lump.getEstimatedValue();
        return (int) totalPrice;}


    @Override
    public String toString() {
        return "Garage{" +
                "Garage number: " + garageNumber +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", isFreeStanding=" + isFreeStanding +
                ", isHeated=" + isHeated +
                ", isLighted=" + isLighted +
                ", haveWindows=" + haveWindows +
                ", numberOfParkingSpaces=" + numberOfParkingSpaces +
                ", lumpers=" + lumpers +
                '}';
    }




}

