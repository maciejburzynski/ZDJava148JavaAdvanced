package classes.exceptions;

import composition.room.Color;

import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {


        Room room = new Room("Saloon", Color.RED);
        Room room1 = new Room("Saloon", Color.BLACK);

        try {
            validateRoom(room);
        } catch (ColorNotWashableException e) {
            System.out.println("ByczQ, this color is not washable");
        } finally {
            System.out.println("Executed anyway");
        }

        try {
            validateRoom(room1);
        } catch (ColorNotWashableException e) {
            System.out.println("ByczQ, this color is not washable");
        } finally {
            System.out.println("Executed anyway");
        }
    }


    private static void validateRoom(Room room) throws ColorNotWashableException {

        if (!room.getColor().isWashable()) {
            throw new ColorNotWashableException("Chosen color is not washable");
        } else {
            System.out.println("All good ByczQ");
        }


    }


}
