package org.example.Aulas_Dio;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int num=1;

        System.out.println("--- CALCULADORA ---");
        System.out.println("\nEsolha um número\n1 - Soma\n2 - Subtração\n3 - Divisão\n4 - Resto\n5 - Multiplicação\n6 - Raiz quadrada\n0 - Para sair\n");
        while (num != 0){

           System.out.println("\nEscolha a opção: ");
           num = scanner.nextInt();
           switch (num){
               case 1:
                   System.out.println("\n--- SOMA ---");
                   System.out.print("Digite um valor: ");
                   var value1 = scanner.nextInt();
                   System.out.print("Digite um segundo valor: ");
                   var value2 = scanner.nextInt();
                   System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);
                   break;
               case 2:
                   System.out.println("\n---SUBTRAÇÃO---");
                   System.out.print("Digite um valor: ");
                   var value3 = scanner.nextInt();
                   System.out.print("Digite um segundo valor: ");
                   var value4 = scanner.nextInt();
                   System.out.printf("%s - %s = %s\n", value3, value4, value3 - value4);
                   break;
               case 3:
                   System.out.println("\n---DIVISÃO---");
                   System.out.print("Digite um valor: ");
                   var value5 = scanner.nextFloat();
                   System.out.print("Digite um segundo valor: ");
                   var value6 = scanner.nextFloat();
                   System.out.printf("%s / %s = %s\n", value5, value6, value5 / value6);
                   break;
               case 4:
                   System.out.println("\n---RESTO---");
                   System.out.print("Digite um valor: ");
                   var value7 = scanner.nextInt();
                   System.out.print("Digite um segundo valor: ");
                   var value8 = scanner.nextInt();
                   System.out.printf("%s %% %s = %s\n", value7, value8, value7 % value8);
                   break;
               case 5:
                   System.out.println("\n---MULTIPLICAÇÃO---");
                   System.out.print("Digite um valor: ");
                   var value9 = scanner.nextInt();
                   System.out.print("Digite um segundo valor: ");
                   var value10 = scanner.nextInt();
                   System.out.printf("%s * %s = %s\n", value9, value10, value9 * value10);
                   break;
               case 6:
                   System.out.println("\n---RAIZ QUADRADA---");
                   System.out.print("Digite um valor: ");
                   var value11 = scanner.nextInt();

                   System.out.printf("A raiz quadrada de %s = %s\n", value11, Math.sqrt(value11)); //biblioteca
                   break;

               default:
                   System.out.println("Opção não encontrada.");



           }
       }
    }
}
