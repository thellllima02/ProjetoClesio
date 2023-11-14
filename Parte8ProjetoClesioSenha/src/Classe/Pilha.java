package Classe;

import java.util.LinkedList;

public class Pilha<Palavra> {
    
    private LinkedList<Palavra> objetos = new LinkedList<Palavra>();
    
    public void insere(Palavra obj){
        this.objetos.add(obj);
    }
    public Palavra remove(){
        return this.objetos.removeLast();
    }
    public boolean vazia(){
        return this.tamanho() == 0;
    }
    public int tamanho(){
        return this.objetos.size();
    }
    public Palavra olhaTopo(int num){
        return this.objetos.get(num);
    }

    @Override
    public String toString() {
        return this.objetos.toString();
    }
    
}
