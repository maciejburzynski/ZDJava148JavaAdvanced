package homework.composition;

public enum Size {
    SIZE_38 (38),
    SIZE_39 (39),
    SIZE_40 (40),
    SIZE_41 (41),
    SIZE_42 (42),
    ;

    private int size;

    Size(int size) {
        this.size = size;


    }

    @Override
    public String toString() {
        return "{" +
                size +
                '}';
    }
}
