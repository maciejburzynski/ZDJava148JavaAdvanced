package Zoo;

import car.Main;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    Map<String, Integer> animals;
    public Zoo () {
        animals = new HashMap<>();
    }
    public int getNumberOfAnimals() {
        int totalCount = 0;
        for (int count : animals.values()) {
            totalCount += count;
        }
        return totalCount;
    }
}
