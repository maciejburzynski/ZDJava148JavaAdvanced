package composition.room;

public class Main {
    public static void main(String[] args) {
        Room livingRoom = new Room(
                20.18,
                Color.YELLOW,
                true,
                Floor.VINYL_PANELS,
                new Door(70, DoorMaterial.WOODEN),
                LightSource.LEDS);


        System.out.println(livingRoom);




    }
}
