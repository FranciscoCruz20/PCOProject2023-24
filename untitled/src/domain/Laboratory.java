package domain;

public class Laboratories extends User {

    private String Name;
    private String Surveillance;


    public Laboratories(String username, String password, String name, String surveillance) {
        super(username, password);
        this.Name = name;
        this.Surveillance = surveillance;
    }

    public Laboratories(String name, String surveillance){
        super("", "");
        this.Name = name;
        this.Surveillance = surveillance;
    }

    public void criar_Laboratories(){
        LaboratoriesCreator.criar_Laboratories();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurveillance() {
        return Surveillance;
    }

    public void setSurveillance(String surveillance) {
        Surveillance = surveillance;
    }

    @Override
    public String toString() {
        return "Laboratories{" +
                "Name='" + Name + '\'' +
                ", Surveillance='" + Surveillance + '\'' + super.toString()
                +  '}';
    }
}
