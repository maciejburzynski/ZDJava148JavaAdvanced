package homework.exercise2;

public class Main {
    public static void main(String[] args) {


                Competitor competitor = new Competitor("Ferdek", 24, 78, Runner.ADVANCED);
                System.out.println("O to nasz biegacz: ");
                System.out.println(competitor);
                System.out.println();
                System.out.println("A poniżej jego wyniki");
                competitor.getRunner().getFitnessLevel();
            }

}
