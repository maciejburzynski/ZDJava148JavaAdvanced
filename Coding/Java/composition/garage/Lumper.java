package composition.garage;


public class Lumper {

    private String name;
    private Double estimatedValue;
    private Boolean isBroken;
    private Size size;

    public Lumper(String name, Double estimatedValue, Boolean isBroken, Size size) {
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

    public Double getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(Double estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public Boolean getBroken() {
        return isBroken;
    }

    public void setBroken(Boolean broken) {
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
