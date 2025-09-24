package org.example.Projetos.Bank;

import java.util.List;
import java.util.ArrayList;

public class Bank {
    //agencia, lista de contas
    private String ag;

    private List<Account>accounts;

    private int lastAccount = 1;

    public Bank(String ag){
        this.ag = ag;
        this.accounts = new ArrayList<>();
    }
    public List<Account> getAccounts(){
        return accounts;
    }

    public void insertAccount(Account account){
        // adiciona à lista do banco
        accounts.add(account);
    }

    public Account generateAccount(String name){
        // cria a conta com número sequencial convertido para String
        Account account = new Account(ag, String.valueOf(lastAccount), name);

        lastAccount++;

        return account;
    }


}
