package Classe;
import java.io.Serializable;
 
public class Senha implements Serializable, Comparable<Senha>{
    private String NomeDoAplicativo;
    private String Senha;
    private int TamanhoDaSenha = 0;

    public Senha() {
    }

    public Senha(String NomeDoAplicativo, String Senha) {
        this.NomeDoAplicativo = NomeDoAplicativo.toLowerCase();
        this.Senha = Senha;
    }
    public boolean equals(Senha outro) {
     
        return this.NomeDoAplicativo.equals(outro.getNomeDoAplicativo());
    }
    public String getNomeDoAplicativo() {
        return NomeDoAplicativo;
    }
    public void setNomeDoAplicativo(String NomeDoAplicativo) {
        this.NomeDoAplicativo = NomeDoAplicativo;
    }
    public String getSenha() {
        return Senha;
    }
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    public int getTamanhoDaSenha() {
        return this.Senha.length();
    }
    @Override
    public String toString() {
        return " | Nome do aplicativo = "+this.NomeDoAplicativo+" | Senha = "+this.Senha+" | Tamanho da Senha = "+this.getTamanhoDaSenha()+"\n";
    }
    @Override
    public int compareTo(Senha obj) {
        if(this.getTamanhoDaSenha() < obj.getTamanhoDaSenha()){
            return -1;
        }
        else if(this.getTamanhoDaSenha() == obj.getTamanhoDaSenha()){
            return 0;
        }
        else{
            return 1;
        }
    }
 }
