package view;

import domain.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Sistema sistema;

    public Menu(){
        this.sistema = SistemaLoader.create_System();
        sistema.dic_transform();
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
            System.out.println("5 - Exit");
            System.out.print("Answer: ");
            int option = 0;
            try {
                option = input.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Invalid Option");
                this.inical_menu();
            }
            if (option == 1) {
                this.menu_admin();
            }
            else if (option == 2) {
                this.menu_confirm_user();
            }
            else if (option == 3) {
                HandlerUC09.search_drug(sistema);
            }
            else if (option == 4) {
                HandlerUC10.search_surveillance(sistema);
            }
            else if (option == 5) {
                this.exit();
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
                    System.out.println("5 - Go Back");
                    System.out.println("6 - Exit");
                    System.out.print("Answer: ");
                    int option = input.nextInt();
                    input.nextLine();

                    if (option == 1) {
                        this.user_manage_menu();
                    }
                    else if (option == 2) {
                        this.substance_manage_menu();
                    }

                    else if (option == 3) {
                        HandlerUC09.search_drug(sistema);
                    }
                    else if (option == 4) {
                        HandlerUC10.search_surveillance(sistema);
                    }
                    else if (option == 5) {
                        this.inical_menu();

                    }
                    else if (option == 6){
                        this.exit();
                    }
                    else {
                        System.out.println("Invalid option");
                    }
                }
            } else {
                System.out.println("Invalid Username or Password");
                if (!HandlerUC01.try_again(sistema)){
                    this.inical_menu();
                }
                else {
                    this.menu_admin();
                }
            }
        }
    }

    public void user_manage_menu() throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Users manage Menu:");
        System.out.println("1 - Create user");
        System.out.println("2 - Go Back");
        System.out.println("3 - Exit");
        System.out.print("Answer: ");
        int option = 0;
        try {
            option = input.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Option");
            this.user_manage_menu();
        }
        if (option == 1) {
            HandlerUC02.register_user(this.sistema);
            this.user_manage_menu();
            }
        else if (option == 2) {
            this.menu_admin();
        }
        else if (option == 3) {
            this.exit();
        }
        else{
            System.out.println("Invalid option");
            this.user_manage_menu();
        }
    }

    public void substance_manage_menu() throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Substance manage Menu:");
        System.out.println("1 - Create substance");
        System.out.println("2 - Go Back");
        System.out.println("3 - Exit");
        System.out.print("Answer: ");
        int option = 0;
        try {
            option = input.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Option");
            this.substance_manage_menu();
        }
        if (option == 1) {
            HandlerUC03.create_Substance(sistema);
            this.substance_manage_menu();
        }
        else if (option == 2) {
            this.menu_admin();
        }
        else if (option == 3) {
            this.exit();
        }
        else{
            System.out.println("Invalid option");
            this.substance_manage_menu();
        }
    }


    public void menu_confirm_user() throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Users Menu:");
        System.out.println("Select your role:");
        System.out.println("1- Pharmaceutical");
        System.out.println("2- Laboratory");
        System.out.println("3- Go Back");
        System.out.println("4 - Exit");
        System.out.print("Answer: ");
        int option = 0;
        try {
            option = input.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Option");
            this.menu_confirm_user();
        }
        if (option == 1) {
            while (true) {
                if (HandlerUC01.login_pharmaceutical(this.sistema)){
                    this.pharmaceutical_menu();
                }
                else{
                    System.out.println("Username or Password incorrect");
                    if (!HandlerUC01.try_again(sistema)){
                        break;
                    }
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
                    if (!HandlerUC01.try_again(sistema)){
                        break;
                    }
                }
            }
        }
        else if (opcao == 3) {
            this.inical_menu();
        }
        else if (option == 4) {
            this.exit();
        }
        else {
            System.out.println("Invalid Option");
            this.menu_confirm_user();
        }
    }

    public void pharmaceutical_menu() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Phamaceutical Menu:");
        System.out.println("1 - Create food interaction");
        System.out.println("2 - Search drugs");
        System.out.println("3 - Search Surveillance");
        System.out.println("4 - Go Back");
        System.out.println("5 - Exit");
        System.out.print("Answer: ");
        int option = 0;
        try {
            option = input.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Option");
            this.pharmaceutical_menu();
        }
        if (option == 1) {
            HandlerUC05.create_foodInteractions(sistema);
            this.pharmaceutical_menu();
        }
        else if (option == 2) {
            HandlerUC09.search_drug(sistema);
            this.pharmaceutical_menu();
        }
        else if (option == 3) {
            HandlerUC10.search_surveillance(sistema);
            this.pharmaceutical_menu();
        }
        else if (option == 4) {
            this.inical_menu();
        }
        else if (option == 5) {
            this.exit();
        }
        else {
            System.out.println("Invalid Option");
            this.pharmaceutical_menu();
        }
    }

    public void laboratory_menu() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Laboratory Menu:");
        System.out.println("1 - Create drugs");
        System.out.println("2 - Search drugs");
        System.out.println("3 - Search Surveillance");
        System.out.println("4 - Go Back");
        System.out.println("5 - Exit");
        System.out.print("Answer: ");
        int option = 0;
        try {
            option = input.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Option");
            this.laboratory_menu();
        }
        if (option == 1) {
            HandlerUC07.create_Drug(sistema);
            this.laboratory_menu();
        }
        else if (option == 2) {
            HandlerUC09.search_drug(sistema);
            this.laboratory_menu();
        }
        else if (option == 3) {
            HandlerUC10.search_surveillance(sistema);
            this.laboratory_menu();
        }
        else if (option == 4) {
            this.inical_menu();
        }
        else if (option == 5) {
            this.exit();
        }
        else {
            System.out.println("Invalid Option");
            this.laboratory_menu();
        }
    }

    public void exit(){
        System.out.println("\nGoing to sleep\n");
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
