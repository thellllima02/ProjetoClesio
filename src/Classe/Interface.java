package Classe;
import javax.swing.JOptionPane;
public class Interface {

    public static void main(String[] args) {
        String rodar = " ";
        int opcao=0;
        
        rodar = JOptionPane.showInputDialog(null, "Desejar abrir o sistema ??");
        
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
                                    "\n9.Sair ?? "));
           
           
              switch (opcao) {
                  case 1:
                 
                  break;
                  
                  case 2:
                 
                  break;
                  
                  case 3:
                 
                  break;
                  
                  case 4:
                 
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
