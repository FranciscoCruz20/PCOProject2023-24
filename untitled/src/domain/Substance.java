package domain;

import java.util.Objects;

/**
 * Classe representatia de uma substance
 */
public class Substance {

    private String Substance;

    /**
     * Construtor
     * @param nome
     */
    public Substance(String nome) {
        this.Substance = nome;
    }

    /**
     *
     * @return Substance
     */
    public String getSubstance() {
        return Substance;
    }

    /**
     *
     * @param substance
     */
    public void setSubstance(String substance) {
        Substance = substance;
    }

    /**
     *
     * @return Substance
     */
    @Override
    public String toString() {
        return "Substance{" +
                "Substance='" + Substance + '\'' +
                '}';
    }

    /**
     *
     * @param o
     * @return true se for igual, false caso contrário
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Substance substance)) return false;
        return Objects.equals(Substance, substance.Substance);
    }

    /**
     *
     * @return código hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(Substance);
    }
}
