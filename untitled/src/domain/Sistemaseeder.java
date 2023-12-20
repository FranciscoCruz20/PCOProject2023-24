package domain;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Sistemaseeder {
    private final ArrayList<Object> lista;
    private final String filename;

    public Sistemaseeder(ArrayList<Object> lista, String filename) {
        this.lista = lista;
        this.filename = filename;
    }

    public void gravar(){
        Gson gson = new Gson();
        String jsonLista =gson.toJson(lista);
        try{
            FileWriter writer = new FileWriter(filename);
            writer.write(jsonLista);
            writer.close();
        } catch (IOException i){
            i.printStackTrace();
        }
    }
}
