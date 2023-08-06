package composition.optionals.Zadanie;

import composition.optionals.Car;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();
        Lamp lamp2 = null;

        Optional<Lamp> lampOptional = Optional.ofNullable(lamp2);

        lampOptional.ifPresent(g -> g.glow());

        lampOptional.orElseThrow(() -> new RuntimeException("Lamp not found"));

        lampOptional.ifPresentOrElse(l -> l.glow(),
                () -> new LampNotFoundException("ifPresentOrElse lamp not found"));
    }

}
