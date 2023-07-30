package composition.room;

public class Room {

    private double area;
    private Color color;
    private boolean isWindow;
    private Floor floor;
    private Door door;
    private LightSource lightSource;

    public Room(double area, Color color, boolean isWindow, Floor floor, Door door, LightSource lightSource) {
        this.area = area;
        this.color = color;
        this.isWindow = isWindow;
        this.floor = floor;
        this.door = door;
        this.lightSource = lightSource;
    }


    @Override
    public String toString() {
        return "Room{" +
                "area=" + area +
                ", color=" + color +
                ", isWindow=" + isWindow +
                ", floor=" + floor +
                ", door=" + door +
                ", lightSource=" + lightSource +
                '}';
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isWindow() {
        return isWindow;
    }

    public void setWindow(boolean window) {
        isWindow = window;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public LightSource getLightSource() {
        return lightSource;
    }

    public void setLightSource(LightSource lightSource) {
        this.lightSource = lightSource;
    }
}
