package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *Classe representativa das food interactions
 */
public class FoodInteractions {
    private String Explanation;
    private String Food;
    private String Effect;
    private String Bibliography;
    private String Substances;

    /**
     * Construtor
     * @param explanation
     * @param food
     * @param effect
     * @param bibliography
     * @param substances
     */
    public FoodInteractions(String explanation, String food, String effect, String bibliography, String substances) {
        this.Explanation = explanation;
        this.Food = food;
        this.Effect = effect;
        this.Bibliography = bibliography;
        this.Substances = substances;
    }

    /**
     *
     * @return explanation
     */
    public String getExplanation() {
        return Explanation;
    }

    /**
     *
     * @param explanation
     */
    public void setExplanation(String explanation) {
        Explanation = explanation;
    }

    /**
     *
     * @return food
     */
    public String getFood() {
        return Food;
    }

    /**
     *
     * @param food
     */
    public void setFood(String food) {
        Food = food;
    }

    /**
     *
     * @return effect
     */
    public String getEffect() {
        return Effect;
    }

    /**
     *
     * @param effect
     */
    public void setEffect(String effect) {
        Effect = effect;
    }

    /**
     *
     * @return bibliography
     */
    public String getBibliography() {
        return Bibliography;
    }

    /**
     *
     * @param bibliography
     */
    public void setBibliography(String bibliography) {
        Bibliography = bibliography;
    }

    /**
     *
     * @return substances
     */
    public String getSubstances() {
        return Substances;
    }

    /**
     *
     * @param substances
     */
    public void setSubstances(String substances) {
        Substances = substances;
    }

    /**
     *
     * @return lista substances
     */
    public ArrayList<String> lista_substances(){
        return new ArrayList<>(Arrays.asList(this.Substances.split("\\|")));
    }

    /**
     *
     * @return explanation, food, effect, bibliography e substances
     */
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

    /**
     * Método que vê a igualdade entre atributos
     * @param o
     * @return true para igual e false para o contrário
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodInteractions that)) return false;
        return Objects.equals(Explanation, that.Explanation) && Objects.equals(Food, that.Food) &&
                Objects.equals(Effect, that.Effect) && Objects.equals(Bibliography, that.Bibliography) &&
                Objects.equals(Substances, that.Substances);
    }

    /**
     *
     * @return o código hash para o projeto
     */
    @Override
    public int hashCode() {
        return Objects.hash(Explanation, Food, Effect, Bibliography, Substances);
    }
}
