package inheritance.player;

public class DvdPlayer implements Player{
    @Override
    public void play() {
        System.out.println("I'm playing a dvd movie!");
    }
}
