package org.example.Conceitos_Base;

public class ClassMath {
    public static void main(String[] args) {


        float v = 8.9f;
        int ar = (int) Math.ceil(v); //Math.ceil é para arredondar
        System.out.println(ar);

        //double ale = Math.random(); //Gerar números aleatórios entre 0 e 1
        //System.out.println(ale);

        double ale =  Math.random();
        int n = (int) (5 + ale * (10-5)); //Para fazer um número aleatório entre 5 e 10
        System.out.println(n);

        double sortido = Math.random();
        int n2 = (int) (70 + sortido * (100-70));
        System.out.println(n2);
    }
}
