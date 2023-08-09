package homework.exercise2;

public enum Runner {
    BEGINNER(360, 720),
    INTERMEDIATE(181, 359),
    ADVANCED(0, 180);

    private int minMarathonTimePassingInMinutes;
    private int maxMarathonTimePassingInMinutes;

    Runner(int minMarathonTimePassingInMinutes, int maxMarathonTimePassingInMinutes) {
        this.minMarathonTimePassingInMinutes = minMarathonTimePassingInMinutes;
        this.maxMarathonTimePassingInMinutes = maxMarathonTimePassingInMinutes;
    }

    public void getFitnessLevel() {
        System.out.println("Najlepszy czas w minutach na maraton to: " + minMarathonTimePassingInMinutes);
        System.out.println("Najgorszy czas w minutach na maraton to: " + maxMarathonTimePassingInMinutes);
    }

    @Override
    public String toString() {
        return "Runner{" +
                "name='" + name() + '\'' +
                ", minMarathonTimePassingInMinutes=" + minMarathonTimePassingInMinutes +
                ", maxMarathonTimePassingInMinutes=" + maxMarathonTimePassingInMinutes +
                '}';
    }
}