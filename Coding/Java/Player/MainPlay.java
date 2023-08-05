package Player;

import java.util.ArrayList;
import java.util.List;

public class MainPlay {
    public static void main(String[] args) {


        List<Playable> playableList = new ArrayList<>();

        playableList.add(new DvdPlayer());
        playableList.add(new Mp3Player());
        playableList.add(new VideoPlayer());

        System.out.println(playableList);

        playableList.stream()
                .forEach(playable -> playable.play());
//                .forEach(Playable::play());

    }
}