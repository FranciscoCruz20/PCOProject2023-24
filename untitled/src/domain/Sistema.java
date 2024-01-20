package domain;

import java.util.ArrayList;
import java.util.HashMap;

public class Sistema {
    private ArrayList<Drug> drugs;
    private ArrayList<Substance> substances;
    private HashMap<Substance, ArrayList<FoodInteractions>> dic_foodInteractions;
    private ArrayList<FoodInteractions> foodInteractions;
    private ArrayList<Pharmaceutical> lista_pharmaceuticals;
    private ArrayList<Laboratories> laboratories;
    private Administrator administrator;

    public Sistema(ArrayList<Drug> drugs, ArrayList<Substance> substances, HashMap<Substance,
            ArrayList<FoodInteractions>> dic_foodInteractions, ArrayList<FoodInteractions> foodInteractions,
                   ArrayList<Pharmaceutical> lista_pharmaceuticals,
                   ArrayList<Laboratories> laboratories, Administrator administrator) {
        this.drugs = drugs;
        this.substances = substances;
        this.dic_foodInteractions = dic_foodInteractions;
        this.foodInteractions = foodInteractions;
        this.lista_pharmaceuticals = lista_pharmaceuticals;
        this.laboratories = laboratories;
        this.administrator = administrator;
    }

    public Sistema() {
        this.drugs = new ArrayList<>();
        this.substances = new ArrayList<>();
        this.dic_foodInteractions = new HashMap<>();
        this.foodInteractions = new ArrayList<>();
        this.lista_pharmaceuticals = new ArrayList<>();
        this.laboratories = new ArrayList<>();
        this.administrator = new Administrator();
    }

    public ArrayList<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(ArrayList<Drug> drugs) {
        this.drugs = drugs;
    }

    public ArrayList<Substance> getSubstances() {
        return substances;
    }

    public void setSubstances(ArrayList<Substance> substances) {
        this.substances = substances;
    }

    public HashMap<Substance, ArrayList<FoodInteractions>> getDic_foodInteractions() {
        return dic_foodInteractions;
    }

    public void setDic_foodInteractions(HashMap<Substance, ArrayList<FoodInteractions>> dic_foodInteractions) {
        this.dic_foodInteractions = dic_foodInteractions;
    }

    public ArrayList<FoodInteractions> getFoodInteractions() {
        return foodInteractions;
    }

    public void setFoodInteractions(ArrayList<FoodInteractions> foodInteractions) {
        this.foodInteractions = foodInteractions;
    }

    public ArrayList<Pharmaceutical> getLista_pharmaceuticals() {
        return lista_pharmaceuticals;
    }

    public void setLista_pharmaceuticals(ArrayList<Pharmaceutical> lista_pharmaceuticals) {
        this.lista_pharmaceuticals = lista_pharmaceuticals;
    }

    public ArrayList<Laboratories> getLaboratories() {
        return laboratories;
    }

    public void setLaboratories(ArrayList<Laboratories> laboratories) {
        this.laboratories = laboratories;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    /*
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
        */
    @Override
    public String toString() {
        return "Sistema{" +
                "drugs=" + drugs +
                ", substances=" + substances +
                ", dic_foodInteractions=" + dic_foodInteractions +
                ", foodInteractions=" + foodInteractions +
                ", lista_pharmaceuticals=" + lista_pharmaceuticals +
                ", laboratories=" + laboratories +
                ", administrator=" + administrator +
                '}';
    }
}
