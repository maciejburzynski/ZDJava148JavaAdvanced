package inheritance.family;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Family dad = new Dad();
        Family daughter = new Daughter();
        Family granddaughter = new Granddaughter();
        Family grandma = new Grandma();
        Family grandpa = new Grandpa();
        Family grandson = new Grandson();
        Family mom = new Mom();
        Family son = new Son();


        Set<Family> familySet = new LinkedHashSet<>();

        familySet.add(dad);
        familySet.add(daughter);
        familySet.add(granddaughter);
        familySet.add(grandma);
        familySet.add(grandpa);
        familySet.add(grandson);
        familySet.add(mom);
        familySet.add(son);


        familySet.stream()
                .forEach(Family::walk);
    }
}
