package domain;

public class FoodInteractions {
    private String explanation;
    private String food;
    private String effect;
    private String bibliography;
    private Substance substances;

    public FoodInteractions(String explanation, String food, String effect, String bibliography, Substance substances) {
        this.explanation = explanation;
        this.food = food;
        this.effect = effect;
        this.bibliography = bibliography;
        this.substances = substances;
    }

}
