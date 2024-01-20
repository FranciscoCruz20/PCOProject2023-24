package domain;

public class FoodInteractions {
    private String Explanation;
    private String Food;
    private String Effect;
    private String Bibliography;
    private String Substances;

    public FoodInteractions(String explanation, String food, String effect, String bibliography, String substances) {
        this.Explanation = explanation;
        this.Food = food;
        this.Effect = effect;
        this.Bibliography = bibliography;
        this.Substances = substances;
    }

    @Override
    public String toString() {
        return "FoodInteractions{" +
                "explanation='" + Explanation + '\'' +
                ", food='" + Food + '\'' +
                ", effect='" + Effect + '\'' +
                ", bibliography='" + Bibliography + '\'' +
                ", substances=" + Substances +
                '}';
    }
}
