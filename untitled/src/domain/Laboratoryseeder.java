package domain;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Laboratoryseeder {
    private ArrayList<Laboratory> laboratories_user;

    public Laboratoryseeder(ArrayList<Laboratory> laboratories) {
        this.laboratories_user = laboratories;
    }

    public void gravar(){
        try{
            FileWriter writer = new FileWriter("untitled/src/domain/laboratorieset.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(this, writer);
        } catch (IOException i){
            i.printStackTrace();
        }
    }
}