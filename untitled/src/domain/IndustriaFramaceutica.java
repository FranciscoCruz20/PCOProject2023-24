package domain;

public class IndustriaFramaceutica extends Utilizador {

    private String nome;
    private String contato;

    public IndustriaFramaceutica(String username, String password, String nome, String contato) {
        super(username, password);
        this.nome = nome;
        this.contato = contato;
    }

    public void criar_IndustriaFarmaceutica(){
        IndustrialFramaceuticoCreator.criar_IndustriaFarmaceutica();
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
        return "domain.IndustriaFramaceutica{" +
                "nome='" + nome + '\'' +
                ", contato='" + contato + '\'' +
                '}';
    }
}
