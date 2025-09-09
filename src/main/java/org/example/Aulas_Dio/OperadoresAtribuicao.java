package org.example.Aulas_Dio;

import java.util.Scanner;

public class OperadoresAtribuicao {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in); //escanear valores que recebemos pelo terminal
       /* System.out.print("Quanto é 10 + 10: ");
        var result = scanner.nextInt();
        //var isRight = result == 20; //usando booleano pra fazer comparação
        //System.out.printf("O resultado é 20, acertou mona ? (%s)", isRight);

        //Agora vamos verificar se é diferente

        var isRong =  result != 20;
        System.out.printf("O resultado é 20, você errou? (%s)", isRong); */

        System.out.print("\nQuantos anos voce tem ?: ");
        var age = scanner.nextInt();
        System.out.print("Voce é emancipado ?: ");
        var isEmanciped = scanner.nextBoolean();
        var isRight = age >= 18 || isEmanciped && age >= 16;
        System.out.printf("Voce pode dirigir ?: (%s)", isRight);

    }
}
