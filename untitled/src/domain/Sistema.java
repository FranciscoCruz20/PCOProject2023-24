package domain;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Classe representativa do Sistema
 */
public class Sistema {
    private ArrayList<Drug> drugs;
    private ArrayList<Substance> substances;
    private HashMap<String, ArrayList<FoodInteractions>> dic_foodInteractions;
    private ArrayList<FoodInteractions> foodInteractions;
    private ArrayList<Pharmaceutical> lista_pharmaceuticals;
    private ArrayList<Laboratory> laboratories_user;
    private ArrayList<Laboratory> laboratories;
    private Administrator administrator;

    /**
     * Construtor
     * @param drugs
     * @param substances
     * @param foodInteractions
     * @param lista_pharmaceuticals
     * @param laboratories
     * @param administrator
     */
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

    /**
     * Construtor
     */
    public Sistema() {
        this.drugs = new ArrayList<>();
        this.substances = new ArrayList<>();
        this.dic_foodInteractions = new HashMap<>();
        this.foodInteractions = new ArrayList<>();
        this.lista_pharmaceuticals = new ArrayList<>();
        this.laboratories = new ArrayList<>();
        this.administrator = new Administrator();
    }

    /**
     *
     * @return laboratories_user
     */
    public ArrayList<Laboratory> getLaboratories_user() {
        return laboratories_user;
    }

    /**
     *
     * @param laboratories_user
     */
    public void setLaboratories_user(ArrayList<Laboratory> laboratories_user) {
        this.laboratories_user = laboratories_user;
    }

    /**
     *
     * @return drugs
     */
    public ArrayList<Drug> getDrugs() {
        return drugs;
    }

    /**
     *
     * @param drugs
     */
    public void setDrugs(ArrayList<Drug> drugs) {
        this.drugs = drugs;
    }

    /**
     *
     * @return substances
     */
    public ArrayList<Substance> getSubstances() {
        return substances;
    }

    /**
     *
     * @param substances
     */
    public void setSubstances(ArrayList<Substance> substances) {
        this.substances = substances;
    }

    /**
     *
     * @return dic_foodInteractions
     */
    public HashMap<String, ArrayList<FoodInteractions>> getDic_foodInteractions() {
        return dic_foodInteractions;
    }

    /**
     *
     * @param dic_foodInteractions
     */
    public void setDic_foodInteractions(HashMap<String, ArrayList<FoodInteractions>> dic_foodInteractions) {
        this.dic_foodInteractions = dic_foodInteractions;
    }

    /**
     *
     * @return foodInteractions
     */
    public ArrayList<FoodInteractions> getFoodInteractions() {
        return foodInteractions;
    }

    /**
     *
     * @param foodInteractions
     */
    public void setFoodInteractions(ArrayList<FoodInteractions> foodInteractions) {
        this.foodInteractions = foodInteractions;
    }

    /**
     *
     * @return lista_pharmaceuticals
     */
    public ArrayList<Pharmaceutical> getLista_pharmaceuticals() {
        return lista_pharmaceuticals;
    }

    /**
     *
     * @param lista_pharmaceuticals
     */
    public void setLista_pharmaceuticals(ArrayList<Pharmaceutical> lista_pharmaceuticals) {
        this.lista_pharmaceuticals = lista_pharmaceuticals;
    }

    /**
     *
     * @return laboratories
     */
    public ArrayList<Laboratory> getLaboratories() {
        return laboratories;
    }

    /**
     *
     * @param laboratories
     */
    public void setLaboratories(ArrayList<Laboratory> laboratories) {
        this.laboratories = laboratories;
    }

    /**
     *
     * @return administrator
     */
    public Administrator getAdministrator() {
        return administrator;
    }

    /**
     *
     * @param administrator
     */
    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    /**
     *
     * @param laboratory
     */
    public void add_laboratory_user(Laboratory laboratory){
        this.laboratories_user.add(laboratory);
    }

    /**
     *
     * @param laboratory
     */
    public void add_laboratory(Laboratory laboratory){
        this.laboratories.add(laboratory);
    }

    /**
     *
     * @param pharmaceutical
     */
    public void add_pharmaceutical(Pharmaceutical pharmaceutical){
        this.lista_pharmaceuticals.add(pharmaceutical);
    }

    /**
     *
     * @param foodInteraction
     */
    public void add_foodInteraction(FoodInteractions foodInteraction){this.foodInteractions.add(foodInteraction);}

    /**
     *
     * @param drug
     */
    public void add_drug(Drug drug){this.drugs.add(drug);}

    /**
     * Método que pesquisa um laboratory
     * @param name
     * @return
     */
    public Laboratory search_laboratory(String name){
        for (Laboratory laboratory: this.laboratories){
            if (laboratory.getName().equals(name)){
                return laboratory;
            }
        }
        return null;
    }

