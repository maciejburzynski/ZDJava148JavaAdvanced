package homework.inheritance;

public enum Size1 {
    SIZE_38 (38),
    SIZE_39 (39),
    SIZE_40 (40),
    SIZE_41 (41),
    SIZE_42 (42),
    ;

    public final int size;

    Size1(int size) {
        this.size = size;


    }

    @Override
    public String toString() {
        return "{" +
                size +
                '}';
    }
}
