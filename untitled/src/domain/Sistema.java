package domain;

import java.util.ArrayList;
import java.util.Map;

public class Sistema {
    private ArrayList<Medicamento> lista_medicamentos;
    private ArrayList<SubstanciaAtiva> lista_substancias_ativas;
    private Map<SubstanciaAtiva, ArrayList<InteracaoAlimentar>> dic_interacoes_alimentares;
    private ArrayList<Farmaceutico> lista_farmaceuticos;
    private ArrayList<IndustriaFramaceutica> lista_industrias_farmaceuticas;
    private Administrador administrador;

    public Sistema(ArrayList<Medicamento> lista_medicamentos,
                   ArrayList<SubstanciaAtiva> lista_substancias_ativas,
                   Map<SubstanciaAtiva, ArrayList<InteracaoAlimentar>> dic_interacoes_alimentares,
                   ArrayList<Farmaceutico> lista_farmaceuticos,
                   ArrayList<IndustriaFramaceutica> lista_industrias_farmaceuticas,
                   Administrador administrador) {
        this.lista_medicamentos = lista_medicamentos;
        this.lista_substancias_ativas = lista_substancias_ativas;
        this.dic_interacoes_alimentares = dic_interacoes_alimentares;
        this.lista_farmaceuticos = lista_farmaceuticos;
        this.lista_industrias_farmaceuticas = lista_industrias_farmaceuticas;
        this.administrador = administrador;
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

    public ArrayList<Farmaceutico> getLista_farmaceuticos() {
        return lista_farmaceuticos;
    }

    public void setLista_farmaceuticos(ArrayList<Farmaceutico> lista_farmaceuticos) {
        this.lista_farmaceuticos = lista_farmaceuticos;
    }

    public ArrayList<IndustriaFramaceutica> getLista_industrias_farmaceuticas() {
        return lista_industrias_farmaceuticas;
    }

    public void setLista_industrias_farmaceuticas(ArrayList<IndustriaFramaceutica> lista_industrias_farmaceuticas) {
        this.lista_industrias_farmaceuticas = lista_industrias_farmaceuticas;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public ArrayList<InteracaoAlimentar> pesquisarInteracaoAlimentar(String nomemedicamento){
        ArrayList<InteracaoAlimentar> InteracoesAlimentares = new ArrayList<>();
        for (Medicamento medicamento: lista_medicamentos){
            if (nomemedicamento.equals(medicamento.getNome())){
                for (SubstanciaAtiva substanciaAtiva: medicamento.getSubstancias_Ativas()){
                    for (InteracaoAlimentar interacaoalimentar: dic_interacoes_alimentares.get(substanciaAtiva)){
                        System.out.println(interacaoalimentar);
                        InteracoesAlimentares.add(interacaoalimentar);
                    }
                }
                return InteracoesAlimentares;
            }
        }
        return InteracoesAlimentares;
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
