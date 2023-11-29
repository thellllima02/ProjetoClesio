package Classe;

import java.util.LinkedList;

public class Fila<Tipo> {
    
    private LinkedList<Tipo> obje = new LinkedList<Tipo>();
    
    public void insere(int o, Tipo obj){
        this.obje.add(o, obj);
    }
    public void insereFinal(Tipo obj){
        this.obje.addLast(obj);
    }
    public Tipo remove(int obj){
        return this.obje.remove(obj);
    }
    public Tipo olha(int obj){
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
