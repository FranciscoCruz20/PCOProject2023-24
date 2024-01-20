package domain;

/**
 * Classe responsável pela criação dos objetos do tipo Drug
 */
public class DrugCreator {

    /**
     * Método responsável pela criação do objeto
     * @param name
     * @param form
     * @param dosage
     * @param laboratory
     * @param list_substances
     * @return novo objeto Drug
     */
    public static Drug create_drug(String name,String form,String dosage, String laboratory,  String list_substances){

        Drug drug = new Drug(name,form,dosage, laboratory, list_substances);

        return new Drug(name,form,dosage, laboratory, list_substances);

    }
}
