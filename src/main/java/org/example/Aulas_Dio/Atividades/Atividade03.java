package org.example.Aulas_Dio.Atividades;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Escolha um número de 1 a 7: ");
        var option = sc.nextInt();
       /* switch (option) {
            case 1:
                System.out.print("Segunda");
                break;
            case 2:
                System.out.print("Terça");
                break;
            case 3:
                System.out.print("Quarta");
                break;
            case 4:
                System.out.print("Quinta");
                break;
            case 5:
                System.out.print("Sexta");
                break;
            case 6:
                System.out.print("Sábado");
                break;
            case 7:
                System.out.print("Domingo");
                break;
            default:
                System.out.println("Opção inválida");
        }*/

        //Outra forma de se trabalhar com o case
        switch (option) {
            case 1 -> System.out.println("Segunda");
            case 2 -> System.out.println("Terça");
            case 3 -> System.out.println("Quarta");
            case 4 -> System.out.println("Quinta");
            case 5 -> System.out.println("Sexta");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
        }
    }
}
