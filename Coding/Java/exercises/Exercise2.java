package exercises;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise2 {

    private static String Integer;

    public static void main(String[] args) {

        Map<String, Integer> codingLanguages = new HashMap<>();

        codingLanguages.put("java", 18);
        codingLanguages.put("c++", 14);
        codingLanguages.put("php", 113);
        codingLanguages.put("javaScript", 11);
        codingLanguages.put("css", 112);

        printMap(codingLanguages);

    }

    public static void printMap(Map map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Klucz: " + entry.getKey() + ", " + "Wartość: " + entry.getValue());
        }

    }
}
