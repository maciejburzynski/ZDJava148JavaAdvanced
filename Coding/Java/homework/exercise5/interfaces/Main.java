package homework.exercise5.interfaces;


import homework.exercise5.interfaces.resources.Material;
import homework.exercise5.interfaces.resources.Occasion;
import homework.exercise5.interfaces.resources.Size;
import homework.exercise5.interfaces.resources.SportType;
import homework.exercise5.interfaces.shoes.AdidasRunning;
import homework.exercise5.interfaces.shoes.AdisasAirForce;
import homework.exercise5.interfaces.shoes.Slippers;

public class Main {
    public static void main(String[] args) {

        AdidasRunning adidasRunning = new AdidasRunning("Red", 321);

            adidasRunning.isBreathable(true);
            adidasRunning.isComfortable(true);
            adidasRunning.chooseSize(Size.SIZE_38);
            adidasRunning.checkSportType(SportType.RUNNING);
            adidasRunning.isLeather(true);
            adidasRunning.isHighTop(true);

        Slippers slippers = new Slippers("Black", 430);

            slippers.chooseSize(Size.SIZE_39);
            slippers.getOccasion(Occasion.FOR_CELEBRATIONS);
            slippers.isHeelHeight(true);
            slippers.isLeatherOrSuede(Material.LEATHER);


        AdisasAirForce adisasAirForce = new AdisasAirForce("White", 270);

            adisasAirForce.chooseSize(Size.SIZE_40);
            adisasAirForce.checkHaveShockAbsorbingSole(true);
            adisasAirForce.checkIsStreetStyle(true);

    }
}
