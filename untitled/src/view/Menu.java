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
            System.out.println("4 - Search Surveillance");

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
            if (option == 4) {
                //lista os contatos
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
                    System.out.println("3 - Search Drugs");
                    System.out.println("4 - Search Surveillance");
                    System.out.println("5 - Exit");

                    int option = input.nextInt();
                    input.nextLine();

                    if (option == 1) {
                        this.user_manage_menu();
                    }
                    if (option == 2) {
                        this.substance_manage_menu();
                    }

                    if (option == 3) {
                        //lista as droguinhas
                    }
                    if (option == 4) {
                        //lista os contatos
                    }
                    if (option == 5) {
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

    public void user_manage_menu() throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Users manage Menu:");
        System.out.println("1- Create user");
        System.out.println("2- Delete user");
        System.out.println("3- Exit");
        int opcao = input.nextInt();
        input.nextLine();
        if (opcao == 1) {
            HandlerUC02.register_user(this.sistema);
            }
        if (opcao == 2) {
            //implementar o apagar user
        }
        if (opcao == 3) {
            this.menu_admin();
        }
        else{
            System.out.println("Invalid option");
        }
    }

    public void substance_manage_menu() throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Substance manage Menu:");
        System.out.println("1- Create substance");
        System.out.println("2- Delete substance");
        System.out.println("3 - Search Substance");
        System.out.println("4 - Exit");
        int opcao = input.nextInt();
        input.nextLine();
        if (opcao == 1) {
            //Implementar handler 3
        }
        if (opcao == 2) {
            //implementar o apagar substancia
        }
        if (opcao == 3) {
            //implementar a pesquisa das substancias
        }
        if (opcao == 4) {
            this.menu_admin();
        }
        else{
            System.out.println("Invalid option");
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
                    this.pharmaceutical_menu();
                }
                else{
                    System.out.println("Username or Password incorrect");
                }
            }
        }
        else if (opcao == 2) {
            while (true) {
                if (HandlerUC01.login_laboratory(this.sistema)){
                    this.laboratory_menu();
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

    public void pharmaceutical_menu() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Phamaceutical Menu:");
        System.out.println("1 - Delete your food interactions");
        System.out.println("2 - Create food interaction");
        System.out.println("3 - Search drugs");
        System.out.println("4 - Search Surveillance");
        System.out.println("5 - Search your food interactions");
        System.out.println("6- Exit");
        int option = input.nextInt();
        input.nextLine();
        if (option == 1) {
            //Implementar o apagar das interações que fizeram
        }
        if (option == 2) {
            // implementar a criação
        }
        if (option == 3) {
            // metem o nome e dá a informação
        }
        if (option == 4) {
            // metem o nome e dá a informação
        }
        if (option == 5) {
            // lista os 10 primeiros dele
        }
        if (option == 6) {
            this.inical_menu();
        }
    }

    public void laboratory_menu() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Laboratorie Menu:");
        System.out.println("1 - Create drugs");
        System.out.println("2 - Delete drugs");
        System.out.println("3 - Search drugs");
        System.out.println("4 - Search Surveillance");
        System.out.println("5 - Search your drugs");
        System.out.println("6- Exit");
        int option = input.nextInt();
        input.nextLine();
        if (option == 1) {
            //criar medicamento
        }
        if (option == 2) {
            // apagar medicamento
        }
        if (option == 3) {
            //mete o nome e dá a informação
        }
        if (option == 4) {
            //mete o nome e dá a informação
        }
        if (option == 5) {
            //lista os 10 primeiros dele
        }
        if (option == 6) {
            this.inical_menu();
        }
    }

    public void sair(){
        Sistemaseeder sistemaseeder = new Sistemaseeder(sistema.getDrugs(), sistema.getSubstances(),
                                                        sistema.getFoodInteractions(), sistema.getLaboratories());
        sistemaseeder.gravar();
        Laboratoryseeder laboratoryseeder = new Laboratoryseeder(sistema.getLaboratories_user());
        laboratoryseeder.gravar();
        Pharmaceuticalseeder pharmaceuticalseeder = new Pharmaceuticalseeder(sistema.getLista_pharmaceuticals());
        pharmaceuticalseeder.gravar();
        System.exit(0);
    }
}
