package composition.romm;

public class Main {

    public static void main(String[] args) {

        Room room = new Room(48, "white",
                true, Floor.WOODEN,
                true,
                new LightSource(8, BulbType.LED_BULBS, 43),
                new Inventory(2,250, InventoryType.RADIO));


        System.out.println(room.toString());

    }
}
