package domain;

import java.util.Scanner;

/**
 * Classe responsável pelo caso de uso casual UC01
 * Autentica Utilizador
 * Contém métodos responsáveis pela autenticação de 2 tipos de utilizadores
 */
public class HandlerUC01 {

    public static boolean login_pharmaceutical(Sistema sistema) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Digit your Username and Password:");
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
            return sistema.login_pharmaceutical(username, password);
        }
    }

    public static boolean login_laboratory(Sistema sistema) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Digit your Username and Password:");
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
            return sistema.login_laboratory(username, password);
        }
    }

}
