package domain;


/**
 * Classe representativa de um User
 */
public class User {

    private String Username;
    private String Password;

    /**
     * Construtor
     * @param username
     * @param password
     */
    public User(String username, String password) {
        this.Username = username;
        this.Password = password;
    }

    /**
     *
     * @return Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.Username = username;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return Password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.Password = password;
    }

    /**
     *
     * @return Username, Password
     */
    @Override
    public String toString() {
        return "domain.Utilizador{" +
                "username='" + Username + '\'' +
                ", password='" + Password + '\'' +
                '}';
    }
}
