package composition.optional.lamp;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        Lamp lamp1 = null;
        Lamp lamp2 = new Lamp();

        Optional<Lamp> lampOptional = Optional.ofNullable(lamp1);

        System.out.println("Exception ");
        System.out.println(lampOptional.isPresent());
        lampOptional.ifPresentOrElse(lamp -> lamp.glow(), () -> new LampNotFoundException("Lamp is empty!"));

    }

}
