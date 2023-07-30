package composition.roomByPrzemek;


public  class Inventory  {


    private int quantity;
    private int price;
    private InventoryType ineventoryType;

    public Inventory(int quantity, int price, InventoryType ineventoryType) {
        this.quantity = quantity;
        this.price = price;
        this.ineventoryType = ineventoryType;
    }

    public Inventory(int quantity, int price, InventoryType radio, Radio radio1) {
    }
    public Inventory(int quantity, int price, InventoryType television, Television television1) {
    }



}
