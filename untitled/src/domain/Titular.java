package domain;

public class Titular {

    private String nome;

    public Titular(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "domain.Titular{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
