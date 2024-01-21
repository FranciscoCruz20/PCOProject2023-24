package domain;


import java.util.Scanner;

/**
 * Classe responsável pelo caso de uso casual UC02
 * Registrar Utilizador
 * Contém métodos responsáveis pela registro de 2 tipos de utilizadores
 * Só o Administrador pode chamar estes métodos
 */
public class HandlerUC02 {

    public static void register_user(Sistema sistema){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("What would you like to register:");
            System.out.println("1- Pharmaceutical");
            System.out.println("2- Laboratory");
            System.out.println("3- Exit");
            int opcao = input.nextInt();
            if (opcao == 1) {
                HandlerUC02.register_pharmaceutical(sistema);
            }
            if (opcao == 2) {
                HandlerUC02.register_laboratory(sistema);
            }
            if (opcao == 3) {
                break;
            } else {
                System.out.println("Invalid option");
            }
        }
    }

    public static void register_pharmaceutical(Sistema sistema){
        Pharmaceutical pharmaceutical = PharmaceuticalCreator.create_Pharmaceutical();
        sistema.add_pharmaceutical(pharmaceutical);
    }

    public static void register_laboratory(Sistema sistema){
        Scanner input = new Scanner(System.in);
        System.out.println("Whats the name of the laboratory you wish to register:");
        String name_laboratory = input.nextLine();
        Laboratory laboratory = sistema.search_laboratory(name_laboratory);
        if (laboratory != null){
            System.out.println("Digit your Username and Password:");
            System.out.print("Username: ");
            String username = input.nextLine();
            laboratory.setUsername(username);
            System.out.print("Password: ");
            String password = input.nextLine();
            laboratory.setPassword(password);
            sistema.add_laboratory_user(laboratory);
            System.out.println("Laboratory Registered");
        }
        else {
            System.out.println("It doesnt exist a laboratory with that name");
            System.out.println("Would you like to create a new laboratory with that name?(y or n)");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("y")){
                Laboratory laboratory1 = LaboratoryCreator.criar_Laboratories();
                System.out.println("Laboratory Registered and created");
                sistema.add_laboratory(laboratory1);
                sistema.add_laboratory_user(laboratory1);
            }
        }
    }
}
