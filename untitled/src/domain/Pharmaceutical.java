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

    public static void create_Pharmaceutical() throws FileNotFoundException {
        PharmaceuticalCreator.create_Pharmaceutical();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getSurveillance() {
        return Surveillance;
    }

    public void setSurveillance(String surveillance) {
        this.Surveillance = surveillance;
    }

    @Override
    public String toString() {
        return "Pharmaceutical{" +
                "Name='" + Name + '\'' +
                ", Surveillance='" + Surveillance + '\'' +
                super.toString() +
                '}';
    }
}
