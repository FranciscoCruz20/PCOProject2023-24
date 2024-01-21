package domain;

/**
 * Classe Creator de objetos do tipo FoodInteraction
 */
public class FoodInteractionsCreator {

    /**
     * Método responsável pela criação do objeto
     * @param substances
     * @param explanation
     * @param food
     * @param effect
     * @param bibliography
     * @return novo objeto do tipo FoodInteraction
     */
    public static FoodInteractions create_foodInteractions(String substances, String explanation, String food, String effect, String bibliography){

        FoodInteractions foodInteractions = new FoodInteractions(explanation, food, effect, bibliography, substances);
        return new FoodInteractions(explanation, food, effect, bibliography, substances);
    }
}
