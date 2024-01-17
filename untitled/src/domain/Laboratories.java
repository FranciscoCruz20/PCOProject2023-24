package domain;

public class Laboratories extends Utilizador {

    private String name;
    private String surveillance;

    public Laboratories(String username, String password, String name, String surveillance) {
        super(username, password);
        this.name = name;
        this.surveillance = surveillance;
    }

    public void criar_Laboratories(){
        LaboratoriesCreator.criar_Laboratories();
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
