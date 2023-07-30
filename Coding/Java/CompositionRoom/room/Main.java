package CompositionRoom.room;

public class Main {
    public static void main(String[] args) {
        Room livingRoom=new Room(20.19,
                Color.YELLOW,
                true,Floor.VINYL_PANELS,
                new Door(70,DoorMaterial.LAMINATED),
                LightSource.LEDS);

        System.out.println(livingRoom);
    }
}
