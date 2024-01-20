package domain;

import java.util.Objects;

public class Substance {

    private String Substance;

    public Substance(String nome) {
        this.Substance = nome;
    }

    /*public static void criar_SubstanciaAtiva(){
        SubstanciaAtivaCreator.criar_SubstanciaAtiva();
    }*/

    public String getSubstance() {
        return Substance;
    }

    public void setSubstance(String substance) {
        Substance = substance;
    }

    @Override
    public String toString() {
        return "Substance{" +
                "Substance='" + Substance + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Substance substance)) return false;
        return Objects.equals(Substance, substance.Substance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Substance);
    }
}
