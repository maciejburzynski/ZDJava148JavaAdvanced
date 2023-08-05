package player;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Mp3Player mp3Player = new Mp3Player();
        VideoPlayer videoPlayer = new VideoPlayer();
        DvdPlayer dvdPlayer = new DvdPlayer();

        List<Player> players = new ArrayList<>();
        players.add(mp3Player);
        players.add(videoPlayer);
        players.add(dvdPlayer);

        players.stream()
                .forEach(player -> player.play());
    }
}
