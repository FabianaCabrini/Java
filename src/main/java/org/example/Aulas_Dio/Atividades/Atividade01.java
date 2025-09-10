package org.example.Aulas_Dio.Atividades;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        //Escreva um código que receba o nome e o ano de nascimento
        // de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
        /*System.out.print("Insira seu nome: ");
        String nome = new Scanner(System.in).nextLine();
        System.out.print("Insira seu ano de nascimento: ");
        int ano = new Scanner(System.in).nextInt();
        int idade = 2025-ano;
        System.out.printf("Olá %s, sua idade é %s\n",nome,idade);*/

        //Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
        //fórmula: área=lado X lado

       /* System.out.println("Insira o tamanho das laterais do quadrado pra retornar a área: ");
        float lado = new Scanner(System.in).nextFloat();
        float area = lado*lado;
        System.out.printf("A área do quadrado é: %s",area);*/

        /*Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
        fórmula: área=base X altura*/

       /* System.out.println("Insira a base do retangulo: ");
        float base = new Scanner(System.in).nextFloat();
        System.out.println("Insira a altura do retangulo: ");
        float altura = new Scanner(System.in).nextFloat();
        float area = (base*altura)/2;
        System.out.printf("A area do retangulo é: %s", area);*/

        /*
        Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
         */
        String nome1;
        String nome2;
        byte idade1;
        byte idade2;

        System.out.print("Digite seu nome: ");
        nome1 = new Scanner(System.in).nextLine();
        System.out.print("Insira sua idade: ");
        idade1 = new Scanner(System.in).nextByte();
        System.out.print("Digite seu nome: ");
        nome2 = new Scanner(System.in).nextLine();
        System.out.print("Insira sua idade: ");
        idade2 = new Scanner(System.in).nextByte();

        int diferenca = (idade1 > idade2) ? idade1-idade2 : idade2-idade1;
        System.out.printf("A diferença de idade entre %s e %s é %s", nome1, nome2, diferenca);

    }
}
