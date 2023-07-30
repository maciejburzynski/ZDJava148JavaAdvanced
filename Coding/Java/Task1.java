import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public static void main(String[] args) {
        String []stringList= new String []{"Anna","Kasia","Gosia","Malgosia"};
        Arrays.sort(stringList, Comparator.comparingInt(String::hashCode));


    }
}
