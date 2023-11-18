package Classe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApagarDepois {
    
    public static void main(String[] args) {
        
        Senha noeo1 = new Senha("NubaNk", "carro222");
        Senha noeo2 = new Senha("NubaNk2", "carro2wwwwwwwww");
        Senha noeo3 = new Senha("NubaNk3", "carr");
        
        List<Senha> nova = new ArrayList<Senha>();
        nova.add(noeo1);
        nova.add(noeo2);
        nova.add(noeo3);
        
        Collections.sort(nova);
        
        System.out.println(nova.toString());
    }
    
}
