package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 */
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

    public String getExplanation() {
        return Explanation;
    }

    public void setExplanation(String explanation) {
        Explanation = explanation;
    }

    public String getFood() {
        return Food;
    }

    public void setFood(String food) {
        Food = food;
    }

    public String getEffect() {
        return Effect;
    }

    public void setEffect(String effect) {
        Effect = effect;
    }

    public String getBibliography() {
        return Bibliography;
    }

    public void setBibliography(String bibliography) {
        Bibliography = bibliography;
    }

    public String getSubstances() {
        return Substances;
    }

    public void setSubstances(String substances) {
        Substances = substances;
    }

    public ArrayList<String> lista_substances(){
        return new ArrayList<>(Arrays.asList(this.Substances.split("\\|")));
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodInteractions that)) return false;
        return Objects.equals(Explanation, that.Explanation) && Objects.equals(Food, that.Food) &&
                Objects.equals(Effect, that.Effect) && Objects.equals(Bibliography, that.Bibliography) &&
                Objects.equals(Substances, that.Substances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Explanation, Food, Effect, Bibliography, Substances);
    }
}
