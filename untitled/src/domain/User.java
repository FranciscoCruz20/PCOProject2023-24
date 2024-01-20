package domain;

public class User {

    private String Username;
    private String Password;

    public User(String username, String password) {
        this.Username = username;
        this.Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    @Override
    public String toString() {
        return "domain.Utilizador{" +
                "username='" + Username + '\'' +
                ", password='" + Password + '\'' +
                '}';
    }
}
