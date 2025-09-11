package org.example.Aulas_Dio.Atividades;

import java.util.Scanner;

public class atividade08 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        /*
        Escreva um código que o usuário entre com um primeiro número, um segundo número maior que
        o primeiro e escolha entre a opção par e impar, com isso o código deve informar todos os números
        pares ou ímpares (de acordo com a seleção inicial) no intervalo
        de números informados, incluindo os números informados e em ordem decrescente;
         */

        /*System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite um segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("\n--- IMPAR X PAR ---");
        System.out.print("Esolha\n1 - para Impar\n2 - para Par");
        var op = scanner.nextInt();
        switch (op){
            case 1:
                while ()
        }*/
        int num;
        System.out.print("--- IMPAR X PAR ---\n");
        System.out.print("Digite um número: ");
        num = scanner.nextInt();
        while (num !=0){
            System.out.print("Digite um número: ");
            num = scanner.nextInt();

            if(num % 2 == 0){
                System.out.println("Pares");
                System.out.println(num);
            }else{
                System.out.println("Impar");
                System.out.println(num);
            }
        }
    }
}
