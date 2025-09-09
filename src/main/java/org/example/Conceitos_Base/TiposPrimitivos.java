package org.example.Conceitos_Base;
import java.util.Scanner; //biblioteca pra entrada de dados

public class TiposPrimitivos {
    public static void main(String[] args) {

        float nota = 8.5f;
        String nome = "Fabiana";
        System.out.println("A nota é "+nota);
        //println pula uma linha
        //escrevendo sout e clicando em tab vc gera o println
        System.out.printf("A nota é %.2f \n", nota);
        //printf é para formatação
        System.out.printf("A nota de %s é %.2f\n", nome, nota);

        //Entrada de dados

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String aluno = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota2 = teclado.nextFloat();
        System.out.printf("A nota de %s é igual a %.2f \n", aluno, nota2);

    }
}