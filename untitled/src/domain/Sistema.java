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

    public Laboratory search_laboratory(String name){
        for (Laboratory laboratory: this.laboratories){
            if (laboratory.getName().equals(name)){
                return laboratory;
            }
        }
        return null;
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

    public ArrayList<FoodInteractions> searchFoodInteractions(String drugname){
        ArrayList<FoodInteractions> FoodInteractions = new ArrayList<>();
        for (Drug drug : drugs){
            if (drugname.equals(drug.getName())){
                for (String substance_name: drug.lista_substances()){
                    for (FoodInteractions foodInteractions: dic_foodInteractions.get(substance_name)){
                        System.out.println(foodInteractions);
                        FoodInteractions.add(foodInteractions);
                    }
                }
                return FoodInteractions;
            }
        }
        return FoodInteractions;
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
