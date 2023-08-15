package homework.inheritance;

import homework.composition.Size;
import homework.composition.Sole.Sole;

public class DressShoe extends Shoe{
    private double heelHeight;
    private Material material;
    private String color;
    public DressShoe(String name, Size size, Sole sole, boolean isLeather, boolean isComfortable) {
        super(name, size, sole, isLeather, isComfortable);
    }

    public DressShoe(String name, Size size, Sole sole, boolean isLeather, boolean isComfortable, double heelHeight, Material material, String color) {
        super(name, size, sole, isLeather, isComfortable);
        this.heelHeight = heelHeight;
        this.material = material;
        this.color = color;
    }

    public double getHeelHeight() {
        return heelHeight;
    }

    public void setHeelHeight(double heelHeight) {
        this.heelHeight = heelHeight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "DressShoe{" +
                "heelHeight=" + heelHeight +
                ", material=" + material +
                ", color='" + color + '\'' +
                '}';
    }
}
