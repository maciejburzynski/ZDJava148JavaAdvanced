package composition.optionals.exercise;

import java.util.Optional;

public class Main {
//    Klasyczny sposób ze zwróceniem błędu exception
    public static void main(String[] args) {

        Lamp lamp = null;

        Optional<Lamp> lampOptional = Optional.ofNullable(lamp);

        lampOptional.ifPresentOrElse(
                a -> a.glow(),
                () -> {
                    throw new LampNotFoundException("Lamp not found!");
                });
//        carOptional.orElseThrow -> new CarNotFound...
//        carOptional.ifPresentorElse -> THROW new CarNotFound...
    }
}
