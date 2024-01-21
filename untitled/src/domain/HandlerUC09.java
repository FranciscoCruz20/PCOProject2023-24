package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HandlerUC09 {

    public static void pesquisar_Interacao_Alimentar (Sistema sistema){
        Scanner input = new Scanner(System.in);
        System.out.println("Whats the name of the drug you want to search?");
        String name = input.nextLine();
        Drug drug = sistema.search_Drug(name);
        if (drug != null) {
            HashMap<String, ArrayList<FoodInteractions>> dic_substance_foodInteractions = sistema.searchFoodInteractions(name);
            ArrayList<FoodInteractions> foodInteractions = new ArrayList<>();
            ArrayList<String> foods = new ArrayList<>();
            ArrayList<String> effects = new ArrayList<>();
            ArrayList<String> substances = drug.lista_substances();
            HashMap<FoodInteractions, String> dic_food_interaction_substance = new HashMap<>();
            if (dic_substance_foodInteractions.isEmpty()) {
                return;
            }
            if (substances.contains("")){
                System.out.println("That drug doesnt have active substances!");
                return;
            }
            for (String substance : substances) {
                for (FoodInteractions foodInteraction : dic_substance_foodInteractions.get(substance)) {
                    dic_food_interaction_substance.put(foodInteraction, substance);
                    foodInteractions.add(foodInteraction);
                    effects.add(foodInteraction.getEffect());
                    foods.add(foodInteraction.getFood());
                }
            }
            for (int i = 0; i < foodInteractions.size(); i++) {
                System.out.println(i + 1 + "-\tDrug: " + drug.getName() +
                        "\tSubstance: " + dic_food_interaction_substance.get(foodInteractions.get(i)) +
                        "\tEffect: " + effects.get(i) +
                        "\tFood: " + foods.get(i));
            }

            System.out.println("Do you wish to see more information about any of these?(yes/no)");
            String answer = input.nextLine();
            if (answer.equals("yes")) {
                System.out.println("Wish number?");
                int option = input.nextInt();
                System.out.println(foodInteractions.size());
                if (!(option > 0 && option <= foodInteractions.size())) {
                    System.out.println("Invalid Option");
                } else {
                    option--;
                    System.out.println("Drug: " + drug.getName() +
                            "\nSubstance: " + dic_food_interaction_substance.get(foodInteractions.get(option)) +
                            "\nEffect: " + effects.get(option) +
                            "\nFood: " + foods.get(option) +
                            "\nExplanation: " + foodInteractions.get(option).getExplanation() +
                            "\nBibliography: " + foodInteractions.get(option).getBibliography());
                }
            }
        }
        else {
            HandlerUC09.pesquisar_Interacao_Alimentar(sistema);
        }
    }
}
