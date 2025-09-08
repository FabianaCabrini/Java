package org.example;

import java.util.Arrays;

public class Vetor02 {
    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev","Mar", "Abr", "Mai", "Jun","Julh", "Agos", "Sete", "Out", "Nov", "Deze"};
        int tot[] = {31,28,31,30,31,30,31,31,30,31,31,30,31};
        for(int c=0; c<mes.length; c++){
            System.out.println(" O mes de " + mes[c] + " tem " + tot[c] + " dias ao todo.");
        }
        int num[] = {3,5,1,8,4};
        //Colocando em ordem, usa-se o Arrays.sort
        Arrays.sort(num);
        //Fazer uma busca Arrays.binarySearch
        int pos = Arrays.binarySearch(num, 4);
        System.out.println(pos);
        for (int valor:num){//forma simplificada
            System.out.println(valor + " ");
        }
    }
}
