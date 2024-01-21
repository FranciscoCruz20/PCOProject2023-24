package domain;

import java.util.Scanner;

/**
 * Classe Creator de obejtos do tipo laboratory
 */
public class LaboratoryCreator {

    /**
     * Método responsável pela criação do objeto do tipo Laboratory
     * @return noov objeto do tipo Laboratory
     */
    public static Laboratory criar_Laboratories() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digit the Username and Password you want:");
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Surveillance: ");
        String surveillance = input.nextLine();

        return new Laboratory(username, password, name, surveillance);
    }
}
