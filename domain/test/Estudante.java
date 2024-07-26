package Seminariosys.domain.test;

public class Estudante {
    private String nomeEst;
    private int idade;

    public Estudante(String nomeEst, int idade) {
        this.nomeEst = nomeEst;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeEst() {
        return nomeEst;
    }

    public void setNomeEst(String nomeEst) {
        this.nomeEst = nomeEst;
    }

    public String toString() {
        return "Estudante: " + nomeEst + "\nIdade: " + idade;
    }
}
