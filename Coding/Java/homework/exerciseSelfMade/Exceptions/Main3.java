package homework.exerciseSelfMade.Exceptions;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws CustomException {

        Scanner scanner = new Scanner(System.in);

       int x = scanner.nextInt();

       checkNewCustomException(x);


    }

    public static int checkNewCustomException(Integer integer) throws CustomException {
        if (integer <0){
            throw new CustomException("Number should be bigger or equal then 0.");
        }
        return integer;

    }
}
