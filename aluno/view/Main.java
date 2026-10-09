package aluno.view;

import aluno.model.Aluno;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner flabebe = new Scanner(System.in);
        Aluno novoaluno = new Aluno();
        System.out.print("Escreva o nome do aluno: ");
        String nome = flabebe.next();
        novoaluno.setNome(nome);
        System.out.print("Escreva a matricula do aluno: ");
        int matricula = flabebe.nextInt();
        novoaluno.setMatricula(matricula);
        System.out.print("Escreva a nota do aluno: ");
        Double nota = flabebe.nextDouble();
        novoaluno.setNotaFinal(nota);

        System.out.println("Nome do Aluno: " + novoaluno.getNome() + "\n Matricula: " + novoaluno.getMatricula() + "\n Nota final do Aluno: " + novoaluno.getNotaFinal());
    }
}