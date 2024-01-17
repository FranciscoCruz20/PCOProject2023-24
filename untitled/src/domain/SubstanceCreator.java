package domain;

public class SubstanceCreator {

    public static Substance create_Substance(String name) {

        Substance substance = new Substance(name);
        return new Substance(name);
    }
}
