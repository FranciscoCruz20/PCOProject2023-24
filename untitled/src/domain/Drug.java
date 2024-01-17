package domain;

import java.util.ArrayList;

public class Drug {

    private String name;
    private String form;
    private float dosage;
    private double surveillance;
    private ArrayList<Substance> substances;

    public Drug(String name, String form, float dosage, double surveillance, ArrayList<Substance> substances) {
        this.name = name;
        this.form = form;
        this.dosage = dosage;
        this.surveillance = surveillance;
        this.substances = substances;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public float getDosage() {
        return dosage;
    }

    public void setDosage(float dosage) {
        this.dosage = dosage;
    }

    public double getSurveillancea() {
        return surveillance;
    }

    public void setSurveillance(double surveillance) {
        this.surveillance = surveillance;
    }

    public ArrayList<Substance> getSubstances() {
        return substances;
    }

    public void setSubstances(ArrayList<Substance> substances) {
        this.substances = substances;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "name='" + name + '\'' +
                ", form='" + form + '\'' +
                ", dosage=" + dosage +
                ", surveillance=" + surveillance +
                ", substances=" + substances +
                '}';
    }
}
