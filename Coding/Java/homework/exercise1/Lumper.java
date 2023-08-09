package homework.exercise1;

public class Lumper {
    private String name;
    private double estimatedValue;
    private boolean isBroken;
    private Size size;

    public Lumper() {
    }

    public Lumper(String name, double estimatedValue, boolean isBroken, Size size) {
        this.name = name;
        this.estimatedValue = estimatedValue;
        this.isBroken = isBroken;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(double estimatedValue) {
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
