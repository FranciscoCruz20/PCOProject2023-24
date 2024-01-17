package domain;

public class Administrator {

    private String username;
    private String password;
    private String name;

    public Administrator() {
        this.username = "admin";
        this.password = "12345";
        this.name = "ADMIN";
    }

    public boolean login(String username, String password) {
        return Administrator.this.username.equals(username) && Administrator.this.password.equals(password);
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

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "domain.Administrador{" +
                "nome='" + name + '\'' +
                '}';
    }
}
