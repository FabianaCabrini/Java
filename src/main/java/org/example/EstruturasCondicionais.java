package org.example;
import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
       /* System.out.print("Insira a primeira nota: ");
        float nota1 = teclado.nextFloat();
        System.out.print("Insira a segunda nota: ");
        float nota2 = teclado.nextFloat();
        float m = (nota1+nota2)/2;
        System.out.println("Sua média foi "+m);
        if (m>9){
            System.out.println("Parabéns");
        }*/
        /*
        int ano;
        int nasc;
        int idade;

        System.out.print("Insira o ano atual: ");
        ano = teclado.nextInt();
        System.out.print("Insira o seu ano de nascimento: ");
        nasc = teclado.nextInt();

        idade = ano - nasc;

        if(idade >=  18){
            System.out.println("Maior de idade "+idade+" anos");
        }else {
            System.out.println("Menor de idade "+idade+" anos");
        }*/

        //Números impares ou pares ??
        /*
        int num;
        System.out.println("Impar x Par");
        System.out.print("Insira um número: ");
        num = teclado.nextInt();
        if(num %2 == 0){
            System.out.println("O número "+num+" é par");
        }else{
            System.out.println("O número "+num+" é impar");
        }
        */


        int dataNascimento;
        int idade;
        System.out.print("Insira o data de nascimento: ");
        dataNascimento = teclado.nextInt();
        idade = 2025 - dataNascimento;

        if(idade < 16){
            System.out.println("Não vota");
        } else if ((idade >= 16 && idade < 18) || (idade > 70)) {
                System.out.println("Voto opcional");
        } else {
            System.out.println("Voto obrigatorio");
        }
    }
}
