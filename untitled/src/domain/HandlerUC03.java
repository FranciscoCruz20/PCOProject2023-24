package domain;

import java.util.Scanner;

public class HandlerUC03 {


    // Falta implementar a verificação no json

    public static void create_Substance(Sistema sistema){
        Scanner input = new Scanner(System.in);
        System.out.println("Insert the data from the substance:");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.println("Confirm creation?(yes/cancel)");
        String opcao = input.nextLine();
        if (opcao.equalsIgnoreCase("yes")) {
            if (!sistema.exist_Substance(name)){
                SubstanceCreator.create_Substance(name);
            }
            else {
                System.out.println("Substance already exists");
                HandlerUC03.create_Substance(sistema);
            }
        }
        else if (opcao.equalsIgnoreCase("cancel")) {
            System.out.println("The creation has been canceled");
        }
        else {
            System.out.println("Invalid Option");
        }
    }

}
