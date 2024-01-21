package domain;

import java.util.Scanner;

/**
 * Classe responsável pela execução do caso de uso 10
 * Onde é necessário fazer a pesquisa de surveilance
 */
public class HandlerUC10 {

    /**
     * Método responsável pela pesquisa de surveillance
     * Onde é dado como input o nome da drug é dado o surveillance associado a ela
     * @param sistema
     * @throws NullPointerException
     */
    public static void search_surveillance(Sistema sistema) throws NullPointerException{
        Scanner input = new Scanner(System.in);
        String drug_name = "";
        while (drug_name.equals("")){
            System.out.println("Whats the name of the drug you want to search?");
            drug_name = input.nextLine();
            if (drug_name.equalsIgnoreCase("cancel")){
                return;
            }
        }
        Drug drug = sistema.search_Drug(drug_name);
        if (drug != null) {
            Laboratory laboratory = sistema.search_Laboratory(drug.getLaboratory());
            System.out.println("\nLaboratory: " + laboratory.getName() +
                    "\nSurveillance: " + laboratory.getSurveillance() + "\n");
        }
        else {
            HandlerUC10.search_surveillance(sistema);
        }
    }
}
