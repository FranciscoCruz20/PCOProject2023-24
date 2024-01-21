package domain;

import java.util.Scanner;

/**
 * Classe responsável pelo caso de uso casual UC01
 * Autentica Utilizador
 * Contém métodos responsáveis pela autenticação de 2 tipos de utilizadores
 */
public class HandlerUC01 {

    /**
     * Método responsável pelo login do utilizador do tipo farmaceutico
     * @param sistema
     * @return true se for bem sucedido, false caso contrário
     */
    public static boolean login_pharmaceutical(Sistema sistema) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digit your Username and Password:");
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
        return sistema.login_pharmaceutical(username, password);
    }

    /**
     * Método responsável pelo login do utilizador do tipo Industria Farmaceutica
     * @param sistema
     * @return true se for bem sucedido, false caso contrário
     */
    public static boolean login_laboratory(Sistema sistema) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digit your Username and Password:");
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
        return sistema.login_laboratory(username, password);
    }

    /**
     * Método que permite ao utilizador voltar a fazer o login caso ele erre uma vez no seu login
     * @param sistema
     * @return true se quiser repetir, false caso não queira
     */
    public static boolean try_again(Sistema sistema){
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to try again?(yes/no)");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("yes")){
            return true;
        }
        else if (answer.equalsIgnoreCase("no")){
            return false;
        }
        else {
            System.out.println("Invalid option");
            HandlerUC01.try_again(sistema);
        }
        return false;
    }
}
