package inheritance.InterfejsyZadanie;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> playList = new ArrayList<>();
        playList.add(new DvdPlayer());
        playList.add(new Mp3Player());
        playList.add(new VideoPlayer());
        System.out.println(playList);

        playList.stream()
                .forEach(Player::play);
    }
}
