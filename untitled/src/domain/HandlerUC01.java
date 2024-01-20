package domain;

import java.util.Scanner;

/**
 * Classe responsável pelo caso de uso casual UC01
 * Autentica Utilizador
 * Contém métodos responsáveis pela autenticação de 2 tipos de utilizadores
 */
public class HandlerUC01 {

    public void login_pharmaceutical() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Digit your Username and Password:");
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
        }
    }

    public void login_laboratorie() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Digit your Username and Password:");
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
        }
    }

}
