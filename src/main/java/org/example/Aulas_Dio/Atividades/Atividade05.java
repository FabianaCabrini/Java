package org.example.Aulas_Dio.Atividades;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";
        while(!name.equalsIgnoreCase("exit")){
            System.out.print("Digite um nome: ");
            name = scanner.nextLine();
            System.out.println(name);
        }
    }
}
