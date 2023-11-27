package Classe;

import java.util.LinkedList;

public class Lista<Senha> {
    
    private LinkedList<Senha> objetos = new LinkedList<Senha>();
    
    public void insere(Senha obj){
        this.objetos.add(obj);
    }
    public void insereLocal(int numero, Senha obj) {
        this.objetos.add(numero, obj);
    }
    public Senha remove(){
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
    public Senha getElemento(int o){
        if(o>this.tamanho()){
            return null;
        }
        else{
        return this.objetos.get(o);    
        }
    }

    
}
