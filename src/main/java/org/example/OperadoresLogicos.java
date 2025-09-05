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

        String nome1 = "Fabiana";
        String nome2 = "Fabiana";
        String nome3 = new String("Fabiana");
        String res ;

        res = (nome1==nome2)? "Igual":"Diferente";
        System.out.println(res);

        res = (nome1.equals(nome3))? "Igual":"Diferente";
        System.out.println(res);
        //o valor de 3 foi feito com um metodo diferente, sendo assim precisa especificar com equals, para que de certo.
        //Caso não expecifique a saída vai ser "Diferente", pois ele considera o metodo firetente



    }
}
