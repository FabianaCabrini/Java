package org.example.Aulas_Dio.Atividades;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int i;
        for (i = 0; i <= 100; i++){
            System.out.println(i);
            if(i ==100){
                System.out.println("Fim da execução");
                break;
            }

        }
        /*for(;;){
            System.out.print("Digite um nome: ");
            String nome = scanner.nextLine();
            if(nome.equalsIgnoreCase("exit"))break; //equal é como se fosse nome == nome, o ignore é pra ignorar se é maiusculo ou minusculo

            System.out.println(nome);*
        }*/





    }
}
