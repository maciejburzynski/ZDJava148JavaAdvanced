package composition;

public enum Color {
    RED("Red");
    BLUE("Blue");
    WHITE("White");
    GREEN("Green");
    BLACK("Black");

    private String stringValue;

    Color(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}
