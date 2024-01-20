package domain;

public class FoodInteractionsCreator {

    public static FoodInteractions create_foodInteractions(String substances, String explanation, String food, String effect, String bibliography){

        FoodInteractions foodInteractions = new FoodInteractions(explanation, food, effect, bibliography, substances);
        return new FoodInteractions(explanation, food, effect, bibliography, substances);
    }
}
