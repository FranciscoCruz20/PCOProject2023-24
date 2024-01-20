package domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Pharmaceuticalseeder {
    private ArrayList<Pharmaceutical> pharmaceutical_user;

    public Pharmaceuticalseeder(ArrayList<Pharmaceutical> pharmaceuticals) {
        this.pharmaceutical_user = pharmaceuticals;
    }

    public void gravar(){
        try{
            FileWriter writer = new FileWriter("untitled/src/domain/pharmaceuticalset.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(this, writer);
        } catch (IOException i){
            i.printStackTrace();
        }
    }
}
