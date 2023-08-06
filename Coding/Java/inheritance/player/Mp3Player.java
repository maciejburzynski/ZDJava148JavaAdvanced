package inheritance.player;

public class Mp3Player implements Player {
    @Override
    public void play() {
        System.out.println("I'm playing a mp3!");
    }
}
