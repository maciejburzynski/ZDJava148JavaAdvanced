package composition.optionals.exercise;

public class LampNotFoundException extends RuntimeException {
    public LampNotFoundException(String message) {
        super(message);
        // Własna treśćwiadomość tu i tak nie zadziała,
        // ponieważ niezależnie co podamy w parametrze Exceptiona,
        // i tak zostanie to nadpisane, ponieważ wyżej jest "super"
    }
}
