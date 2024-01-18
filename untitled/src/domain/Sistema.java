package domain;

import java.util.ArrayList;
import java.util.Map;

public class Sistema {
    private ArrayList<Drug> lista_drugs;
    private ArrayList<Substance> list_substances;
    private Map<Substance, ArrayList<FoodInteractions>> dic_foodInteractions;
    private ArrayList<Pharmaceutical> lista_pharmaceuticals;
    private ArrayList<Laboratories> list_laboratories;
    private Administrator administrator;

    public Sistema(ArrayList<Drug> lista_drugs,
                   ArrayList<Substance> lista_substancias_ativas,
                   Map<Substance, ArrayList<FoodInteractions>> dic_interacoes_alimentares,
                   ArrayList<Pharmaceutical> lista_pharmaceuticals,
                   ArrayList<Laboratories> lista_industrias_farmaceuticas,
                   Administrator administrator) {
        this.lista_drugs = lista_drugs;
        this.list_substances = list_substances;
        this.dic_foodInteractions = dic_foodInteractions;
        this.lista_pharmaceuticals = lista_pharmaceuticals;
        this.list_laboratories = list_laboratories;
        this.administrator = administrator;
    }

    public Sistema(){
        this.lista_drugs = lista_drugs;
        this.list_substances = list_substances;
        this.dic_foodInteractions = dic_foodInteractions;
        this.lista_pharmaceuticals = lista_pharmaceuticals;
        this.list_laboratories = list_laboratories;
        this.administrator = administrator;
    }

    public ArrayList<Drug> getLista_drugs() {
        return lista_drugs;
    }

    public void setLista_drugs(ArrayList<Drug> lista_drugs) {
        this.lista_drugs = lista_drugs;
    }

    public ArrayList<Substance> getList_substances() {
        return list_substances;
    }

    public void setList_substances(ArrayList<Substance> list_substances) {
        this.list_substances = list_substances;
    }

    public Map<Substance, ArrayList<FoodInteractions>> getDic_foodInteractions() {
        return dic_foodInteractions;
    }

    public void setDic_foodInteractions(Map<Substance, ArrayList<FoodInteractions>> dic_foodInteractions) {
        this.dic_foodInteractions = dic_foodInteractions;
    }

    public ArrayList<Pharmaceutical> getLista_pharmaceuticals() {
        return lista_pharmaceuticals;
    }

    public void setLista_pharmaceuticals(ArrayList<Pharmaceutical> lista_pharmaceuticals) {
        this.lista_pharmaceuticals = lista_pharmaceuticals;
    }

    public ArrayList<Laboratories> getList_laboratories() {
        return list_laboratories;
    }

    public void setList_laboratories(ArrayList<Laboratories> list_laboratories) {
        this.list_laboratories = list_laboratories;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public Administrator getAdministrador() {
        return administrator;
    }

    public void setAdministrador(Administrator administrator) {
        this.administrator = administrator;
    }

    public ArrayList<FoodInteractions> searchFoodInteractions(String drugname){
        ArrayList<FoodInteractions> FoodInteractions = new ArrayList<>();
        for (Drug drug : lista_drugs){
            if (drugname.equals(drug.getName())){
                for (Substance substance: drug.getSubstances()){
                    for (FoodInteractions foodInteractions: dic_foodInteractions.get(substance)){
                        System.out.println(foodInteractions);
                        FoodInteractions.add(foodInteractions);
                    }
                }
                return FoodInteractions;
            }
        }
        return FoodInteractions;
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
