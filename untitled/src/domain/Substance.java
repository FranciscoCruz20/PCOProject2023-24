package domain;

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
}
