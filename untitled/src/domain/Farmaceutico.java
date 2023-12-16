package domain;

public class Farmaceutico extends Utilizador {

    private String nome;
    private String contato;

    public Farmaceutico(String username, String password, String nome, String contato) {
        super(username, password);
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "domain.Farmaceutico{" +
                "nome='" + nome + '\'' +
                ", contato='" + contato + '\'' +
                '}';
    }
}
