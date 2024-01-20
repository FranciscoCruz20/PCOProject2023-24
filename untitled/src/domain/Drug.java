package domain;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Classe representativa dos medicamentos
 */
public class Drug {

    private String Name;
    private String Form;
    private String Dosage;
    private String Laboratory;
    private String Substances;

    /**
     * Construtor
     * @param name
     * @param form
     * @param dosage
     * @param laboratory
     * @param substances
     */
    public Drug(String name, String form, String dosage, String laboratory, String substances) {
        Name = name;
        Form = form;
        Dosage = dosage;
        Laboratory = laboratory;
        Substances = substances;
    }

    /**
     *
     * @return Name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     *
     * @return Form
     */
    public String getForm() {
        return Form;
    }

    /**
     *
     * @param form
     */
    public void setForm(String form) {
        Form = form;
    }

    /**
     *
     * @return Dosage
     */
    public String getDosage() {
        return Dosage;
    }

    /**
     *
     * @param dosage
     */
    public void setDosage(String dosage) {
        Dosage = dosage;
    }

    /**
     *
     * @return Laboratory
     */
    public String getLaboratory() {
        return Laboratory;
    }

    /**
     *
     * @param laboratory
     */
    public void setLaboratory(String laboratory) {
        Laboratory = laboratory;
    }

    /**
     *
     * @return Substance
     */
    public String getSubstances() {
        return Substances;
    }

    /**
     *
     * @param substances
     */
    public void setSubstances(String substances) {
        Substances = substances;
    }

    /**
     *
     * @return lista_substances
     */
    public ArrayList<String> lista_substances(){
        return new ArrayList<>(Arrays.asList(this.Substances.split("|")));
    }

    /**
     *
     * @return Name, Form, Dosage, Laboratory, Substance
     */
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
