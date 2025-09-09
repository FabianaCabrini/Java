package org.example.Conceitos_Base;

public class Operadores {
    public static void main(String[] args) {

    int n1 = 3;
    int n2 = 5;
    float m = (n1+ n2)/2;

    System.out.println("A média é igual a "+ m);

    //Operadores Unários
    // Ex: ++ Incremento a++ ( a = a + 1)
    //Ex: -- Decremento a -- (a = a -1)

    int numero = 5;
    numero++;
    System.out.println(numero);

    int numero2 = 5;
    numero2--;
    System.out.println(numero2);

    int numero3 = 5;
    int valor = 5 + numero3++; //A posição do ++ muda o valor final, se vier antes de numero3, ele incrementa 1 a 5 e já é somado 6+5
                    //Neste caso, depois de somar o valor ele vai entregar o numero que ai sim estará incrementado
    System.out.println(valor);
    System.out.println(numero3);

    int x = 4;
    x += 2; // x = x + 2
        System.out.println(x);

    int y = 2;
    y *= 2; //y = y * 2
    System.out.println(y);
    }
}
