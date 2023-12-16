package domain;

import java.io.*;
import java.util.ArrayList;

/**
 * Classe dedicada a leitura e escrita de ficheiros
 */
public class EscreverFicheiros {

    /**
     *
     * @param filePath
     * @return ArrayList
     */
    private static ArrayList<String> readFile(String filePath) {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    /**
     * Método que escreve os dados dos utilizadores num ficheiro txt. especifico
     * @param utilizadores
     * @param fileName
     */
    public static void writeToFile(ArrayList<Utilizador> utilizadores, String fileName) {
        try (FileWriter fileWriter = new FileWriter("Utilizadores.txt", true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            for (Utilizador utilizador : utilizadores) {
                printWriter.println("Nome: " +Utilizador.getUsername() + ", Password: " + utilizador.getPassword() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}