package Classe;

import java.util.LinkedList;

public class Fila<Lista> {
    
    private LinkedList<Lista> obje = new LinkedList<Lista>();
    
    public void insere(int o, Lista obj){
        this.obje.add(o, obj);
    }
    public void insereFinal(Lista obj){
        this.obje.addLast(obj);
    }
    public Lista remove(int obj){
        return this.obje.remove(obj);
    }
    public Lista olha(int obj){
        return this.obje.get(obj);
        
    }
    public int tamanho(){
        return this.obje.size();
    }
    @Override
    public String toString() {
        return this.obje.toString();
    }
    
    
}
