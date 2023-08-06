package Exceptions;

import composition.room.Color;


public class Main {
    public static void main(String[] args) {

        Room rom = new Exceptions.Room("Salon", Color.BLACK);
        Room rom1 = new Exceptions.Room("Kuchnia", Color.RED);
        Room rom2 = new Exceptions.Room("Sypialnia", Color.YELLOW);

        try {
            validateRoom(rom);
        } catch (ColorNotWashableException e) {
            System.out.println("This color is not washable");
        }finally {
            System.out.println("Executed anyway");
        }

        try {
            validateRoom(rom1);
        } catch (ColorNotWashableException e) {
            System.out.println("This color is not washable");
        }finally {
            System.out.println("Executed anyway");
        }

        try {
            validateRoom(rom2);
        } catch (ColorNotWashableException e) {
            System.out.println("This color is not washable");
        }finally {
            System.out.println("Executed anyway");
        }
    }


    private static void validateRoom(Room room) throws ColorNotWashableException {
        if (!room.getColor().isWashable()) {
            throw new ColorNotWashableException("Chosen color is not washable");
        } else {
            System.out.println("All good!");
        }
    }
}