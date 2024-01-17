package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class DrugCreator {

    public static Drug create_drug(String name,String form,Float dosage, Double surveillance,  ArrayList<Substance> list_substances){

        Drug drug = new Drug(name,form,dosage, surveillance, list_substances);

        return new Drug(name,form,dosage, surveillance, list_substances);

    }
}
