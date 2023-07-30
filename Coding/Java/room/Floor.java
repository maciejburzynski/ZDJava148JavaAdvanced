package room;

public class Floor {
    private String producer;
    private String type;
    private String color;

    public Floor (String producer, String type, String color) {
        this.producer = producer;
        this.type = type;
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
