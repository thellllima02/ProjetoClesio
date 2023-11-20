package Classe;

public class areaDeteste {

    public static void main(String[] args) {
        Senha neo2 = new Senha("Nubank", "caso1");
        Senha neo4 = new Senha("Nubank", "caso12");
        Senha neo1 = new Senha("Nubank", "caso123");
        Senha neo3 = new Senha("Nubank", "caso1234");
        
        Lista lista = new Lista();
        lista.insere(neo1);
        lista.insere(neo2);
        lista.insere(neo3);
        lista.insere(neo4);
        
        System.out.println(lista.toString());
        
        
        Fila fila = new Fila();
        
        int cont=0;
        while(lista.tamanho()>cont){;
            cont++;
            for(int i = 0; i<lista.tamanho();i++){
                if(fila.tamanho() == 0){
                    fila.insereFinal(lista.getElemento(0));
                }
                else if(fila.olha(cont) != (lista.getElemento(i))){
                fila.insere(cont+1, lista.getElemento(i));
                }else{
                fila.insereFinal(lista.getElemento(i));
            }
            }
        }
//        if(fila.tamanhoFila() == 0){
//            fila.i
//        }
        System.out.println(cont);
        System.out.println(fila.toString());
    }
    
}
