package Classe;

import java.util.LinkedList;

public class Lista<Tipo> {
    
    private LinkedList<Tipo> objetos = new LinkedList<Tipo>();
    
    public void insere(Tipo obj){
        this.objetos.add(obj);
    }
    public void insereLocal(int numero, Tipo obj) {
        this.objetos.add(numero, obj);
    }
    public Tipo remove(){
        return this.objetos.removeLast();
    }
    public Elemento removeInicio() {
        return (Elemento) this.objetos.removeFirst(); 
    }
    public Elemento apagar(int o) {
        return (Elemento) this.objetos.remove(o);
    }
    public boolean vazia(){
        return this.tamanho() == 0;
    }
    public int tamanho(){
        return this.objetos.size();
    }
    public Elemento ultimo() {
        return (Elemento) this.objetos.getLast();
    }
    @Override
    public String toString() {
        return this.objetos.toString();
    }
    public Tipo getElemento(int o){
        if(o>this.tamanho()){
            return null;
        }
        else{
        return this.objetos.get(o);    
        }
    }

    
}
