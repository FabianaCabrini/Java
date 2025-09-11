package org.example.Aulas_Dio.Atividades;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        //Escreva um código onde o usuário entra com um número e seja gerado a tabuada de 1 até 10 desse número;
        var scanner = new Scanner(System.in);
        System.out.println("--- TABUADA ---");
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for(var i = 1; i <= 10; i++){
            var mult = numero * i;
            System.out.printf("[%d] X [%d] = %d\n",numero, i, mult);
        }
    }
}
