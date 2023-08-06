package inheritance.player;

public class VideoPlayer implements Player {
    @Override
    public void play() {
        System.out.println("I'm playing a video!");
    }
}
