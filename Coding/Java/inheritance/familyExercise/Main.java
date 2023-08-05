package inheritance.familyExercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FamilyMember> familyList = new ArrayList<>();
        familyList.add(new Grandfather());
        familyList.add(new Grandmother());
        familyList.add(new Father());
        familyList.add(new Mother());
        familyList.add(new Son());
        familyList.add(new Daughter());
        familyList.add(new Grandson());
        familyList.add(new Granddaughter());


        familyList.stream()
                .forEach(FamilyMember::walk);
    }
}
