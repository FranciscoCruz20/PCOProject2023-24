package domain;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PharmaceuticalCreator {

    public static Pharmaceutical create_Pharmaceutical() throws FileNotFoundException{

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o username, password e nome do Farmaceutico:");
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("password: ");
        String password = input.nextLine();
        System.out.print("Nome do Farmaceutico: ");
        String name = input.nextLine();
        System.out.print("Contato do Farmaceutico: ");
        String surveillance = input.nextLine();

        Pharmaceutical pharmaceutical = new Pharmaceutical(username,password,name, surveillance);

        return new Pharmaceutical(username, password, name, surveillance);
    }

}
