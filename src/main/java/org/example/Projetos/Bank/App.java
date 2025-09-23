package org.example.Projetos.Bank;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args){
        Account account = new Account("0001", "1234", "Fabiana");

        boolean succed = account.withdraw(100);
        if(!succed){
            System.out.println("Voce não tem saldo o suficiente pra sacar");
        }
        account.deposit(200);
        account.deposit(500);
        account.deposit(20);

        if(!account.withdraw(200)){
            System.out.println("Voce não tem saldo o suficiente pra sacar");
        }else{
            System.out.println("Saque efetuado !");
        }




        // Criar uma conta (agencia, conta, nome) - OK
        //limitar o nome = 12 caracteres - OK
        //sacar valores
        // nao pode sacar mais do que tem
        //depositar
        //informar para usuario as operações
    }
}
