package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("ziemia");
        list.add("kot");
        list.add("dom");
        list.add("płot");

       sortList(list);
    }

    public static void sortList (List<String> list) {
        Collections.sort(list, Collections.reverseOrder());
        for (String s : list) {
            System.out.println(s);
        }
    }
}