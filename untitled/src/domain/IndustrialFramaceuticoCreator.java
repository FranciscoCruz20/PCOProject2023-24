package domain;

import java.util.Scanner;

public class IndustrialFramaceuticoCreator {

    public static IndustriaFramaceutica criar_IndustriaFarmaceutica() {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o username, password e nome da Industria Farmaceutica:");
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("password: ");
        String password = input.nextLine();
        System.out.print("Nome da Industria: ");
        String nome = input.nextLine();
        System.out.print("Contato da Industria: ");
        String contato = input.nextLine();

        IndustriaFramaceutica industriaFramaceutica = new IndustriaFramaceutica(username,password,nome, contato);

        return new IndustriaFramaceutica(username, password, nome, contato);
    }
}
