package classes.exceptions.bus;

public class Bus {

    private String name;
    private Boolean isCrushed;


    public Bus(String name, Boolean isCrushed) {
        this.name = name;
        this.isCrushed = isCrushed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCrushed() {
        return isCrushed;
    }

    public void setCrushed(Boolean crushed) {
        isCrushed = crushed;
    }
}
