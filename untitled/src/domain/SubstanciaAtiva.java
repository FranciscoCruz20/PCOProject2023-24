package domain;

public class SubstanciaAtiva {

    private String nome;

    public SubstanciaAtiva(String nome) {
        this.nome = nome;
    }

    /*public static void criar_SubstanciaAtiva(){
        SubstanciaAtivaCreator.criar_SubstanciaAtiva();
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "domain.SubstanciaAtiva{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
