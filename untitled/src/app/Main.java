package app;

import domain.Utente;
import view.Menu;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Utente utent = new Utente();
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
