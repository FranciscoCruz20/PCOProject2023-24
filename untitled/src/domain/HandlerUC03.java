package domain;

import java.util.Scanner;

public class HandlerUC03 {


    // Falta implementar a verificação no json

    public void criar_Substancia_Ativa(){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira os dados da Substancia Ativa:");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.println("Confirmar criação?(yes/cancelar)");
        String opcao = input.nextLine();
        if (opcao == "yes") {
            SubstanciaAtivaCreator.criar_SubstanciaAtiva(nome);
        }
        else if (opcao == "cancelar") {
            System.out.println("Foi cancelada a criação");
        }

        else {
            System.out.println("Opção inválida");
        }
    }

}
