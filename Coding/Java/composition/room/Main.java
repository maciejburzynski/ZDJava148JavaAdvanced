package composition.room;

public class Main {
    public static void main(String[] args) {
        Room livingRoom = new Room(
                20.18,
                Color.RED,
                true,
                Floor.LAMINATED_PANELS,
                new Door (70, DoorMaterial.WOODEN),
                LightSource.LEDS);

        System.out.println(livingRoom);
    }
}
