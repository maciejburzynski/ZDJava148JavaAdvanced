package homework.exerciseSelfMade.Exceptions;

public class Main {
    public static void main(String[] args) {


       int a = 10;
       int b = 7;


       try {
           int c = (a /0);

       }catch (ArithmeticException e){
          e.printStackTrace();

       }finally {
           System.out.println("Nie dzieli się przez zero. ");
       }




    }
}
