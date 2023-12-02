package Classe;

import java.util.*;
import javax.swing.JOptionPane;

public class Interface {

    public static void main(String[] args) {
        String rodar = " ";
        int opcao = 0;
        
        Senha neo = new Senha();
        SalvaArquivo sa = new SalvaArquivo();//Salvar os arquivo
        LinkedList<Senha> lista = new LinkedList<Senha>();
        LinkedList<Senha> listaRecupera = new LinkedList<Senha>();
        List<Senha> lista2 = new ArrayList<Senha>();//Colocar em ordem
        

        rodar = JOptionPane.showInputDialog(null, "Desejar abrir o sistema ??\n (Sim/Não");

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
                    neo = neo1;
                    lista.add(neo1);
                    //Adicionando ao mesmo tempo em um Arraylist para o ordenamento
                    lista2.add(neo1);
                    break;

                case 2:
                    lista.remove();
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, lista.toString());
                    
                    listaRecupera  = (LinkedList<Senha>) sa.ler();
                    
                    JOptionPane.showMessageDialog(null, "Lista gravada"+listaRecupera.toString());
                    
                   
                    
                    break;

                case 4:
                    Collections.sort(lista2);
                    JOptionPane.showMessageDialog(null,"A lista em ordem pelo tamanho da senha:\n"+ lista2);

//                    //Criando uma pilha de fila
//                    Lista pilha = new Lista();
//
////Caso a pilha estiver fazia
//                    if (pilha.vazia()) {
//                        pilha.insere(lista.ultimo());//Recebe elemento como parametro
//                        lista.apagar(lista.tamanho() - 1);//Recebe int como parametro
//                    }
//
////forma de adicionar em ordem do menor ao maior
//                    int roda = lista.tamanho();
//                    //A ideia que tive foi assim, um while pra rodar ate a lista ficar vazia, pegar o primeiro da lista, e rodar a fila procurando
//                    //qual é o menor ou igual a ele, caso não tenha nem um adicionar no final, Mas o for junto com if não esta rodando procurando.
//                    while (!lista.vazia()) {
//
//                        //Aqui era pra ficar rodando, procurando qual o elemento do fila é menor, mas não esxta girando. 
//                        for (int e = 0; e < lista.tamanho(); e++) {
//
//                            Senha elementoAtual = lista.getElemento(0); //Crie essas duas variaveis para poder acessar o getTamanhoDaSenha
//                            Senha PilhaAtual = (Senha) pilha.getElemento(e);
//
//                            //Aqui era pra rodar procurando qual o menor ou igual e adicionar no local de encontrou
//                            if (elementoAtual.getTamanhoDaSenha() >= PilhaAtual.getTamanhoDaSenha()) {
//
//                                pilha.insereLocal(e, elementoAtual);
//                                lista.removeInicio();
//                                break;
//
//                                //Aqui era pro caso de não ter nem um numero menor ou igual a ele     
//                            } else {
//                                pilha.insereLocal(e + 1, elementoAtual);
//                                lista.removeInicio();
//                                break;
//                            }
//
//                        }
//                    }JOptionPane.showMessageDialog(null, pilha.toString());
                    
                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:
                    sa.grava(lista);
                    
                    
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
