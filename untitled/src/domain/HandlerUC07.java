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
        float dosage = Float.parseFloat(input.nextLine());
        System.out.print("Contato de Farmacovigilancia: ");
        double surveillance = Double.parseDouble(input.nextLine());
        ArrayList<Substance> list_substances = new ArrayList<>();
        while (true){
            System.out.println("Quer adicionar uma substância ativa?(sim ou nao)");
            String resposta = input.nextLine();
            if (resposta.equals("nao")){
                break;
            }
            System.out.print("Substancia Ativa: ");
            String substance = input.nextLine();
            for (Substance i: catalogue_substances){
                if (i.getName().equals(substance)){
                    list_substances.add(i);
                }
            }
        }

        DrugCreator.create_drug(name,form, dosage,surveillance, list_substances);

    }
}
