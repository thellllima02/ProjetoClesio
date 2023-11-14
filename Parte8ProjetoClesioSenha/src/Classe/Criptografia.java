package Classe;

import java.util.*;

public class Criptografia {
    
    public static void main(String[] args) {
       Pilha<Palavra> lista = new Pilha<Palavra>();
       String texto ="Hoje a noite não tem luar";
       String palavra="";
       int cont =1,cont2=0;
      //Ver quantas palavras tem no frase.
       for(int i=0; i<texto.length();i++){
           if(texto.charAt(i) ==' '){
               cont++;
           }
       }
       //Fazendo a coleta de cada palavra que veio no texto
       for(int i=cont2; i<texto.length();i++){
          if(texto.charAt(i)!=' '){
              palavra+=texto.charAt(i);
              cont2++;
           }
           else{
              Palavra neo1 = new Palavra(palavra);
              lista.insere(neo1);
              cont2++;
              palavra = "";
           }
       }
       Palavra neo1 = new Palavra(palavra);
       lista.insere(neo1);
       //Saida
       System.out.println("Lista = "+lista.toString());
       System.out.println("Texto original = "+texto);
       System.out.println("Quantidade de palavras = "+cont);
       }
}
