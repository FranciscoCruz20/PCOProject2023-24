package app;

import view.Menu;

import java.io.IOException;

/**
 * Classe Main do projeto
 * Responsável por dar run na aplicação
 */
public class Main {

    /**
     * Método principal do projeto
     * Cria dois objetos do tipo Utente e Menu que são o ponto de partida do projeto
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{
        Menu menu = new Menu();
        try {
            menu.inical_menu();
        }
        catch (Exception e){
            e.printStackTrace();
            menu.exit();
        }
    }
}
