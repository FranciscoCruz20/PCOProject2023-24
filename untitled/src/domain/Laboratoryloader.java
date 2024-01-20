package domain;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Laboratoryloader {

    private ArrayList<Laboratory> laboratories;

    public Laboratoryloader(ArrayList<Laboratory> laboratories_user) {
        this.laboratories = laboratories_user;
    }

    public ArrayList<Laboratory> getLaboratories_user() {
        return laboratories;
    }

    public void setLaboratories_user(ArrayList<Laboratory> laboratories_user) {
        this.laboratories = laboratories_user;
    }

    public static void create_Laboratory_users (Sistema sistema){
        try {
            FileReader reader = new FileReader("untitled/src/domain/laboratorieset.json");
            Gson gson = new Gson();
            sistema.setLaboratories_user(gson.fromJson(reader, Laboratoryloader.class).getLaboratories_user());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
