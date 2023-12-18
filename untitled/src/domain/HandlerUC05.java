package domain;

import java.util.Scanner;

public class HandlerUC05 {

    public void criar_Interacao_Alimentar(){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira os daseguinte forma:");
        System.out.println("*Substancia Ativa" +
                "*Explicação" +
                "*Alimento" +
                "*Efeito" +
                "*Referencia bibliografica");
        String substenciaAtiva = input.nextLine();
        String explicacao = input.nextLine();
        String alimento = input.nextLine();
        String efeito = input.nextLine();
        String referencia_bibliografica = input.nextLine();
        System.out.println("Pretende criar com os dados inseridos?(yes/no)");
        String opcao = input.nextLine();
        if (opcao == "yes") {


            //confirmação da substancia no json (verificar extensões)


            System.out.println("Confirmar criação?(yes/cancelar)");
            String opcaob = input.nextLine();
            if (opcaob == "yes") {
                InteracaoAlimentarCreator.criar_Interacao_Alimentar(substenciaAtiva,explicacao,alimento,efeito,referencia_bibliografica);

            }
            else if (opcaob == "cancelar") {
                System.out.println("Foi cancelada a criação");
                //levar para o menu
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
        }

    }
}
