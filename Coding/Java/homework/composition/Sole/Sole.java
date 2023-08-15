package homework.composition.Sole;

public class Sole {
    private Material material;
    private Color color;

    public Sole(Material material, Color color) {
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return "material=" + material +
                ", color=" + color +
                '}';
    }
}
