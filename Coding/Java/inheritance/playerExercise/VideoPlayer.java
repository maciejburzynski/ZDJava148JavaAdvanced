package inheritance.playerExercise;

public class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Let's play this file!");
    }
}
