package org.example.Aulas_Dio.Atividades;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String name;
        byte age;
        System.out.print("Digite seu nome: ");
        name = scanner.nextLine();
        System.out.print("Insira sua idade: ");
        age = scanner.nextByte();

        System.out.println("Você é emancipado?: (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");//equalIgnore pra ignorar se é maiusculo ou minusculo

        if(age >= 18){
            System.out.println("--- BEM VINDO ---");
            System.out.printf("%s, sua idade é %d. Então você está apto a dirigir\n",name,age);
        } else if (age >= 16 && isEmancipated) {
            System.out.println("Apesar da idade voce já pode dirigir\n");
        } else {
            System.out.printf("%s, sua idade é inferior a 18 anos, infelizmente não esta apto a dirigir\n",name);
        }
        System.out.println("Fim do programa");


    }
}
