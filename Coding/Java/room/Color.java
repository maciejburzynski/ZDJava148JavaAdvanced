package room;
public enum Color {
    RED("Red"),
    BLUE("Blue"),
    WHITE("White"),
    GREEN("Green"),
    BLACK("Black"),
    ORANGE("Orange");
    String stringValue;
    Color(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}
