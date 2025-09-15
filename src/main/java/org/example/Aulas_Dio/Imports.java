package org.example.Aulas_Dio;

import java.sql.SQLOutput;
import java.util.Random;

public class Imports {
    private static Object number;

    public static void main(String[] args) {

        Random generate = new Random(); //criarmos números aleatórios
        /*
        Para criarmos um laço infinito em for é só fazer for(;;)
         */
        for(int i = 0; i < 6; i++){

            int number = generate.nextInt(60);
            System.out.println(number);
        }
    }
}
