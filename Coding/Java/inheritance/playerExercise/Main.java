package inheritance.playerExercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Playable> playableList = new ArrayList<>();
        playableList.add(new Mp3Player());
        playableList.add(new VideoPlayer());
        playableList.add(new DvdPlayer());

        playableList.stream()
                .forEach(playable -> playable.play());
//  to samo co  .forEach(Playable::play);
    }
}
