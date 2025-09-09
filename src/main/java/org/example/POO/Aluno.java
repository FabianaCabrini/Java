package org.example.POO;

public class Aluno {

    private String nome;
    int idade;
    //metodo para usar a classe privada public void - -
    public void setNome(String nome){
        this.nome = nome; //This faz a diferenca entre o atributo nome e o valor que eu estou recebendo
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
     //condição para limite de idade
        if(idade > 0 && idade < 120 ){
            this.idade = idade;
            System.out.println("Idade cadastrada");
        }else{
            System.out.println("Idade inválida");
        }
    }
}
