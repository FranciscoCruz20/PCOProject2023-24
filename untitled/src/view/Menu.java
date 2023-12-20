package view;
import domain.*;

import java.io.IOException;
import java.util.Scanner;


/**
 * Classe responsável pelo arranque de todos os casos de uso
 */
public class Menu {

    /**
     * Método que representa o menu inicial do programa coma acesso ao menu de administrador e de utilizador
     * @throws IOException
     */
    public static void menu_inicial() throws IOException {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Menu de administrador");
            System.out.println("2 - Menu de utilizador");

            int opcao = input.nextInt();
            input.nextLine();

            if (opcao == 1) {
                menu_admin();
            }
            if (opcao == 2) {
                menu_confirmacao_utilizador();
            }
            else {
                System.out.println("Opção inválida");
            }
        }
    }

    //Administrador:

    /**
     * Método que apresenta o menu de administrador
     * Com autenticação de dados de acesso
     * Criação e verificação de utilizadores
     * Criação e verificação de clientes
     * @throws IOException
     */
    public static void menu_admin() throws IOException {

        Administrador administrador = new Administrador();
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Insira o nome de utilizador e password:");
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();

            if (administrador.login(username, password)) {
                while (true) {
                    System.out.println("Menu:");
                    System.out.println("1 - ");
                    System.out.println("2 - ");
                    System.out.println("3 - ");
                    System.out.println("4 - ");
                    System.out.println("5 - Sair");

                    int opcao = input.nextInt();
                    input.nextLine();

                    if (opcao == 1) {

                    }
                    if (opcao == 2) {

                    }
                    else if (opcao == 3) {

                    }
                    else if (opcao == 4) {

                    }
                    else if (opcao == 5) {

                        menu_inicial();
                    }
                    else {
                        System.out.println("Opção inválida");
                    }
                }
            } else{

                System.out.println("Username ou password incorretos");
            }
        }
    }

    //Utilizadores:

    /**
     * Método que apresenta o menu de utilizador
     * Criação de licenças
     * Criação de utilizadorestma
     * Criação de pools
     * @throws IOException
     */
    public static void menu_utilizador() throws IOException {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Menu utilizador:");
            System.out.println("1-Criar licença");
            System.out.println("2-Criar utilizadorTMA");
            System.out.println("3-Criar uma pool");
            System.out.println("4-Sair");
            int opcao = input.nextInt();
            input.nextLine();

            if (opcao == 1) {
                HandlerUC04.criar_licenca();
            }
            else if (opcao == 2){
                HandlerUC06.inserir_dados_tma();
            }
            else if (opcao == 3) {
                Pool.criar_pool();
            }
            else if (opcao == 4) {
                menu_inicial();
            }
            else {
                System.out.println("Opção inválida");
            }
        }
    }

    /**
     * Método que representa o menu de autenticação de acesso ao menu de utilziadores
     * @throws IOException
     */
    public static void menu_confirmacao_utilizador() throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Menu de utilizadores:");
        System.out.println("1- Farmaceutico");
        System.out.println("2- Indistruia farmaceutica");
        System.out.println("3- Sair");
        int opcao = input.nextInt();
        input.nextLine();
        if (opcao == 1){
            while (true) {
                System.out.println("Insira o username e a sua password:");
                System.out.print("Username: ");
                String username = input.nextLine();
                System.out.print("Password: ");
                String password = input.nextLine();
        }
    }
}