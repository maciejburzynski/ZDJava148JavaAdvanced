package composition.homework.exercise2;

public class Competitor {
    private String name;
    private int age;
    private double weight;
    private Runner runnerLevel;

    public Competitor(String name, int age, double weight, Runner runnerLevel) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.runnerLevel = runnerLevel;
    }

    public Runner getRunner() {
        return runnerLevel;
    }

    @Override
    public String toString() {
        return "Competitor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", runnerLevel=" + runnerLevel + // Bez używania name(), aby wyświetlić pełną wartość enuma
                '}';
    }
}
