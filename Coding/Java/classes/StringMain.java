package classes;

public class StringMain {
static String string = new String();
static String stringNew = "Maciej";


    public static void main(String[] args) {

        String string = "Maciej"; // String pool

        string = new String("aaaa");

        System.out.println(string.hashCode());
        System.out.println(stringNew.hashCode());

        System.out.println(string.equals(stringNew));





    }


}
