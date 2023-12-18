package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class MedicamentoCreator {

    public static Medicamento criar_Medicamento(ArrayList<SubstanciaAtiva> catalogo_substancias_ativas){

        Scanner input = new Scanner(System.in);

        System.out.println("Insira os dados do Medicamento:");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Forma armaceutica: ");
        String forma_farmaceutica = input.nextLine();
        System.out.print("Dosagem: ");
        float dosagem = Float.parseFloat(input.nextLine());
        System.out.print("Contato de Farmacovigilancia: ");
        double contato_farmacovigilancia = Double.parseDouble(input.nextLine());
        ArrayList<SubstanciaAtiva> lista_substancias_ativas = new ArrayList<>();
        while (true){
            System.out.println("Quer adicionar uma substância ativa?(sim ou nao)");
            String resposta = input.nextLine();
            if (resposta.equals("nao")){
                break;
            }
            System.out.print("Substancia Ativa: ");
            String substancia_ativa = input.nextLine();
            for (SubstanciaAtiva i: catalogo_substancias_ativas){
                if (i.getNome().equals(substancia_ativa)){
                    lista_substancias_ativas.add(i);
                }
            }
        }

        return new Medicamento(nome,forma_farmaceutica,dosagem, contato_farmacovigilancia, lista_substancias_ativas);

    }
}
