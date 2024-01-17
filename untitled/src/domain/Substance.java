package domain;

public class Substance {

    private String name;

    public Substance(String nome) {
        this.name = name;
    }

    /*public static void criar_SubstanciaAtiva(){
        SubstanciaAtivaCreator.criar_SubstanciaAtiva();
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
