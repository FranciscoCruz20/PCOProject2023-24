package domain;

import java.util.Scanner;

public class HandlerUC07 {

    public static void create_Drug(Sistema sistema){

        Scanner input = new Scanner(System.in);

        System.out.println("Insert the drug data:");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Form: ");
        String form = input.nextLine();
        System.out.print("Dosage: ");
        String dosage = input.nextLine();
        String laboratory = "";
        while (true) {
            System.out.print("Laboratory: ");
            String name_laboratory = input.nextLine();
            if (sistema.exist_Laboratory(name_laboratory)) {
                laboratory = name_laboratory;
                break;
            }
            else {
                System.out.println("Laboratory doesnt exist");
            }
        }
        String list_substances = "";
        while (true){
            System.out.println("Would you like to add a substance?(yes/no)");
            String resposta = input.nextLine();
            if (resposta.equalsIgnoreCase("no")){
                break;
            }
            System.out.print("Substance: ");
            String substance = input.nextLine();
            if (substance.equals("")){
                continue;
            }
            if (!sistema.exist_Substance(substance)){
                System.out.println("Substance doesnt exist!");
                continue;
            }
            if (list_substances.contains(substance)){
                System.out.println("Substance is already associated!");
                continue;
            }
            list_substances += substance + "|";

        }
        if (!list_substances.equals("")){
            StringBuilder sb = new StringBuilder(list_substances);
            sb.deleteCharAt(list_substances.length() - 1);
            list_substances = sb.toString();
        }
        System.out.println("Would you like to create the drug with these data?(yes/cancel)");
        String opcao = input.nextLine();
        if (opcao.equals("yes")) {
            System.out.println("Confirm creation?(yes/cancel)");
            String opcaob = input.nextLine();
            if (opcaob.equals("yes")) {
                Drug drug = DrugCreator.create_drug(name, form, dosage, laboratory, list_substances);
                if (sistema.exist_drug(drug)){
                    System.out.println("Drug already exists");
                }
                else {
                    sistema.add_drug(drug);
                }
            }
            else if (opcaob.equals("cancel")) {
                System.out.println("The creation has been canceled");
            }

            else {
                System.out.println("Invalid option");

            }
        }
        else if (opcao.equals("cancel")) {
            System.out.println("The creation has been canceled");
        }

        else {
            System.out.println("Invalid Option");
            HandlerUC07.create_Drug(sistema);
        }

    }
}
