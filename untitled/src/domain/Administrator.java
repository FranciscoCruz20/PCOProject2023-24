package domain;

/**
 * Classe representativa do Administrador  da aplicação
 */
public class Administrator {

    private String username;
    private String password;
    private String name;

    /**
     * Construtor com valores defaults para os seus atributos
     * O administrador é único
     */
    public Administrator() {
        this.username = "admin";
        this.password = "12345";
        this.name = "ADMIN";
    }

    /**
     * Método de login do Administrador no sistema
     * @param username
     * @param password
     * @return resultado boolean da verificação de login
     */
    public boolean login(String username, String password) {
        return Administrator.this.username.equals(username) && Administrator.this.password.equals(password);
    }

    /**
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setNome(String name) {
        this.name = name;
    }

    /**
     *
     * @return name
     */
    @Override
    public String toString() {
        return "domain.Administrador{" +
                "nome='" + name + '\'' +
                '}';
    }
}
