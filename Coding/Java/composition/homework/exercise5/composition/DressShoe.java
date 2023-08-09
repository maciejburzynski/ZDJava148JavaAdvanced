package composition.homework.exercise5.composition;

public class DressShoe {
    private Shoe shoe;
    private Material material;

    private Occasion occasion;

    private double heelHeight;

    private boolean pointedToe;

    public DressShoe(Shoe shoe, Material material, Occasion occasion, double heelHeight, boolean pointedToe) {
        this.shoe = shoe;
        this.material = material;
        this.occasion = occasion;
        this.heelHeight = heelHeight;
        this.pointedToe = pointedToe;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Occasion getOccasion() {
        return occasion;
    }

    public void setOccasion(Occasion occasion) {
        this.occasion = occasion;
    }

    public double getHeelHeight() {
        return heelHeight;
    }

    public void setHeelHeight(double heelHeight) {
        this.heelHeight = heelHeight;
    }

    public boolean isPointedToe() {
        return pointedToe;
    }

    public void setPointedToe(boolean pointedToe) {
        this.pointedToe = pointedToe;
    }

    @Override
    public String toString() {
        return "DressShoe{" +
                "shoe=" + shoe +
                ", material=" + material +
                ", occasion=" + occasion +
                ", heelHeight=" + heelHeight +
                ", pointedToe=" + pointedToe +
                '}';
    }
}
