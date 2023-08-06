package composition.car;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {

//        Kolejka (Queue)
//        Fifo - first in, first out (what went first, is first to go out)
//        Lifo - last in, first out (odwrotnie)

        Queue<String> pokemons = new LinkedList<>();
        pokemons.offer("Pikachu");
        pokemons.offer("Charmander");
        System.out.println(pokemons.poll());
        System.out.println(pokemons.peek());


    }
}
