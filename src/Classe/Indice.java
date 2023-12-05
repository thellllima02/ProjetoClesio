package Classe;

public class Indice {
    private String nome;
    private int valor;

    public Indice() {
    }

    public Indice(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Nome = " + this.nome + " Quantidade = " + this.valor+"\n";
    }
    
    
    
    
}
