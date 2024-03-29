package domain;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

/**
 * Classe loader do Sistema
 */
public class SistemaLoader {

    /**
     * Método responsável pela criação do sistema
     * Carregamento do dataset
     * @return
     */
    public static Sistema create_System (){
        try {
            FileReader reader = new FileReader("untitled/src/domain/dataset.json");
            Gson gson = new Gson();
            return gson.fromJson(reader, Sistema.class);
        } catch (IOException e) {
            e.printStackTrace();
            return new Sistema();
        }
    }
}
