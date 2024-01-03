package domain;

import java.util.ArrayList;

public class MedicamentoCreator {

    public static Medicamento criar_Medicamento(String nome, String forma_farmaceutica, float dosagem, double contato_farmacovigilancia, ArrayList<SubstanciaAtiva> lista_substancias_ativas){

        Medicamento medicamento = new Medicamento(nome,forma_farmaceutica, dosagem,contato_farmacovigilancia, lista_substancias_ativas);
        return new Medicamento(nome,forma_farmaceutica,dosagem, contato_farmacovigilancia, lista_substancias_ativas);

    }
}
