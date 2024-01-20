package domain;

public class DrugCreator {

    public static Drug create_drug(String name,String form,String dosage, String laboratory,  String list_substances){

        Drug drug = new Drug(name,form,dosage, laboratory, list_substances);

        return new Drug(name,form,dosage, laboratory, list_substances);

    }
}
