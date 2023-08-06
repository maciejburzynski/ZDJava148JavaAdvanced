package composition.optionals.exercise;

import java.util.Optional;

public class Main2 {
//    Sposób z własną wiadomością zamiast błędu exception
//    w przypadku jego wyskoczenia, ale tak raczej
//    nie robimy, bo ciężko będzie komuś znaleźć
//    źródło problemu (source, itp)
    public static void main(String[] args) {

        Lamp lamp = null;

        Optional<Lamp> lampOptional = Optional.ofNullable(lamp);

        try {
            lampOptional.ifPresentOrElse(
                    aaa -> aaa.glow(),
                    () -> {throw new LampNotFoundException("Lamp not found!");});
        } catch (LampNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
