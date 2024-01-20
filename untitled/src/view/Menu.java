package view;

import domain.*;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 */
public class Menu {
    Sistema sistema;

    /**
     *
     */
    public Menu() {
        this.sistema = SistemaLoader.create_System();
    }

    /**
     * @throws IOException
     */
    public void inical_menu() throws IOException {
        Sistemaseeder sistemaseeder = new Sistemaseeder(this.sistema.getDrugs(), this.sistema.getSubstances(),
                this.sistema.getFoodInteractions(), this.sistema.getLaboratories());
        sistemaseeder.gravar();
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
                this.confirm_admin();
            }
            if (option == 2) {
                this.menu_confirm_user();
            }
            if (option == 3) {
                // Implementar a pesquisa de medicamentos
            }
            if (option == 4) {
                // Implementar a pesquisa de contactos
            } else {
                System.out.println("Invalid option");
            }
        }
    }

    /**
     * @throws IOException
     */
    public void confirm_admin() throws IOException {
        Administrator administrator = new Administrator();
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Digit your Username and Password:");
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();

            if (administrator.login(username, password)) {
                this.menu_admin();
            } else {
                System.out.println("Invalid Username or Password");
            }
        }
    }

    /**
     * @throws IOException
     */
    public void menu_admin() throws IOException {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Administrator Menu:");
            System.out.println("1 - Manage Users");
            System.out.println("2 - Manage Substances");
            System.out.println("3 - Search drugs");
            System.out.println("4 - Search Surveillance");
            System.out.println("5 - Exit");

            int option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                this.menu_manage_users();
            }
            if (option == 2) {
                this.menu_manage_substances();
            }
            if (option == 3) {
                // metem o nome e dá as informações
            }
            if (option == 4) {
                // metem o nome e dá as informações
            }
            if (option == 5) {
                this.inical_menu();

            } else {
                System.out.println("Invalid option");
            }
        }
    }


    /**
     * @throws IOException
     */
    public void menu_manage_substances() throws IOException {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Administrator Manage Substances Menu:");
            System.out.println("1 - Create Substance");
            System.out.println("2 - Delete Substance");
            System.out.println("3 - Search Substance");
            System.out.println("4 - Exit");

            int option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                //Implementar a criação de uma substancia
            }
            if (option == 2) {
                //Implementar o delete de uma substancia
            }
            if (option == 3) {
                //Implementar a pesquisa de uma substancia
            }
            if (option == 4) {
                this.menu_admin();
            } else {
                System.out.println("Invalid option");
            }
        }
    }

    /**
     * @throws IOException
     */
    public void menu_manage_users() throws IOException {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Administrator Manage Users Menu:");
            System.out.println("1 - Create User");
            System.out.println("2 - Delete User");
            System.out.println("3 - Exit");

            int option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                //Implementar a criação de um user
            }
            if (option == 2) {
                //Implementar o delete de um user
            }
            if (option == 3) {
                this.menu_admin();
            } else {
                System.out.println("Invalid option");
            }
        }
    }

    /**
     * @throws IOException
     */
    public void menu_confirm_user() throws IOException {

        HandlerUC01 handlerUC01 = new HandlerUC01();

        Scanner input = new Scanner(System.in);
        System.out.println("Users Menu:");
        System.out.println("Select your role:");
        System.out.println("1- Pharmaceutical");
        System.out.println("2- Laboratorie");
        System.out.println("3- Exit");
        int option = input.nextInt();
        input.nextLine();
        if (option == 1) {
            handlerUC01.login_pharmaceutical();
        }
        else if(option ==2) {
            handlerUC01.login_laboratorie();
        }
        else if(option ==3) {
        this.inical_menu();
    }
}

    /**
     *
     * @throws IOException
     */
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


    /**
     *
     * @throws IOException
     */
    public void laboratorie_menu() throws IOException {
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
}
