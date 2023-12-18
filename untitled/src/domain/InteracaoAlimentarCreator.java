package domain;

public class InteracaoAlimentarCreator {

    public static InteracaoAlimentar criar_Interacao_Alimentar(SubstanciaAtiva substanciaAtiva, String explicacao, String alimento, String efeito, String referencia_bibliografica){

        InteracaoAlimentar interacaoAlimentar = new InteracaoAlimentar(explicacao, alimento, efeito, referencia_bibliografica, substanciaAtiva);
        return new InteracaoAlimentar(explicacao, alimento, efeito, referencia_bibliografica, substanciaAtiva);
    }
}
