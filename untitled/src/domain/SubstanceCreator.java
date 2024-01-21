package domain;


/**
 * Classe creator do tipo Substance
 */
public class SubstanceCreator {

    /**
     * Método responsável pela criação do novo objeto
     * @param name
     * @return novo objeto do tipo Substance
     */
    public static Substance create_Substance(String name) {

        Substance substance = new Substance(name);
        return new Substance(name);
    }
}
