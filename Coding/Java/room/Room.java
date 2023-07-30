package room;

public class Room {
    private double area;
    private String color;
    private boolean isWindow;
    private Floor floor;
    private String door;
    private lightSource lightSource;
    public Room (double area, String color, boolean isWindow, Floor floor, String door, lightSource lightSource) {
        this.area = area;
        this.color = color;
        this.isWindow = isWindow;
        this.floor = floor;
        this.door = door;
        this.lightSource = lightSource;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public boolean isWindow() {
        return isWindow;
    }

    public Floor getFloor() {
        return floor;
    }

    public String getDoor() {
        return door;
    }

    public room.lightSource getLightSource() {
        return lightSource;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWindow(boolean window) {
        isWindow = window;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public void setLightSource(room.lightSource lightSource) {
        this.lightSource = lightSource;
    }
}
