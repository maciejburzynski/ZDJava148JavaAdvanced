package composition.room;

public class Door {

    private int size;
    private DoorMaterial doorMaterial;

    public Door(int size, DoorMaterial doorMaterial) {
        this.size = size;
        this.doorMaterial = doorMaterial;
    }

    @Override
    public String toString() {
        return "Door{" +
                "size=" + size +
                ", doorMaterial=" + doorMaterial +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DoorMaterial getDoorMaterial() {
        return doorMaterial;
    }

    public void setDoorMaterial(DoorMaterial doorMaterial) {
        this.doorMaterial = doorMaterial;
    }
}
