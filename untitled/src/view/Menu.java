package view;

import domain.*;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Sistema sistema;

    public Menu(){
        this.sistema = SistemaLoader.create_System();
        Pharmaceuticalloader.create_pharmaceutical_users(this.sistema);
        Laboratoryloader.create_Laboratory_users(this.sistema);
    }

    public void inical_menu() throws IOException {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome new Utent, what you want to do ");
            System.out.println("1 - Login as an Admin");
            System.out.println("2 - Login as an User");
            System.out.println("3 - Search drugs");

            int option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                this.menu_admin();
            }
            if (option == 2) {
                this.menu_confirm_user();
            }
            if (option == 3) {
                // Implementar a pesquisa de medicamentos
            }
            else {
                System.out.println("Invalid option");
            }
        }
    }

    public void menu_admin() throws IOException {

        Administrator administrator = new Administrator();
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Digit your Username and Password:");
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();

            if (administrator.login(username, password)) {
                while (true) {
                    System.out.println("Administrator Menu:");
                    System.out.println("1 - Manage Users");
                    System.out.println("2 - Manage Substances");
                    System.out.println("3 - Exit");

                    int option = input.nextInt();
                    input.nextLine();

                    if (option == 1) {

                    }
                    if (option == 2) {

                    } else if (option == 3) {
                        this.inical_menu();

                    } else {
                        System.out.println("Invalid option");
                    }
                }
            } else {
                System.out.println("Invalid Username or Password");
            }
        }
    }

    public void menu_confirm_user() throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Users Menu:");
        System.out.println("Select your role:");
        System.out.println("1- Pharmaceutical");
        System.out.println("2- Laboratory");
        System.out.println("3- Exit");
        int opcao = input.nextInt();
        input.nextLine();
        if (opcao == 1) {
            while (true) {
                if (HandlerUC01.login_pharmaceutical(this.sistema)){
                    this.Phamaceutical_menu();
                }
                else{
                    System.out.println("Username or Password incorrect");
                }
            }
        }
        else if (opcao == 2) {
            while (true) {
                if (HandlerUC01.login_laboratory(this.sistema)){
                    this.Laboratory_menu();
                }
                else {
                    System.out.println("Username or Password incorrect");
                }
            }
        }
        else if (opcao == 3) {
            this.inical_menu();
        }
    }

    public void Phamaceutical_menu() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Phamaceutical Menu:");
        System.out.println("1 - Manage your food interactions");
        System.out.println("2 - Create food interaction");
        System.out.println("3 - Exit");
        int opcao = input.nextInt();
        input.nextLine();
        if (opcao == 1) {
            //Implementar a pesquisa das interações que fizeram
        }
        if (opcao == 2) {

        }
        if (opcao == 3) {
            this.inical_menu();
        }
    }

    public void Laboratory_menu() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Laboratorie Menu:");
        System.out.println("1- Manage your drugs");
        System.out.println("2- Search substances");
        System.out.println("3- Exit");
        int opcao = input.nextInt();
        input.nextLine();
        if (opcao == 1) {

        }
        if (opcao == 2) {

        }
        if (opcao == 3) {
            this.inical_menu();
        }
    }
}
