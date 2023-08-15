package homework.inheritance;

import homework.composition.Size;
import homework.composition.Sole.Sole;

public class Shoe {
    protected String name;
    protected Size1 size;
    protected Sole sole;
    protected boolean isLeather;
    protected boolean isComfortable;

    public Shoe(String name, Size1 size, Sole sole, boolean isLeather, boolean isComfortable) {
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

    public Size1 getSize() {
        return size;
    }

    public void setSize(Size1 size) {
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
        return "Shoe{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", sole=" + sole +
                ", isLeather=" + isLeather +
                ", isComfortable=" + isComfortable +
                '}';
    }
}
