package domain;

import java.io.FileNotFoundException;

public class Pharmaceutical extends Utilizador {

    private String name;
    private String surveillance;

    public Pharmaceutical(String username, String password, String name, String surveillance) {
        super(username, password);
        this.name = name;
        this.surveillance = surveillance;
    }

    public static void create_Pharmaceutical() throws FileNotFoundException {
        PharmaceuticalCreator.create_Pharmaceutical();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurveillance() {
        return surveillance;
    }

    public void setSurveillance(String surveillance) {
        this.surveillance = surveillance;
    }
}
