package Classe;

import java.util.*;
import javax.swing.JOptionPane;

public class Interface {

    public static void main(String[] args) {
        String rodar = " ";
        int opcao = 0;
        String confirme = " ";
        SalvaArquivo sa = new SalvaArquivo();//Salvar os arquivo
        LinkedList<Senha> listaRecupera = new LinkedList<Senha>();
        listaRecupera = (LinkedList<Senha>) sa.ler();//Recupera e add os novos nomes
        LinkedList<String> listaAplicativoBanco = new LinkedList<String>(); //Receber os nomes de Banco
        LinkedList<String> listaNomesPassados = new LinkedList<String>(); //Receber os nomes de foram passado
        String neo2 = "";//Usado para receber os nomes e add na listaAplicativoBanco
        String neo3 = "";//Usado para receber os nomes e add na listaNomesPassados

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
                    Senha neo1 = new Senha(JOptionPane.showInputDialog(null, "---- 1º Digite o nome do aplicativo ----"),
                            JOptionPane.showInputDialog(null, "---- 2º Digite a sua senha agora ----"));
                    listaRecupera.add(neo1);
                    break;

                case 2:
                    if (listaRecupera.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Está vazia");
                    } else {
                        listaRecupera.removeLast();
                    }
                    break;

                case 3:
                    if (listaRecupera.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Está vazia");
                    } else {
                        JOptionPane.showMessageDialog(null, "---- Lista gravada ----\n" + listaRecupera.toString());
                    }
                    break;

                case 4:
                    Collections.sort(listaRecupera);
                    JOptionPane.showMessageDialog(null, "** Lista em ordena com sucesso **\n\n **Não esqueça de salvar antes de sair**");
                    break;

                case 5:
                    HashMap<String, LinkedList<String>> mapa = new HashMap<String, LinkedList<String>>();
                    Iterator<Senha> iterador = listaRecupera.iterator();
                    while (iterador.hasNext()) {
                        Senha u = iterador.next();
                        String nome = u.getNomeDoAplicativo();
                        String senha = u.getSenha();

                        if (!mapa.containsKey(nome)) {
                            LinkedList<String> pilha = new LinkedList<String>();
                            mapa.put(nome, pilha);
                        }
                        mapa.get(nome).add(senha);
                    }
                    JOptionPane.showMessageDialog(null, mapa);
                    break;

                case 6:
                    Iterator<Senha> iterador2 = listaRecupera.iterator();
                    LinkedList lista2 = new LinkedList();
                    Arvore arvore = new Arvore();
                    while (iterador2.hasNext()) {
                        Senha u2 = iterador2.next();
                        if (arvore.adicionar(u2) == true) {

                        } else {
                            lista2.add(u2);
                        }
                    }
                    JOptionPane.showMessageDialog(null, "---- Arvore em Pre Ordem ----\n" + arvore.preOrdem(arvore.getRaiz()));
                    JOptionPane.showMessageDialog(null, "---- Arvore em Ordem ----\n" + arvore.emOrdem(arvore.getRaiz()));
                    JOptionPane.showMessageDialog(null, "---- Arvore em Pos Ordem ----\n" + arvore.posOrdem(arvore.getRaiz()));
                    break;

                case 7:
                    sa.grava(listaRecupera);
                    JOptionPane.showMessageDialog(null, "---- Lista salva ----");
                    break;

                case 8:
                    //Pegando todos os nomes de bancos e colocando em uma lista
                    for (int e = 0; e < listaRecupera.size(); e++) {
                        Senha recebe = listaRecupera.get(e);

                        String texto = recebe.getNomeDoAplicativo();

                        String palavra = "";
                        int cont = 1,
                                cont2 = 0;
                        //Ver quantas palavras tem no frase.
                        for (int i = 0; i < texto.length(); i++) {
                            if (texto.charAt(i) == ' ') {
                                cont++;
                            }
                        }
                        //Fazendo a coleta de cada palavra que veio no texto
                        for (int i = cont2; i < texto.length(); i++) {
                            if (texto.charAt(i) != ' ') {
                                palavra += texto.charAt(i);
                                cont2++;
                            } else {
                                neo2 = new String(palavra);
                                listaAplicativoBanco.add(neo2);
                                cont2++;
                                palavra = "";
                            }
                        }
                        neo2 = new String(palavra);
                        listaAplicativoBanco.add(neo2);//Usar para ver os nomes de bancos

                    }
                    //Pegando os nomes da String e colocando na lista
                    String recebe2 = JOptionPane.showInputDialog(null, "Digite os nomes ");
                    String texto2 = recebe2;

                    String palavra2 = "";
                    int cont = 1,
                     cont2 = 0;
                    //Ver quantas palavras tem no frase.
                    for (int i = 0; i < texto2.length(); i++) {
                        if (texto2.charAt(i) == ' ') {
                            cont++;
                        }
                    }
                    //Fazendo a coleta de cada palavra que veio no texto
                    for (int i = cont2; i < texto2.length(); i++) {
                        if (texto2.charAt(i) != ' ') {
                            palavra2 += texto2.charAt(i);
                            cont2++;
                        } else {
                            neo3 = new String(palavra2);
                            listaNomesPassados.add(neo3);
                            cont2++;
                            palavra2 = "";
                        }
                    }
                    neo3 = new String(palavra2);
                    listaNomesPassados.add(neo3);//Usar para ver os nomes

                    JOptionPane.showMessageDialog(null, listaAplicativoBanco);
                    JOptionPane.showMessageDialog(null, listaNomesPassados);

                    break;

                case 9:
                    confirme = JOptionPane.showInputDialog(null, "---- Você salvou as senhas ? ----\n ( Sim / Não )");
                    if (confirme.equalsIgnoreCase("sim")) {
                        rodar = "nao";
                    } else {
                        rodar = "sim";
                    }

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
            }
        }
    }
}
