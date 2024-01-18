package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sistema {
    private ArrayList<Drug> drugs;
    private ArrayList<Substance> substances;
    private HashMap<Substance, ArrayList<FoodInteractions>> dic_foodInteractions;
    private ArrayList<FoodInteractions> foodInteractions;
    private ArrayList<FoodTypes> foodTypes;
    private ArrayList<Pharmaceutical> lista_pharmaceuticals;
    private ArrayList<Laboratories> laboratories;
    private Administrator administrator;

    public Sistema(ArrayList<Drug> drugs, ArrayList<Substance> substances, HashMap<Substance,
            ArrayList<FoodInteractions>> dic_foodInteractions, ArrayList<FoodInteractions> foodInteractions,
                   ArrayList<FoodTypes> foodTypes, ArrayList<Pharmaceutical> lista_pharmaceuticals,
                   ArrayList<Laboratories> laboratories, Administrator administrator) {
        this.drugs = drugs;
        this.substances = substances;
        this.dic_foodInteractions = dic_foodInteractions;
        this.foodInteractions = foodInteractions;
        this.foodTypes = foodTypes;
        this.lista_pharmaceuticals = lista_pharmaceuticals;
        this.laboratories = laboratories;
        this.administrator = administrator;
    }

    public Sistema() {
        this.drugs = new ArrayList<>();
        this.substances = new ArrayList<>();
        this.dic_foodInteractions = new HashMap<>();
        this.foodInteractions = new ArrayList<>();
        this.foodTypes = new ArrayList<>();
        this.lista_pharmaceuticals = new ArrayList<>();
        this.laboratories = new ArrayList<>();
        this.administrator = new Administrator();
    }

    public Map<Substance, ArrayList<FoodInteractions>> getDic_foodInteractions() {
        return dic_foodInteractions;
    }

    public void setDic_foodInteractions(HashMap<Substance, ArrayList<FoodInteractions>> dic_foodInteractions) {
        this.dic_foodInteractions = dic_foodInteractions;
    }

    public ArrayList<Pharmaceutical> getLista_pharmaceuticals() {
        return lista_pharmaceuticals;
    }

    public void setLista_pharmaceuticals(ArrayList<Pharmaceutical> lista_pharmaceuticals) {
        this.lista_pharmaceuticals = lista_pharmaceuticals;
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
        for (Drug drug : drugs){
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
                "lista_medicamentos=" + drugs +
                ", lista_substancias_ativas=" + substances +
                ", dic_interacoes_alimentares=" + dic_foodInteractions +
                '}';
    }
}
