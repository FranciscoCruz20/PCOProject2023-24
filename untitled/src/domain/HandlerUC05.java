package domain;

import java.util.Scanner;

/**
 * Classe responsável pela execução do caso de uso 5
 * Onde é necesário criar uma foodInteraction
 */
public class HandlerUC05 {

    /**
     * Método que cria uma foodInteraction
     * @param sistema
     */
    public static void create_foodInteractions(Sistema sistema){
        Scanner input = new Scanner(System.in);

        System.out.println("Insert Food Interaction data:");
        String list_substances = "";
        while (true){
            System.out.println("Would you like to add a substance?(yes/no)");
            String resposta = input.nextLine();
            if (resposta.equalsIgnoreCase("no")){
                break;
            }
            System.out.print("Active Substance: ");
            String substance = input.nextLine();
            if (!sistema.exist_Substance(substance)){
                System.out.println("Substance doesnt exist!");
                continue;
            }
            list_substances += substance + "|";
        }
        if (!list_substances.equals("")) {
            StringBuilder sb = new StringBuilder(list_substances);
            sb.deleteCharAt(list_substances.length() - 1);
            list_substances = sb.toString();
        }
        System.out.print("Explanation: ");
        String explanation = input.nextLine();
        System.out.print("Food: ");
        String food = input.nextLine();
        System.out.print("Effect: ");
        String effect = input.nextLine();
        System.out.print("Bibliography: ");
        String bibliography = input.nextLine();
        System.out.println("Would like to create with these data?(yes/no)");
        String opcao = input.nextLine();
        if (opcao .equalsIgnoreCase("yes")) {
            System.out.println("Confirm creation?(yes/cancel)");
            String opcaob = input.nextLine();
            if (opcaob.equalsIgnoreCase("yes")) {
                FoodInteractions foodInteraction = FoodInteractionsCreator.create_foodInteractions(list_substances,
                        explanation,food,effect,bibliography);
                if (!sistema.exist_foodInteraction(foodInteraction)){
                    sistema.add_foodInteraction(foodInteraction);
                    sistema.add_to_dic(foodInteraction);
                }
                else {
                    System.out.println("Food Interaction already exists");
                }
            }
            else if (opcaob.equalsIgnoreCase("cancel")) {
                System.out.println("The creation has been canceled");
            }
            else {
                System.out.println("Invalid Option");
            }
        }
        else if (opcao.equalsIgnoreCase("no")) {
            System.out.println("The creation has been canceled");
        }
        else {
            System.out.println("Invalid Option");
            HandlerUC05.create_foodInteractions(sistema);
        }

    }
}
