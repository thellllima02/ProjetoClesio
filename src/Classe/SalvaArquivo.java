package Classe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class SalvaArquivo {
   
    public void grava (Object ob) {
       try { 
            File arquivo  = new File("src/Classe/arquivo.txt");  //local arquivo
            
            //Vincula objeto de gravação arquivo
            ObjectOutputStream grava = new ObjectOutputStream(new FileOutputStream(arquivo));  
            
            grava.writeObject(ob);       //Efetua gravação arquivo
            
            grava.close();               //Fecha objeto de gravação
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public static Object ler() {
        Object retorno = null;
       
        try {
            File arquivo  = new File("src/Classe/arquivo.txt");  //local arquivo
            
            //Vincula objeto de leitura arquivo
            ObjectInputStream ler = new ObjectInputStream(new FileInputStream(arquivo));  
         
            Object obj = (Object) ler.readObject();  //Efetua leitura arquivo
            if (obj != null)
            retorno = obj;         //Seta retorno

            ler.close();           //Fecha objeto leitura
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            
        } 
        
        return retorno;
    }
}