    /**
     * Método que procura a existência de uma determinada substance
     * @param name
     * @return true caso substance exista, false caso contrário
     */
    public boolean exist_Substance(String name){
        for (Substance substance: substances){
            if (substance.getSubstance().equals(name)){
                return true;
            }
        }
        return false;
    }

    /**
     * Método que procura a existência de um laboratory
     * @param name
     * @return true caso laboratory exista, false caso contrário
     */
    public boolean exist_Laboratory(String name){
        for (Laboratory laboratory: laboratories){
            if (laboratory.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    /**
     * Método que procura a existência de uma determinada foodInteraction
     * @param foodInteraction
     * @return true caso exista, false caso contrário
     */
    public boolean exist_foodInteraction(FoodInteractions foodInteraction){
        for (FoodInteractions foodInteraction1: foodInteractions){
            if (foodInteraction.equals(foodInteraction1)){
                return true;
            }
        }
        return false;
    }

    /**
     * Método que procura a existência de uma determinada drug
     * @param drug
     * @return true caso exista, false caso contrário
     */
    public boolean exist_drug(Drug drug){
        for (Drug drug1: drugs){
            if (drug.equals(drug1)){
                return true;
            }
        }
        return false;
    }

    /**
     * Método de login de laboratory
     * @param username
     * @param password
     * @return true para caso as informações sejam iguais às existentes, false caso contrário
     */
    public boolean login_laboratory(String username, String password){
        for (Laboratory laboratory_user: this.laboratories_user){
            if (laboratory_user.getUsername().equals(username) && laboratory_user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    /**
     * Método de login de pharmaceutical
     * @param username
     * @param password
     * @return true para caso as informações sejam iguais às existentes, false caso contrário
     */
    public boolean login_pharmaceutical(String username, String password){
        for (Pharmaceutical pharmaceutical_user: this.lista_pharmaceuticals){
            if (pharmaceutical_user.getUsername().equals(username) && pharmaceutical_user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    /**
     * Método de procura de uma drug especifica
     * @param name
     * @return drug
     */
    public Drug search_Drug(String name){
        for (Drug drug: drugs){
            if (drug.getName().equals(name)){
                return drug;
            }
        }
        return null;
    }

    /**
     * Método de procura de um laboratory especifico
     * @param name
     * @return laboratory
     */
    public Laboratory search_Laboratory(String name){
        for (Laboratory laboratory: laboratories){
            if (laboratory.getName().equals(name)){
                return laboratory;
            }
        }
        return null;
    }

    /**
     * Método de procura de foodInteractions associadas a uma drug
     * @param drugname
     * @return dic_food_substance
     */
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


    /**
     * Método responsável pela transformação em dicionário
     */
    public void dic_transform(){
        for (FoodInteractions foodInteraction: this.foodInteractions){
            ArrayList<String> substances_names = foodInteraction.lista_substances();
            for (String substance_name: substances_names){
                if (!substance_name.equals("")) {
                    if (this.dic_foodInteractions.containsKey(substance_name)) {
                        ArrayList<FoodInteractions> foodInteractions1 = this.dic_foodInteractions.get(substance_name);
                        foodInteractions1.add(foodInteraction);
                        this.dic_foodInteractions.put(substance_name, foodInteractions1);
                    } else {
                        ArrayList<FoodInteractions> foodInteractions2 = new ArrayList<>();
                        foodInteractions2.add(foodInteraction);
                        this.dic_foodInteractions.put(substance_name, foodInteractions2);
                    }
                }
            }
        }
    }

    /**
     * Método responsável por adiconar ao dicionário
     * @param foodInteraction
     */
    public void add_to_dic(FoodInteractions foodInteraction){
        ArrayList<String> substances_names = foodInteraction.lista_substances();
        for (String substance_name: substances_names){
            if (!substance_name.equals("")) {
                if (this.dic_foodInteractions.containsKey(substance_name)) {
                    ArrayList<FoodInteractions> foodInteractions1 = this.dic_foodInteractions.get(substance_name);
                    foodInteractions1.add(foodInteraction);
                    this.dic_foodInteractions.put(substance_name, foodInteractions1);
                } else {
                    ArrayList<FoodInteractions> foodInteractions2 = new ArrayList<>();
                    foodInteractions2.add(foodInteraction);
                    this.dic_foodInteractions.put(substance_name, foodInteractions2);
                }
            }
        }
    }

    /**
     *
     * @return drugs, substances,dic_foodInteractions,foodInteractions,lista_pharmaceuticals,laboratories_user,laboratories,administrator
     */
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
