package org.example.Aulas_Dio.Atividades;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        /*
        Escreva um código onde o usuário entra com sua altura e peso, seja feito o cálculo
        do seu IMC(IMC = peso/(altura * altura)) e seja exibido a mensagem de acordo com o resultado:

        Se for menor ou igual a 18,5 "Abaixo do peso";
        se por entre 18,6 e 24,9 “Peso ideal”;
        Se for entre 25,0 e 29,9 "Levemente acima do peso";
        Se entre 30,0 e 34,9 “Obesidade Grau I”;
        Se for entre 35,0 e 39,9 “Obesidade Grau II (Severa)”;
        Se for maior ou igual a 40,0 “Obesidade III (Mórbida)”;
         */

        System.out.println("--- CALCULO DE IMC ---");
        System.out.print("Digite sua altura: ");
        float altura = scanner.nextFloat();
        System.out.print("Digite sua peso: ");
        float peso = scanner.nextFloat();

        var imc = peso/(altura*altura);

        System.out.printf("IMC = %.2f\n", imc);

        if (imc < 18.5 ){
            System.out.println("Abaixo da peso");
        }else if (imc > 18.5 && imc < 24.9){
            System.out.println("Peso ideal");
        }else if (imc > 24.9 && imc < 29.9){
            System.out.println("Levemente acima do peso");
        }else if (imc > 29.9 && imc < 33.9){
            System.out.println("Obseidade nível I");
        }else if (imc > 34.9 && imc < 40){
            System.out.println("Obsidade nível II SEVERA");
        }else {
            System.out.println("Obesidade nível III MORBIDA");
        }
    }
}
