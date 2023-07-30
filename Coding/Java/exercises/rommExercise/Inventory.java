package exercises.rommExercise;


import java.util.List;

public class Inventory implements List<Inventory> {


    private int quantity;
    private int price;
    private InventoryType ineventoryType;

    public Inventory(int quantity, int price, InventoryType ineventoryType) {
        this.quantity = quantity;
        this.price = price;
        this.ineventoryType = ineventoryType;
    }
}
