package Exceptions.Exercise;

public class Busior {
    private String name;
    private boolean isCrushed;

    public Busior(String name, boolean isCrushed) {
        this.name = name;
        this.isCrushed = isCrushed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCrushed() {
        return isCrushed;
    }

    public void setCrushed(boolean crushed) {
        isCrushed = crushed;
    }
}
