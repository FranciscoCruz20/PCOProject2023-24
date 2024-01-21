package domain;

import java.io.FileNotFoundException;

public class Pharmaceutical extends User {

    private String Name;
    private String Surveillance;

    public Pharmaceutical(String username, String password, String name, String surveillance) {
        super(username, password);
        this.Name = name;
        this.Surveillance = surveillance;
    }

    /**
     *
     * @return Name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.Name = name;
    }

    /**
     *
     * @return Surveillance
     */
    public String getSurveillance() {
        return Surveillance;
    }

    /**
     *
     * @param surveillance
     */
    public void setSurveillance(String surveillance) {
        this.Surveillance = surveillance;
    }

    /**
     *
     * @return Name, Surveillance
     */
    @Override
    public String toString() {
        return "Pharmaceutical{" +
                "Name='" + Name + '\'' +
                ", Surveillance='" + Surveillance + '\'' +
                super.toString() +
                '}';
    }
}
