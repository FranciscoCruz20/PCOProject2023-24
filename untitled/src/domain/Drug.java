package domain;

import java.util.ArrayList;
import java.util.Arrays;

public class Drug {

    private String Name;
    private String Form;
    private String Dosage;
    private String Laboratory;
    private String Substances;

    public Drug(String name, String form, String dosage, String laboratory, String substances) {
        Name = name;
        Form = form;
        Dosage = dosage;
        Laboratory = laboratory;
        Substances = substances;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getForm() {
        return Form;
    }

    public void setForm(String form) {
        Form = form;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String dosage) {
        Dosage = dosage;
    }

    public String getLaboratory() {
        return Laboratory;
    }

    public void setLaboratory(String laboratory) {
        Laboratory = laboratory;
    }

    public String getSubstances() {
        return Substances;
    }

    public void setSubstances(String substances) {
        Substances = substances;
    }

    public ArrayList<String> lista_substances(){
        return new ArrayList<>(Arrays.asList(this.Substances.split("|")));
    }

    @Override
    public String toString() {
        return "Drug{" +
                "Name='" + Name + '\'' +
                ", Form='" + Form + '\'' +
                ", Dosage='" + Dosage + '\'' +
                ", Laboratory='" + Laboratory + '\'' +
                ", Substances='" + Substances + '\'' +
                '}';
    }
}
