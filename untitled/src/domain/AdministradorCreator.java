package domain;

/**
 * Classe creator do tipo Administrator
 * Responsável pela criação do objeto do tipo Administrator
 */
public class AdministradorCreator {

    /**
     * Método que cria o objeto, default de acordo com o seu construtor
     * @return novo objeto do tipo administrator
     */
    public static Administrator create_Administrator(){
        return new Administrator();
    }

}
