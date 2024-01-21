package domain;

import java.util.Scanner;

public class HandlerUC03 {


    // Falta implementar a verificação no json

    public static void create_Substance(Sistema sistema){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os dados da Substancia Ativa:");
        System.out.print("Nome: ");
        String name = input.nextLine();
        System.out.println("Confirmar criação?(yes/cancelar)");
        String opcao = input.nextLine();
        if (opcao == "yes") {
            if (!sistema.exist_Substance(name)){
                SubstanceCreator.create_Substance(name);
            }
            else {
                System.out.println("Substance already exists");
                HandlerUC03.create_Substance(sistema);
            }
        }
        else if (opcao == "cancelar") {
            System.out.println("Foi cancelada a criação");
        }
        else {
            System.out.println("Opção inválida");
        }
    }

}
