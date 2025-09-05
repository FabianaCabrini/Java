package org.example;

public class OperadoresLogicos {
    public static void main(String[] args) {
    //Operador Ternário, é uma interrogação seguido de dois pontos

       int n1, n2,r;
       n1 = 14;
       n2= 8;
       r = (n1 > n2) ?0:1; //Se n1 for maior que n2, R recebe 1 SE não R recebe 2
        System.out.println(r);

        //podemos também fazer contas no ternário

        int n3 , n4 , b;
        n3 = 12;
        n4 = 5;
        b = (n3 > n4) ? n3 + n4: n3 - n4;
        System.out.println(b);

    }
}
