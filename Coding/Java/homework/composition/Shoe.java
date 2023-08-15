package homework.composition;

import homework.composition.Sole.Sole;

public class Shoe {
    private String name;
    private Size size;
    private Sole sole;
    private boolean isLeather;
    private boolean isComfortable;

    public Shoe(String name, Size size, Sole sole, boolean isLeather, boolean isComfortable) {
        this.name = name;
        this.size = size;
        this.sole = sole;
        this.isLeather = isLeather;
        this.isComfortable = isComfortable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Sole getSole() {
        return sole;
    }

    public void setSole(Sole sole) {
        this.sole = sole;
    }

    public boolean isLeather() {
        return isLeather;
    }

    public void setLeather(boolean leather) {
        isLeather = leather;
    }

    public boolean isComfortable() {
        return isComfortable;
    }

    public void setComfortable(boolean comfortable) {
        isComfortable = comfortable;
    }

    @Override
    public String toString() {
        return
                " name='" + name + '\'' +
                ", size= " + size +
                ", sole= " + sole +
                ", isLeather= " + isLeather +
                ", isComfortable= " + isComfortable +
                '}';
    }
}
