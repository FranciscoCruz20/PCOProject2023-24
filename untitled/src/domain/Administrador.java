package domain;

public class Administrador{

    private String username;
    private String password;
    private String nome;

    public Administrador() {
        this.username = "admin";
        this.password = "12345";
        this.nome = "ADMIN";
    }

    public boolean login(String username, String password) {
        return Administrador.this.username.equals(username) && Administrador.this.password.equals(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "domain.Administrador{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
