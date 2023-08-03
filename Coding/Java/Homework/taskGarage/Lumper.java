package Homework.taskGarage;

public class Lumper {
    private double value;
    private boolean isBroken;
    private Size size;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
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

    public Lumper(double value, boolean isBroken, Size size) {
        this.value = value;
        this.isBroken = isBroken;
        this.size = size;
    }
}
