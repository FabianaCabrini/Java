package org.example.Conceitos_Base;

public class Metodos {

     static void soma(int a, int b){
     int s = a + b;
        System.out.println("A soma dos valores é: " + s);
    }
     static int subtracao(int c, int d){//necessita colocar o static antes
        int sub = c - d;
        return sub; // forma de retornar o valor
    }
    public static void main(String[] args){
        System.out.println("- - - Começou o programa - - -");
        soma(5,2);

        int sbt = subtracao(4,7); //a nova variavel recebe subtração, e então voce chama ela no println
        System.out.println("A subtração vale: " + sbt);
    }
}
