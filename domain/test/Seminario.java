package Seminariosys.domain.test;

import java.util.ArrayList;

public class Seminario {
    private String titulo;
    private Estudante[] estudantes;
    private Professor professor;
    private Local local;
    private ArrayList<Estudante> listaEstudantes = new ArrayList<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public Estudante[] getEstudante() {
        return estudantes;
    }

    public void setEstudante(Estudante[] estudante) {
        this.estudantes = estudante;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Seminario(String titulo, ArrayList<Estudante> estudante, Professor professor, Local local) {
        this.titulo = titulo;
        this.estudantes = estudantes;
        this.professor = professor;
        this.local = local;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.listaEstudantes = estudantes;

    }
    public String toString() {
        return titulo;
    }
}
