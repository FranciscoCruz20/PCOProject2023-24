package domain;

public class InteracaoAlimentar {
    private String explicacao;
    private String alimento;
    private String efeito;
    private String referencia_bibliografica;
    private SubstanciaAtiva substanciaAtiva;

    public InteracaoAlimentar(String explicacao, String alimento, String efeito, String referencia_bibliografica, SubstanciaAtiva substanciaAtiva) {
        this.explicacao = explicacao;
        this.alimento = alimento;
        this.efeito = efeito;
        this.referencia_bibliografica = referencia_bibliografica;
        this.substanciaAtiva = substanciaAtiva;
    }

    public String getExplicacao() {
        return explicacao;
    }

    public void setExplicacao(String explicacao) {
        this.explicacao = explicacao;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public String getReferencia_bibliografica() {
        return referencia_bibliografica;
    }

    public void setReferencia_bibliografica(String referencia_bibliografica) {
        this.referencia_bibliografica = referencia_bibliografica;
    }

    public SubstanciaAtiva getSubstanciaAtiva() {
        return substanciaAtiva;
    }

    public void setSubstanciaAtiva(SubstanciaAtiva substanciaAtiva) {
        this.substanciaAtiva = substanciaAtiva;
    }

    @Override
    public String toString() {
        return "InteracaoAlimentar{" +
                "explicacao='" + explicacao + '\'' +
                ", alimento='" + alimento + '\'' +
                ", efeito='" + efeito + '\'' +
                ", referencia_bibliografica='" + referencia_bibliografica + '\'' +
                ", substanciaAtiva=" + substanciaAtiva +
                '}';
    }
}
