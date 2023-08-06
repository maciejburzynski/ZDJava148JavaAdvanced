package composition.car;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

    public static void main(String[] args) {


        /*
        LIFO - Last In, First out

        FIFO - First In First Out
        What went first, is first to go out
         */


        Queue<String> pokemons = new LinkedList<>();
        pokemons.offer("Pikachu");
        pokemons.offer("Charmander");
        System.out.println(pokemons.poll());
        System.out.println(pokemons.peek());




    }


}
