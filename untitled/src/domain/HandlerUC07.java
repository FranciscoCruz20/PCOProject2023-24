package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class HandlerUC07 {

    public void create_Drug(ArrayList<Substance> catalogue_substances){

        Scanner input = new Scanner(System.in);

        System.out.println("Insira os dados do Medicamento:");
        System.out.print("Nome: ");
        String name = input.nextLine();
        System.out.print("Forma armaceutica: ");
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
            list_substances += substance + "|";

        }
        StringBuilder sb = new StringBuilder(list_substances);
        sb.deleteCharAt(list_substances.length() - 1);
        list_substances = sb.toString();

        DrugCreator.create_drug(name,form, dosage,laboratory, list_substances);

    }
}
