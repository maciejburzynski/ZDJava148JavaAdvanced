package inheritance.player;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Mp3Player song = new Mp3Player();
        DvdPlayer dvd = new DvdPlayer();
        VideoPlayer video = new VideoPlayer();

        List<Player> listOfPlayers = new ArrayList<>();
        listOfPlayers.add(song);
        listOfPlayers.add(dvd);
        listOfPlayers.add(video);

        listOfPlayers.stream()
                .forEach(player -> player.play());

    }
}
