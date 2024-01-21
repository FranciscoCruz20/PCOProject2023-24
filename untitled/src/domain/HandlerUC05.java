package domain;

import java.util.Scanner;

public class HandlerUC05 {

    public static void create_foodInteractions(Sistema sistema){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira os daseguinte forma:");
        System.out.println("*Substancia Ativa" +
                "*Explicação" +
                "*Alimento" +
                "*Efeito" +
                "*Referencia bibliografica");
        String list_substances = "";
        while (true){
            System.out.println("Quer adicionar uma substância ativa?(sim ou nao)");
            String resposta = input.nextLine();
            if (resposta.equals("nao")){
                break;
            }
            System.out.print("Substancia Ativa: ");
            String substance = input.nextLine();
            list_substances += substance + "|";
        }
        StringBuilder sb = new StringBuilder(list_substances);
        sb.deleteCharAt(list_substances.length() - 1);
        list_substances = sb.toString();
        String explanation = input.nextLine();
        String food = input.nextLine();
        String effect = input.nextLine();
        String bibliography = input.nextLine();
        System.out.println("Pretende criar com os dados inseridos?(yes/no)");
        String opcao = input.nextLine();
        if (opcao == "yes") {
            System.out.println("Confirmar criação?(yes/cancelar)");
            String opcaob = input.nextLine();
            if (opcaob == "yes") {
                FoodInteractions foodInteraction = FoodInteractionsCreator.create_foodInteractions(list_substances,
                        explanation,food,effect,bibliography);
                if (!sistema.exist_foodInteraction(foodInteraction)){
                    sistema.add_foodInteraction(foodInteraction);
                }
                else {
                    System.out.println("Food Interaction already exists");
                }
            }
            else if (opcaob == "cancelar") {
                System.out.println("Foi cancelada a criação");
            }

            else {
                System.out.println("Opção inválida");

            }
        }
        else if (opcao == "no") {
            System.out.println("Foi cancelada a criação");
        }

        else {
            System.out.println("Opção inválida");
            HandlerUC05.create_foodInteractions(sistema);
        }

    }
}
