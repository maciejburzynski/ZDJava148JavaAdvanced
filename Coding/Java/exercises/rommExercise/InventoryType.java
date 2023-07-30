package exercises.rommExercise;

import exercises.rommExercise.ElectronicDevice;
import exercises.rommExercise.Radio;
import exercises.rommExercise.Television;

public enum InventoryType {
    TV(new Television()),
    RADIO(new Radio());

    private final ElectronicDevice device;

    InventoryType(ElectronicDevice device) {
        this.device = device;
    }

    public ElectronicDevice getDevice() {
        return device;
    }
}

