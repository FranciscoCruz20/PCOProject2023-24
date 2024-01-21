package domain;

import java.util.ArrayList;
import java.util.HashMap;

public class Sistema {
    private ArrayList<Drug> drugs;
    private ArrayList<Substance> substances;
    private HashMap<String, ArrayList<FoodInteractions>> dic_foodInteractions;
    private ArrayList<FoodInteractions> foodInteractions;
    private ArrayList<Pharmaceutical> lista_pharmaceuticals;
    private ArrayList<Laboratory> laboratories_user;
    private ArrayList<Laboratory> laboratories;
    private Administrator administrator;

    public Sistema(ArrayList<Drug> drugs, ArrayList<Substance> substances, ArrayList<FoodInteractions> foodInteractions,
                   ArrayList<Pharmaceutical> lista_pharmaceuticals,
                   ArrayList<Laboratory> laboratories, Administrator administrator) {
        this.drugs = drugs;
        this.substances = substances;
        this.foodInteractions = foodInteractions;
        this.lista_pharmaceuticals = lista_pharmaceuticals;
        this.laboratories = laboratories;
        this.administrator = administrator;
        this.dic_foodInteractions = new HashMap<>();
        this.laboratories_user = new ArrayList<>();
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

    public ArrayList<Laboratory> getLaboratories_user() {
        return laboratories_user;
    }

    public void setLaboratories_user(ArrayList<Laboratory> laboratories_user) {
        this.laboratories_user = laboratories_user;
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

    public HashMap<String, ArrayList<FoodInteractions>> getDic_foodInteractions() {
        return dic_foodInteractions;
    }

    public void setDic_foodInteractions(HashMap<String, ArrayList<FoodInteractions>> dic_foodInteractions) {
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

    public ArrayList<Laboratory> getLaboratories() {
        return laboratories;
    }

    public void setLaboratories(ArrayList<Laboratory> laboratories) {
        this.laboratories = laboratories;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public void add_laboratory_user(Laboratory laboratory){
        this.laboratories_user.add(laboratory);
    }

    public void add_laboratory(Laboratory laboratory){
        this.laboratories.add(laboratory);
    }

    public void add_pharmaceutical(Pharmaceutical pharmaceutical){
        this.lista_pharmaceuticals.add(pharmaceutical);
    }

    public void add_foodInteraction(FoodInteractions foodInteraction){this.foodInteractions.add(foodInteraction);}

    public void add_drug(Drug drug){this.drugs.add(drug);}

    public Laboratory search_laboratory(String name){
        for (Laboratory laboratory: this.laboratories){
            if (laboratory.getName().equals(name)){
                return laboratory;
            }
        }
        return null;
    }

    public boolean exist_Substance(String name){
        for (Substance substance: substances){
            if (substance.getSubstance().equals(name)){
                return true;
            }
        }
        return false;
    }

    public boolean exist_foodInteraction(FoodInteractions foodInteraction){
        for (FoodInteractions foodInteraction1: foodInteractions){
            if (foodInteraction.equals(foodInteraction1)){
                return true;
            }
        }
        return false;
    }

    public boolean exist_drug(Drug drug){
        for (Drug drug1: drugs){
            if (drug.equals(drug1)){
                return true;
            }
        }
        return false;
    }

    public boolean login_laboratory(String username, String password){
        for (Laboratory laboratory_user: this.laboratories_user){
            if (laboratory_user.getUsername().equals(username) && laboratory_user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public boolean login_pharmaceutical(String username, String password){
        for (Pharmaceutical pharmaceutical_user: this.lista_pharmaceuticals){
            if (pharmaceutical_user.getUsername().equals(username) && pharmaceutical_user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public Drug search_Drug(String name){
        for (Drug drug: drugs){
            if (drug.getName().equals(name)){
                return drug;
            }
        }
        return null;
    }

    public Laboratory search_Laboratory(String name){
        for (Laboratory laboratory: laboratories){
            if (laboratory.getName().equals(name)){
                return laboratory;
            }
        }
        return null;
    }

    public HashMap<String, ArrayList<FoodInteractions>> searchFoodInteractions(String drugname){
        HashMap<String, ArrayList<FoodInteractions>> dic_food_substance = new HashMap<>();
        Drug drug = search_Drug(drugname);
        if (drug != null){
            for (String substance_name: drug.lista_substances()){
                dic_food_substance.put(substance_name, dic_foodInteractions.get(substance_name));
            }
            return dic_food_substance;
        }
        System.out.println("Drug doesnt exist");
        return dic_food_substance;
    }



    public void dic_transform(){
        for (FoodInteractions foodInteraction: this.foodInteractions){
            ArrayList<String> substances_names = foodInteraction.lista_substances();
            for (String substance_name: substances_names){
                if (this.dic_foodInteractions.containsKey(substance_name)){
                    ArrayList<FoodInteractions> foodInteractions1 = this.dic_foodInteractions.get(substance_name);
                    foodInteractions1.add(foodInteraction);
                    this.dic_foodInteractions.put(substance_name, foodInteractions1);
                    break;
                }
                else{
                    ArrayList<FoodInteractions> foodInteractions2 = new ArrayList<>();
                    foodInteractions2.add(foodInteraction);
                    this.dic_foodInteractions.put(substance_name, foodInteractions2);
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Sistema{" +
                "drugs=" + drugs +
                ", substances=" + substances +
                ", dic_foodInteractions=" + dic_foodInteractions +
                ", foodInteractions=" + foodInteractions +
                ", lista_pharmaceuticals=" + lista_pharmaceuticals +
                ", laboratories_user=" + laboratories_user +
                ", laboratories=" + laboratories +
                ", administrator=" + administrator +
                '}';
    }
}
