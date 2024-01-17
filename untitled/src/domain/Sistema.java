package domain;

import java.util.ArrayList;
import java.util.Map;

public class Sistema {
    private ArrayList<Drug> lista_drugs;
    private ArrayList<Substance> list_substances;
    private Map<Substance, ArrayList<FoodInteractions>> dic_foodInteractions;
    private ArrayList<Pharmaceutical> lista_pharmaceuticals;
    private ArrayList<Laboratories> list_laboratories;
    private Administrador administrador;

    public Sistema(ArrayList<Drug> lista_drugs,
                   ArrayList<Substance> lista_substancias_ativas,
                   Map<Substance, ArrayList<FoodInteractions>> dic_interacoes_alimentares,
                   ArrayList<Pharmaceutical> lista_pharmaceuticals,
                   ArrayList<Laboratories> lista_industrias_farmaceuticas,
                   Administrador administrador) {
        this.lista_drugs = lista_drugs;
        this.list_substances = list_substances;
        this.dic_foodInteractions = dic_foodInteractions;
        this.lista_pharmaceuticals = lista_pharmaceuticals;
        this.list_laboratories = list_laboratories;
        this.administrador = administrador;
    }

    public ArrayList<Drug> getLista_medicamentos() {
        return lista_drugs;
    }

    public void setLista_medicamentos(ArrayList<Drug> lista_drugs) {
        this.lista_drugs = lista_drugs;
    }

    public ArrayList<Substance> getLista_substancias_ativas() {
        return list_substances;
    }

    public void setLista_substancias_ativas(ArrayList<Substance> lista_substancias_ativas) {
        this.list_substances = lista_substancias_ativas;
    }

    public Map<Substance, ArrayList<FoodInteractions>> getDic_interacoes_alimentares() {
        return dic_foodInteractions;
    }

    public void setDic_interacoes_alimentares(Map<Substance, ArrayList<FoodInteractions>> dic_interacoes_alimentares) {
        this.dic_foodInteractions = dic_interacoes_alimentares;
    }

    public ArrayList<Pharmaceutical> getLista_farmaceuticos() {
        return lista_pharmaceuticals;
    }

    public void setLista_farmaceuticos(ArrayList<Pharmaceutical> lista_pharmaceuticals) {
        this.lista_pharmaceuticals = lista_pharmaceuticals;
    }

    public ArrayList<Laboratories> getLista_industrias_farmaceuticas() {
        return list_laboratories;
    }

    public void setLista_industrias_farmaceuticas(ArrayList<Laboratories> lista_industrias_farmaceuticas) {
        this.list_laboratories = lista_industrias_farmaceuticas;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public ArrayList<FoodInteractions> pesquisarInteracaoAlimentar(String nomemedicamento){
        ArrayList<FoodInteractions> InteracoesAlimentares = new ArrayList<>();
        for (Drug drug : lista_drugs){
            if (nomemedicamento.equals(drug.getNome())){
                for (Substance substanciaAtiva: drug.getSubstancias_Ativas()){
                    for (FoodInteractions interacaoalimentar: dic_foodInteractions.get(substanciaAtiva)){
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
                "lista_medicamentos=" + lista_drugs +
                ", lista_substancias_ativas=" + list_substances +
                ", dic_interacoes_alimentares=" + dic_foodInteractions +
                '}';
    }
}
