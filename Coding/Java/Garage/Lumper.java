package Garage;

public class Lumper {
    private double estimatedValue;
    private boolean isBroken;
    private Size size;


    public Lumper(double estimatedValue, boolean isBroken, Size size) {
        this.estimatedValue = estimatedValue;
        this.isBroken = isBroken;
        this.size = size;
    }

    public double getEstimatedValue() {
        return estimatedValue;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public Size getSize() {
        return size;
    }

    public void setEstimatedValue(double estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
