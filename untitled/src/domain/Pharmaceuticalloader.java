package domain;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Pharmaceuticalloader {
    private ArrayList<Pharmaceutical> pharmaceuticals;

    public Pharmaceuticalloader(ArrayList<Pharmaceutical> lista_pharmaceuticals) {
        this.pharmaceuticals = lista_pharmaceuticals;
    }

    public ArrayList<Pharmaceutical> getLista_pharmaceuticals() {
        return pharmaceuticals;
    }

    public void setLista_pharmaceuticals(ArrayList<Pharmaceutical> lista_pharmaceuticals) {
        this.pharmaceuticals = lista_pharmaceuticals;
    }

    public static void create_pharmaceutical_users (Sistema sistema){
        try {
            FileReader reader = new FileReader("untitled/src/domain/pharmaceuticalset.json");
            Gson gson = new Gson();
            sistema.setLista_pharmaceuticals(gson.fromJson(reader, Pharmaceuticalloader.class).getLista_pharmaceuticals());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}