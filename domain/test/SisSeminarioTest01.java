package Seminariosys.domain.test;


import java.util.ArrayList;
import java.util.Scanner;

public class SisSeminarioTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Cadastre o título do seminário abaixo: ");
        String titulo = input.nextLine();

        System.out.println("Cadastre o local do seminário:");
        String endereco = input.nextLine();
        Local local = new Local(endereco);

        System.out.println("Cadastre o nome do professor:");
        String nome = input.nextLine();
        System.out.println("Cadastre a especialidade do professor:");
        String especialidade = input.nextLine();
        Professor professor = new Professor(nome, especialidade);


        System.out.println("Quantos estudantes deseja cadastrar?");
        int numEstudantes = input.nextInt();

        ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
        for (int i = 0; i < numEstudantes; i++) {
            input.nextLine();
            System.out.println("Cadastre o nome do estudante:");
            String nomeEst = input.nextLine();

            System.out.println("Cadastre a idade do estudante:");
            int idade = input.nextInt();

            Estudante estudante = new Estudante(nomeEst, idade);
            estudantes.add(estudante);
        }

        Seminario seminario = new Seminario(titulo, estudantes, professor, local);
        System.out.println("Cadastro completo do seminário " + seminario.getTitulo());
        System.out.println(seminario.getLocal());
        System.out.println(seminario.getProfessor());
        for (Estudante estudante : estudantes) {
            System.out.println(estudante);
        }


    }
}

