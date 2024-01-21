package domain;

import java.util.Scanner;

/**
 * Classe Creator de objetos do tipo Pharmaceutical
 */
public class PharmaceuticalCreator {

    /**
     * Método responsável por cirar o objeto do tipo Pharmaceutical
     * @return novo objeto do tipo Pharmaceutical
     */
    public static Pharmaceutical create_Pharmaceutical(){

        Scanner input = new Scanner(System.in);

        System.out.println("Digit the Username and Password:");
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Surveillance: ");
        String surveillance = input.nextLine();

        return new Pharmaceutical(username, password, name, surveillance);
    }

}
