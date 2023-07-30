package composition;

public class WindScreen {
    private String colVor;
    private int weightInGrams;
    private String producer;

    public WindScreen(String colVor, int weightInGrams, String producer) {
        this.colVor = colVor;
        this.weightInGrams = weightInGrams;
        this.producer = producer;
    }


    public String getColVor() {
        return colVor;
    }

    public void setColVor(String colVor) {
        this.colVor = colVor;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

}
