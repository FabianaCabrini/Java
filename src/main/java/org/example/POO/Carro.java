package org.example.POO;

public class Carro {

    //atributos
    String nome;
    String marca;
    int ano;
    int vel;

    //método
    void acelerar(int aceleracao){
        vel+=aceleracao;
    }
    void freiar(int reduzir){
        vel-=reduzir;
    }
    void buzinar(){
        System.out.println("Bi Bi Bi !!");
    }
}
