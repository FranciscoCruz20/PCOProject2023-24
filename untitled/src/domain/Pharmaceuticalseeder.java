package domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Classe seeder de Pharmaceutical
 * Escreve no set de Pharamceutical
 */
public class Pharmaceuticalseeder {
    private ArrayList<Pharmaceutical> pharmaceuticals;

    public Pharmaceuticalseeder(ArrayList<Pharmaceutical> pharmaceuticals) {
        this.pharmaceuticals = pharmaceuticals;
    }

    /**
     * Método responsável pela escrita no set de Pharmaceutical
     */
    public void gravar(){
        try{
            FileWriter writer = new FileWriter("untitled/src/domain/pharmaceuticalset.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(this, writer);
            writer.close();
        } catch (IOException i){
            i.printStackTrace();
        }
    }
}
