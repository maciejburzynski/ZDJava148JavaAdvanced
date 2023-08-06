package classes.exceptions.Room;

import composition.room.Color;

public class Room {

    private String name;
    private Color color;

    public Room() {
    }

    public Room(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
