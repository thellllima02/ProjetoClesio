package Classe;

import java.util.*;
import javax.swing.JOptionPane;

public class Interface {

    public static void main(String[] args) {
        String rodar = "";
        int opcao = 0;
        String confirme="";
        SalvaArquivo sa = new SalvaArquivo();//Salvar os arquivo
        LinkedList<Senha> lista = new LinkedList<Senha>();
        LinkedList<Senha> listaRecupera = new LinkedList<Senha>();
        listaRecupera  = (LinkedList<Senha>) sa.ler();
        

        rodar = JOptionPane.showInputDialog(null, "---- Desejar abrir o sistema ? ----\n ( Sim / Não )");

        while (rodar.equalsIgnoreCase("sim")) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite o número corrspondente "
                    + "\n\n1.Inclui senha na LISTA "
                    + "\n2.Deletar senha na LISTA "
                    + "\n3.Mostrar LISTA de senhas "
                    + "\n4.Inserir lista de senhas numa FILA "
                    + "\n5.Criar PILHAS com palavras que são do mesmo aplicativo "
                    + "\n6.Inserir senhas numa ARVORE "
                    + "\n7.Salvar Lista "
                    + "\n8.[Extra] Criar índice invertido"
                    + "\n9.Sair ?"));
            

            switch (opcao) {
                case 1:
                    Senha neo1 = new Senha(JOptionPane.showInputDialog(null, "1º Digite o nome do aplicativo"),
                            JOptionPane.showInputDialog(null, "2º Digite a sua senha agora"));
                   listaRecupera.add(neo1);
                   break;
                case 2:
                    listaRecupera.removeLast();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "---- Lista gravada ----\n"+listaRecupera.toString());
                    break;
                case 4:
                    Collections.sort(listaRecupera);
                    JOptionPane.showMessageDialog(null,"A lista organizada com sucesso ");
                    break;
                case 5:
                    
                    break;

                case 6:

                    break;
                case 7:
                   sa.grava(listaRecupera);
                    break;

                case 8:

                    break;

                case 9:
                   confirme = JOptionPane.showInputDialog(null, "---- Você salvou as senhas ? ----\n ( Sim / Não )");
                   if(confirme.equalsIgnoreCase("sim")){
                    rodar = "nao";   
                   }else{
                       rodar = "sim";
                   }
                    
                    break;
            }
        }
    }
}
