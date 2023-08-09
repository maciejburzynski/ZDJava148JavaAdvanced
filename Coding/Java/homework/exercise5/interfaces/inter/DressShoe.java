package homework.exercise5.interfaces.inter;

import homework.exercise5.interfaces.resources.Material;
import homework.exercise5.interfaces.resources.Occasion;

public interface DressShoe {

    void getOccasion(Occasion ocassion);

    void isLeatherOrSuede(Material material);

    void isHeelHeight(boolean isHeelHeight);
}