package exercises.rommExercise;

public class Radio extends ElectronicDevice {
    private boolean haveCD;
    private boolean haveUSB;

    public Radio(int price, int yearOfProduction, int energyConsumption) {
        super(price, yearOfProduction, energyConsumption);
        this.haveCD = haveCD;
        this.haveUSB = haveUSB;
    }


    public Radio() {

    }
}
