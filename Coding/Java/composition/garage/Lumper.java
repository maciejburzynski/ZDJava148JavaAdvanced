package composition.garage;

public class Lumper {

    private String name;
    private int estimatedValue;
    boolean isBroken;
    private Size size;

    public Lumper(String name, int estimatedValue, boolean isBroken, Size size) {
        this.estimatedValue = estimatedValue;
        this.isBroken = isBroken;
        this.size = size;
        this.name = name;
    }

    public int getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(int estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lumper{" +
                "name='" + name + '\'' +
                ", estimatedValue=" + estimatedValue +
                ", isBroken=" + isBroken +
                ", size=" + size +
                '}';
    }
}
