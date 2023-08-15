package homework.composition;

public class DressShoe {
    private Shoe shoe;
    private double heelHeight;
    private Material material;
    private String color;

    public DressShoe(Shoe shoe, double heelHeight, Material material, String color) {
        this.shoe = shoe;
        this.heelHeight = heelHeight;
        this.material = material;
        this.color = color;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
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
                "shoe=" + shoe +
                ", heelHeight=" + heelHeight +
                ", material=" + material +
                ", color='" + color + '\'' +
                '}';
    }
}
