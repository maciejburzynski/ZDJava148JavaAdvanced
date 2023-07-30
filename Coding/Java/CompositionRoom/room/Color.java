package CompositionRoom.room;

public enum Color {

    WHITE("White",true),
    BLACK("Black",false),
    YELLOW("Yellow",true),
    BLUE("Blue",true),
    RED("Red",false),
    ;

    private String value;
    private boolean isWashable;


    Color(String value, boolean isWashable) {
        this.value = value;
        this.isWashable = isWashable;
    }

    public String getValue() {
        return value;
    }

    public boolean isWashable() {
        return isWashable;
    }
}
