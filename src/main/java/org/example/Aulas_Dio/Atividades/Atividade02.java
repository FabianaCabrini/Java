package org.example.Aulas_Dio.Atividades;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

        String name;
        byte age;
        System.out.print("Digite seu nome: ");
        name = new Scanner(System.in).nextLine();
        System.out.print("Insira sua idade: ");
        age = new Scanner (System.in).nextByte();

        if(age >= 18){
            System.out.println("--- BEM VINDO ---");
            System.out.printf("%s, sua idade é %d. Então você está apto a dirigir\n",name,age);
        }else {
            System.out.printf("%s, sua idade é inferior a 18 anos, infelizmente não esta apto a dirigir\n",name);
        }
        System.out.println("Fim do programa");


    }
}
