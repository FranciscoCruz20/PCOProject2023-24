package domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Sistemaseeder {
    private ArrayList<Drug> drugs;
    private ArrayList<Substance> substances;
    private ArrayList<FoodInteractions> foodInteractions;
    private ArrayList<Laboratory> laboratories;

    public Sistemaseeder(ArrayList<Drug> drugs, ArrayList<Substance> substances,
                         ArrayList<FoodInteractions> foodInteractions,
                         ArrayList<Laboratory> laboratories) {
        this.drugs = drugs;
        this.substances = substances;
        this.foodInteractions = foodInteractions;
        this.laboratories = laboratories;
    }

    public void gravar(){
        try{
            FileWriter writer = new FileWriter("untitled/src/domain/dataset2.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(this, writer);
        } catch (IOException i){
            i.printStackTrace();
        }
    }
}
