package domain;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FarmaceuticoCreator {

    public static Farmaceutico criar_Farmaceutico() throws FileNotFoundException{

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o username, password e nome do Farmaceutico:");
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("password: ");
        String password = input.nextLine();
        System.out.print("Nome do Farmaceutico: ");
        String nome = input.nextLine();
        System.out.print("Contato do Farmaceutico: ");
        String contato = input.nextLine();

        Farmaceutico farmaceutico = new Farmaceutico(username,password,nome, contato);

        return new Farmaceutico(username, password, nome, contato);
    }

}
