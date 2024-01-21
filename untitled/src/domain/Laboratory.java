package domain;

/**
 * Classe representativa de um laboratory
 */
public class Laboratory extends User {

    private String Name;
    private String Surveillance;


    /**
     * Construtor
     * @param username
     * @param password
     * @param name
     * @param surveillance
     */
    public Laboratory(String username, String password, String name, String surveillance) {
        super(username, password);
        this.Name = name;
        this.Surveillance = surveillance;
    }

    /**
     * Construtor
     * Casos diferentes
     * @param name
     * @param surveillance
     */
    public Laboratory(String name, String surveillance){
        super("", "");
        this.Name = name;
        this.Surveillance = surveillance;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     *
     * @return surveillance
     */
    public String getSurveillance() {
        return Surveillance;
    }

    /**
     *
     * @param surveillance
     */
    public void setSurveillance(String surveillance) {
        Surveillance = surveillance;
    }

    /**
     *
     * @return name, surveillance
     */
    @Override
    public String toString() {
        return "Laboratories{" +
                "Name='" + Name + '\'' +
                ", Surveillance='" + Surveillance + '\'' + super.toString()
                +  '}';
    }
}
