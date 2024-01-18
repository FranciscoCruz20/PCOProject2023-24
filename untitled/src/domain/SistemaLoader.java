package domain;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class SistemaLoader {
    public static Sistema create_System (){
        try {
            System.out.println("4");
            FileReader reader = new FileReader("untitled/src/domain/dataset.json");
            System.out.println("3");
            Gson gson = new Gson();
            System.out.println("1");
            return gson.fromJson(reader, Sistema.class);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("2");
            return new Sistema();
        }
    }
}
