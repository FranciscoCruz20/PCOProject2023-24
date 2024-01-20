package domain;

import java.util.Scanner;

public class LaboratoryCreator {

    public static Laboratory criar_Laboratories() {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o username, password e nome da Industria Farmaceutica:");
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("password: ");
        String password = input.nextLine();
        System.out.print("Nome da Industria: ");
        String name = input.nextLine();
        System.out.print("Contato da Industria: ");
        String surveillance = input.nextLine();

        return new Laboratory(username, password, name, surveillance);
    }
}
