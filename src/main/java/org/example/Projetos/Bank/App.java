package org.example.Projetos.Bank;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank santander = new Bank("0001");
        // C= criar uma conta
        // E = Sair

        while(true){
            System.out.println("O que deseja fazer?\nC = Criar uma conta\nE = Sair");
            String op = scanner.next();
            if(op.equals("C") || op.equals("c")){
                System.out.println("Digite seu nome: ");
                String name = scanner.next();
                Account account = santander.generateAccount(name);
                System.out.println(account);
                //agora nossa lista tera várias contas
                santander.insertAccount(account);

                operateAccount(account);

            }else if(op.equals("E") || op.equals("e")){
              break;
            }else{
                System.out.println("Opção inválida, tente novamente !");
            }
        }
        List<Account> accountsList = santander.getAccounts();
        for(Account cc: accountsList){
            System.out.println(cc);
        }


        Account account = new Account("0001", "1234", "Fabiana");

        /*
            D = deposito
            S = Saque
            E = exit
         */
    }
    static void operateAccount(Account account){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("\nEscolha o que deseja fazer: \nD = Depósito\nS = Saque\nE = Exit");
            String op = scanner.nextLine();

            if (op.equals("D")|| op.equals("d")) {
                System.out.println("Qual valor voce deseja depositar?:");
                double value = scanner.nextDouble();
                account.deposit(value);
            } else if (op.equals("S")|| op.equals("s")) {
                System.out.println("Qual valor voce deseja sacar?:");
                double value = scanner.nextDouble();
                if (!account.withdraw(value)) {
                    System.out.println("Opss, não foi possível sacar o valor R$ " + value);
                }
            }else if (op.equals("E")|| op.equals("e")) {
                System.out.println("EXTRATO");
                System.out.println("--------------------");
                System.out.println(account);
                break;
            }else{
                System.out.println("Comando inválido, tente novamente");
            }
            scanner=new Scanner(System.in);//evita o looping de pergunta fazendo um scanner novo
            //cada looping vai ser um scanner
        }
    }
}
