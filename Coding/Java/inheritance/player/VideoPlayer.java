package inheritance.player;

public class VideoPlayer implements Playable{

    @Override
    public void play() {
        System.out.println("I am playing Video!");
    }
}
