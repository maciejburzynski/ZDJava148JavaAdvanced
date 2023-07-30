package composition.romm;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String area;
    private String color;
    private boolean isWindow;

    private Floor floor;

    private Door door;

    

    private LightSource lightSource;

    List<Inventory> inventoryList  = new ArrayList();

    public Room() {
    }

    public Room(String area, String color, boolean isWindow, Floor floor, Door door, LightSource lightSource, List<Inventory> inventoryList) {
        this.area = area;
        this.color = color;
        this.isWindow = isWindow;
        this.floor = floor;
        this.door = door;
        this.lightSource = lightSource;
        this.inventoryList = inventoryList;
    }

    public Room(int i, String white, boolean isWindow, Floor wooden, boolean b, LightSource lightSource, Inventory inventory) {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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

    public LightSource getLightSource() {
        return lightSource;
    }

    public void setLightSource(LightSource lightSource) {
        this.lightSource = lightSource;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public List<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }

    @Override
    public String toString() {
        return "Room{" +
                "area='" + area + '\'' +
                ", color='" + color + '\'' +
                ", isWindow=" + isWindow +
                ", floor=" + floor +
                ", door=" + door +
                ", lightSource=" + lightSource +
                ", inventoryList=" + inventoryList +
                '}';
    }
}
