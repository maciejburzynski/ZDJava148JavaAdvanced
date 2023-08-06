//package composition.room;
//
//public class Room {
//
//
//    private double area;
//    private composition.room.Color color;
//    private boolean isWindow;
//    private composition.room.Floor floor;
//    private composition.room.Door door;
//    private composition.room.LightSource lightSource;
//
//    public Room(double area, composition.room.Color color, boolean isWindow, composition.room.Floor floor, composition.room.Door door, composition.room.LightSource lightSource) {
//        this.area = area;
//        this.color = color;
//        this.isWindow = isWindow;
//        this.floor = floor;
//        this.door = door;
//        this.lightSource = lightSource;
//    }
//
//
//
//    @Override
//    public String toString() {
//        return "Room{" +
//                "area=" + area +
//                ", color=" + color +
//                ", isWindow=" + isWindow +
//                ", floor=" + floor +
//                ", door=" + door +
//                ", lightSource=" + lightSource +
//                '}';
//    }
//
//    public double getArea() {
//        return area;
//    }
//
//    public void setArea(double area) {
//        this.area = area;
//    }
//
//    public composition.room.Color getColor() {
//        return color;
//    }
//
//    public void setColor(composition.room.Color color) {
//        this.color = color;
//    }
//
//    public boolean isWindow() {
//        return isWindow;
//    }
//
//    public void setWindow(boolean window) {
//        isWindow = window;
//    }
//
//    public composition.room.Floor getFloor() {
//        return floor;
//    }
//
//    public void setFloor(composition.room.Floor floor) {
//        this.floor = floor;
//    }
//
//    public composition.room.Door getDoor() {
//        return door;
//    }
//
//    public void setDoor(composition.room.Door door) {
//        this.door = door;
//    }
//
//    public composition.room.LightSource getLightSource() {
//        return lightSource;
//    }
//
//    public void setLightSource(composition.room.LightSource lightSource) {
//        this.lightSource = lightSource;
//    }
//}
