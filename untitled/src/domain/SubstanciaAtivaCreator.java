package domain;

public class SubstanciaAtivaCreator {

    public static SubstanciaAtiva criar_SubstanciaAtiva(String nome) {

        SubstanciaAtiva substanciaAtiva = new SubstanciaAtiva(nome);
        return new SubstanciaAtiva(nome);
    }
}
