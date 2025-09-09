package org.example.POO;

public class AlunoTestar {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.setNome("Ana Alice");
        System.out.println(aluno1.getNome());
        aluno1.setIdade(10);
    }
}
