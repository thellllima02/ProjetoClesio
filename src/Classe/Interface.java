package Classe;
import java.util.*;
import javax.swing.JOptionPane;
public class Interface {

    public static void main(String[] args) {
        String rodar = " ";
        int opcao=0;
        Lista<Senha> lista = new Lista();
        List<Senha> lista2 = new ArrayList<Senha>();//Colocar em ordem
        
        rodar = JOptionPane.showInputDialog(null, "Desejar abrir o sistema ??\n (Sim/Não");
        
        while(rodar.equalsIgnoreCase("sim")){
           opcao = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                    "Digite o número corrspondente "+
                                    "\n\n1.Inclui senha na LISTA " +
                                    "\n2.Deletar senha na LISTA "+
                                    "\n3.Mostrar LISTA de senhas "+
                                    "\n4.Inserir lista de senhas numa FILA "+
                                    "\n5.Criar PILHAS com palavras que são do mesmo aplicativo "+
                                    "\n6.Inserir senhas numa ARVORE "+
                                    "\n7.Salvar Lista "+
                                    "\n8.[Extra] Criar índice invertido"+
                                    "\n9.Sair ?"));
           
           
              switch (opcao) {
                  case 1:
                      Senha neo1 = new Senha(JOptionPane.showInputDialog(null, "1º Digite o nome do aplicativo"), 
                                             JOptionPane.showInputDialog(null, "2º Digite a sua senha agora"));
                      lista.insere(neo1);
                      //Adicionando ao mesmo tempo em um Arraylist para o ordenamento
                      lista2.add(neo1);
                  break;
                  
                  case 2:
                      lista.remove();
                 break;
                  
                  case 3:
                      JOptionPane.showMessageDialog(null, lista.toString());
                  break;
                  
                  case 4:
                      Collections.sort(lista2);
                      JOptionPane.showMessageDialog(null,"A lista em ordem pelo tamanho da senha:\n"+ lista2);
                  break;
                  
                  case 5:
                        
                 
                  break;
                  
                  case 6:
                 
                  break;
                  
                  case 7:
                 
                  break;
                  
                  case 8:
                      
                 
                  break;
                  
                  case 9:
                 JOptionPane.showMessageDialog(null, "Saindo");
                 rodar = "nao";
                 break;
            }
           
        }
        

    }
    
}
