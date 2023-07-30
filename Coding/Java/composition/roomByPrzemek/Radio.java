package composition.roomByPrzemek;

public class Radio extends ElectronicDevice {
    private boolean haveCD;
    private boolean haveUSB;




    public Radio(int price, int yearOfProduction, int energyConsumption, boolean haveCD, boolean haveUSB) {
        super(price, yearOfProduction, energyConsumption);
        this.haveCD = haveCD;
        this.haveUSB = haveUSB;
    }

    public Radio() {

    }


    //    public Radio(int price, int yearOfProduction, int energyConsumption) {
//        super(price, yearOfProduction, energyConsumption);
//        this.haveCD = haveCD;
//        this.haveUSB = haveUSB;
//    }





}
