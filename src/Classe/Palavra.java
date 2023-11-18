package Classe;

public class Palavra {
    private String Nome;

    public Palavra(String Nome) {
        this.Nome = Nome;
    }

    public Palavra() {
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    @Override
    public String toString() {
        return this.Nome;
    }
    
    
    
}
