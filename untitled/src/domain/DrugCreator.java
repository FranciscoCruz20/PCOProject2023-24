package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class DrugCreator {

    public static Drug create_drug(ArrayList<Substance> catalogue_substances){

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
            String substancia_ativa = input.nextLine();
            for (Substance i: catalogue_substances){
                if (i.getName().equals(substancia_ativa)){
                    list_substances.add(i);
                }
            }
        }

        return new Drug(name,form,dosage, surveillance, list_substances);

    }
}
