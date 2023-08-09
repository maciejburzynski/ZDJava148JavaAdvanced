package homework.exercise3;


    public enum Car{

        FERRARI(5000000, 789 ),
        PORSCHE(2000000, 650),
        MERCEDES(1000000, 585),
        BMW(250000, 355 ),
        TOYOTA(100000, 240),
        OPEL(50000, 189),
        FIAT(15000, 136);



        private int price;
        private int enginePower;



        Car(int price, int enginePower) {
            this.price = price;
            this.enginePower = enginePower;
        }

        public int getPrice() {
            return price;
        }

        public int getEnginePower() {
            return enginePower;
        }


        public void isPremium(){
            if (price>= 250000){
                System.out.println("The choosen car is premium level. Not for everybody");
            }
        }

        public void isRegular(){
            if (price< 250000){
                System.out.println("The choosen car is  regular level.");
            }
        }


        @Override
        public String toString() {
            return "Car{" +
                    "price=" + price +
                    ", enginePower=" + enginePower +
                    "} " + super.toString();
        }
    }


