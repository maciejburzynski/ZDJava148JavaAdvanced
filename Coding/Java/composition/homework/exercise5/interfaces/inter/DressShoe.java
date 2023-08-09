package composition.homework.exercise5.interfaces.inter;

import composition.homework.exercise5.interfaces.resources.Material;
import composition.homework.exercise5.interfaces.resources.Occasion;

public interface DressShoe {

    void getOccasion(Occasion ocassion);

    void isLeatherOrSuede(Material material);

    void isHeelHeight(boolean isHeelHeight);
}