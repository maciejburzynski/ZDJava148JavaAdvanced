package composition.garage;

import java.util.Set;


public class Garage {

    private Double length;
    private Double width;
    private Double height;
    private Boolean isHeated;
    private Boolean isFreestanding;
    private Boolean isLight;
    private Boolean isWindow;
    private Integer numberOfParkingSpaces;
    private Set<Lumper> lumpers;

    public Garage(Double length, Double width, Double height, Boolean isHeated, Boolean isFreestanding, Boolean isLight, Boolean isWindow, Integer numberOfParkingSpaces, Set<Lumper> lumpers) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.isHeated = isHeated;
        this.isFreestanding = isFreestanding;
        this.isLight = isLight;
        this.isWindow = isWindow;
        this.numberOfParkingSpaces = numberOfParkingSpaces;
        this.lumpers = lumpers;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Boolean getHeated() {
        return isHeated;
    }

    public void setHeated(Boolean heated) {
        isHeated = heated;
    }

    public Boolean getFreestanding() {
        return isFreestanding;
    }

    public void setFreestanding(Boolean freestanding) {
        isFreestanding = freestanding;
    }

    public Boolean getLight() {
        return isLight;
    }

    public void setLight(Boolean light) {
        isLight = light;
    }

    public Boolean getWindow() {
        return isWindow;
    }

    public void setWindow(Boolean window) {
        isWindow = window;
    }

    public Integer getNumberOfParkingSpaces() {
        return numberOfParkingSpaces;
    }

    public void setNumberOfParkingSpaces(Integer numberOfParkingSpaces) {
        this.numberOfParkingSpaces = numberOfParkingSpaces;
    }

    public Set<Lumper> getLumpers() {
        return lumpers;
    }

    public void setLumpers(Set<Lumper> lumpers) {
        this.lumpers = lumpers;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", isHeated=" + isHeated +
                ", isFreestanding=" + isFreestanding +
                ", isLight=" + isLight +
                ", isWindow=" + isWindow +
                ", numberOfParkingSpaces=" + numberOfParkingSpaces +
                ", lumpers=" + lumpers +
                '}';
    }
}
