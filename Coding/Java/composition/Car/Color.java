package composition.Car;

public enum Color {
    RED("Red"),
    BLUE("Blue"),
    WHITE("White"),
    GREEN("Green"),
    BLACK("Black"),
    ORANGE("Orange");

    private String stringValue;

    Color(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}
