package domain;

import java.util.ArrayList;
import java.util.Map;

public class Sistema {
    private ArrayList<Medicamento> lista_medicamentos;
    private ArrayList<SubstanciaAtiva> lista_substancias_ativas;
    private Map<SubstanciaAtiva, ArrayList<InteracaoAlimentar>> dic_interacoes_alimentares;

    public Sistema(ArrayList<Medicamento> lista_medicamentos, ArrayList<SubstanciaAtiva> lista_substancias_ativas, Map<SubstanciaAtiva, ArrayList<InteracaoAlimentar>> dic_interacoes_alimentares) {
        this.lista_medicamentos = lista_medicamentos;
        this.lista_substancias_ativas = lista_substancias_ativas;
        this.dic_interacoes_alimentares = dic_interacoes_alimentares;
    }

    public ArrayList<Medicamento> getLista_medicamentos() {
        return lista_medicamentos;
    }

    public void setLista_medicamentos(ArrayList<Medicamento> lista_medicamentos) {
        this.lista_medicamentos = lista_medicamentos;
    }

    public ArrayList<SubstanciaAtiva> getLista_substancias_ativas() {
        return lista_substancias_ativas;
    }

    public void setLista_substancias_ativas(ArrayList<SubstanciaAtiva> lista_substancias_ativas) {
        this.lista_substancias_ativas = lista_substancias_ativas;
    }

    public Map<SubstanciaAtiva, ArrayList<InteracaoAlimentar>> getDic_interacoes_alimentares() {
        return dic_interacoes_alimentares;
    }

    public void setDic_interacoes_alimentares(Map<SubstanciaAtiva, ArrayList<InteracaoAlimentar>> dic_interacoes_alimentares) {
        this.dic_interacoes_alimentares = dic_interacoes_alimentares;
    }

    @Override
    public String toString() {
        return "Sistema{" +
                "lista_medicamentos=" + lista_medicamentos +
                ", lista_substancias_ativas=" + lista_substancias_ativas +
                ", dic_interacoes_alimentares=" + dic_interacoes_alimentares +
                '}';
    }
}
