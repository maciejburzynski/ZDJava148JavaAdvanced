package composition.roomByPrzemek;

public class Main {

    public static void main(String[] args) {

        Room room = new Room(48, "white",
                true, Floor.WOODEN,
                true,
                new LightSource(8, BulbType.LED_BULBS, 43),
                new Inventory(2,250, InventoryType.RADIO, new Radio(2007, 54, 40, true, true)));


        System.out.println(room.toString());

    }
}
