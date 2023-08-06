package classes.exceptions.exercise;

public class Bus {
    private String name;
    private Boolean isCrashed;

    public Bus() {
    }

    public Bus(String name, Boolean isCrashed) {
        this.name = name;
        this.isCrashed = isCrashed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsCrashed() {
        return isCrashed;
    }

    public void setIsCrashed(Boolean crashed) {
        isCrashed = crashed;
    }
}
