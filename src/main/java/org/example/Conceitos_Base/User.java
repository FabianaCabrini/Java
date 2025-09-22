package org.example.Conceitos_Base;

public class User {
    /*
     *Geralmente deixamos nossas classes privadas
     *para alterar isso ao invés de mexer no objeto, se cria um SET
     * significa alterar e passamos por parametros a propriedade que queremos alterar
     *
     */
     private String firstName;
     private String lastName;

     public void setFirstName(String firstName) {
        //o this diz para a gente acessar a propriedade de campo desse projeto
        //e armazena dentro dela o que vem no meu parametro
         this.firstName = firstName;
    }
}
