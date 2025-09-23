package org.example.Projetos.Bank;

public class Account {

    private static final int MAX_LENGTH = 12;//Definindo tamanho
    //final = Siginifica que essa propriedade é constante, não pode mudar

    private String ag;

    private String cc;

    private String name;

    private double balance;

    private Log logger;


    public Account(String ag, String cc, String name) {
        this.ag = ag;
        this.cc = cc;
        setName(name);
        logger = new Log();
    }
    public void setName(String name){
        if(name.length() > MAX_LENGTH){
            this.name = name.substring(0, MAX_LENGTH); //substring fatia o caracter
        }else{
            this.name = name;
        }
        System.out.println(this.name);
    }
    public void deposit(double value){
        balance += value;
        logger.out("DEPOSITO - R$" + value + " Saldo atual: R$" + balance);
    }

    public boolean withdraw(double value ){
        if(balance < value){
            logger.out("SAQUE - R$" + value + " Saldo atual: R$" + balance);
            return false;
        }else{
            balance -= value;
            logger.out("SAQUE - R$" + value + " Saldo atual: R$" + balance);
            return true;
        }
    }
}
