package inheritance.car;

import inheritance.player.Playable;

public class Bus implements FourWheeler {

    @Override
    public void drive() {
        System.out.println("I am driving a bus!");
    }

}
