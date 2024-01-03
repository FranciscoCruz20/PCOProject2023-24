package domain;

import java.util.ArrayList;

public class Medicamento {

    private String nome;
    private String forma_farmaceutica;
    private float dosagem;
    private double contato_farmacovigilancia;
    private ArrayList<SubstanciaAtiva> substancias_ativas;

    public Medicamento(String nome, String forma_farmaceutica, float dosagem, double contato_farmacovigilancia, ArrayList<SubstanciaAtiva> substancias_ativas) {
        this.nome = nome;
        this.forma_farmaceutica = forma_farmaceutica;
        this.dosagem = dosagem;
        this.contato_farmacovigilancia = contato_farmacovigilancia;
        this.substancias_ativas = substancias_ativas;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getForma_farmaceutica() {
        return forma_farmaceutica;
    }

    public void setForma_farmaceutica(String forma_farmaceutica) {
        this.forma_farmaceutica = forma_farmaceutica;
    }

    public float getDosagem() {
        return dosagem;
    }

    public void setDosagem(float dosagem) {
        this.dosagem = dosagem;
    }

    public double getContato_farmacovigilancia() {
        return contato_farmacovigilancia;
    }

    public void setContato_farmacovigilancia(double contato_farmacovigilancia) {
        this.contato_farmacovigilancia = contato_farmacovigilancia;
    }

    public ArrayList<SubstanciaAtiva> getSubstancias_Ativas() {
        return substancias_ativas;
    }

    public void setSubstanciaAtiva(ArrayList<SubstanciaAtiva> substancias_ativas) {
        this.substancias_ativas = substancias_ativas;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nome='" + nome + '\'' +
                ", forma_farmaceutica='" + forma_farmaceutica + '\'' +
                ", dosagem=" + dosagem +
                ", contato_farmacovigilancia=" + contato_farmacovigilancia +
                ", substancias_ativas=" + substancias_ativas +
                '}';
    }
}
