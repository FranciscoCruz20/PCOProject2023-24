package domain;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Sistemaseeder {
    private ArrayList<Drug> drugs;
    private ArrayList<Substance> substances;
    private ArrayList<FoodInteractions> foodInteractions;
    private ArrayList<FoodTypes> foodTypes;
    private ArrayList<Laboratories> laboratories;

    public Sistemaseeder(ArrayList<Drug> drugs, ArrayList<Substance> substances,
                         ArrayList<FoodInteractions> foodInteractions, ArrayList<FoodTypes> foodTypes,
                         ArrayList<Laboratories> laboratories) {
        this.drugs = drugs;
        this.substances = substances;
        this.foodInteractions = foodInteractions;
        this.foodTypes = foodTypes;
        this.laboratories = laboratories;
    }

    public void gravar(){
        try{
            FileWriter writer = new FileWriter("untitled/src/domain/dataset.json");
            Gson gson = new Gson();
            gson.toJson(this, writer);
        } catch (IOException i){
            i.printStackTrace();
        }
    }
}
