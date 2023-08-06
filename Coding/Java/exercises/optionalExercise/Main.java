//package exercises.optionalExercise;
//
//import composition.optionals.CarNotFoundException;
//
//import java.util.Optional;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Lamp lamp = new Lamp();
//        Lamp lamp1 = null;
//
//
//        Optional<Lamp> lampOptional = Optional.ofNullable(lamp1);
//
//       if( lampOptional.ifPresent()) {
//            lamp1.shine();
//        }else{
//            throw new LampNotFoundException("Nie ma lampy");
//        }
//        };
////                a -> a.shine(),
////                () -> {
////                    try {
////                        throw new LampNotFoundException("Lamp was not found");
////
////                });
////
////
////                System.out.println(lamp1);
////                }
//
//
//
//}
//
//
//
