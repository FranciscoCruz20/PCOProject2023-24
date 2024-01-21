package domain;

import java.util.Scanner;

public class HandlerUC07 {

    public static void create_Drug(Sistema sistema){

        Scanner input = new Scanner(System.in);

        System.out.println("Insira os dados do Medicamento:");
        System.out.print("Nome: ");
        String name = input.nextLine();
        System.out.print("Forma farmaceutica: ");
        String form = input.nextLine();
        System.out.print("Dosagem: ");
        String dosage = input.nextLine();
        System.out.print("Contato de Farmacovigilancia: ");
        String laboratory = input.nextLine();
        String list_substances = "";
        while (true){
            System.out.println("Quer adicionar uma substância ativa?(sim ou nao)");
            String resposta = input.nextLine();
            if (resposta.equals("nao")){
                break;
            }
            System.out.print("Substancia Ativa: ");
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
        StringBuilder sb = new StringBuilder(list_substances);
        sb.deleteCharAt(list_substances.length() - 1);
        list_substances = sb.toString();

        System.out.println("Pretende criar com os dados inseridos?(yes/cancelar)");
        String opcao = input.nextLine();
        if (opcao.equals("yes")) {
            System.out.println("Confirmar criação?(yes/cancelar)");
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
            else if (opcaob.equals("cancelar")) {
                System.out.println("Foi cancelada a criação");
            }

            else {
                System.out.println("Opção inválida");

            }
        }
        else if (opcao.equals("cancelar")) {
            System.out.println("Foi cancelada a criação");
        }

        else {
            System.out.println("Opção inválida");
            HandlerUC07.create_Drug(sistema);
        }

    }
}
