package domain;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Classe responsável pela escriva no set de laboratory
 */
public class Laboratoryseeder {
    private ArrayList<Laboratory> laboratories;

    public Laboratoryseeder(ArrayList<Laboratory> laboratories) {
        this.laboratories = laboratories;
    }

    /**
     * Método responsável pela escrita no set de laboratory
     */
    public void gravar(){
        try{
            FileWriter writer = new FileWriter("untitled/src/domain/laboratorieset.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(this, writer);
            writer.close();
        } catch (IOException i){
            i.printStackTrace();
        }
    }
}
