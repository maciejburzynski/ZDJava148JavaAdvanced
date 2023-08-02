package composition.Runner;

public enum Runner {
    BEGINNER(180,240),
    INTERMEDIATE(120,179),
    ADVANCED(0,119);
    private final int minTimeInMinutes;
    private final int maxTimeInMinutes;
    Runner (int minTimeInMinutes, int maxTimeInMinutes) {
        this.minTimeInMinutes = minTimeInMinutes;
        this.maxTimeInMinutes = maxTimeInMinutes;
    }
    public int getMinTimeInMinutes() {
        return minTimeInMinutes;
    }

    public int getMaxTimeInMinutes() {
        return maxTimeInMinutes;
    }
    public Runner getFitnessLevel (int timeRun) {
        for (Runner runner : Runner.values()) {
            if(timeRun >= runner.getMinTimeInMinutes() && timeRun <= runner.getMaxTimeInMinutes()) {
                return runner;
            }
        }
        return null;
    }
}
