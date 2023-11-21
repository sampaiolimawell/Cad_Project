package br.com.sampaio.Cad_Project;

import br.com.sampaio.Cad_Project.dao.ClienteMapDAO;
import br.com.sampaio.Cad_Project.dao.IClientDAO;

import javax.swing.*;

public class App {

    private static IClientDAO iClientDAO;

    public static void main(String[] args) {
        iClientDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null, "digite 1 para cadastro," +
                " 2 para consultar, 3 para exclusão, 4 para alteração e 5 para sair",
                "cadastro",JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)){
            if ("".equals(opcao)){
                sair();
            }
            opcao = JOptionPane.showInputDialog(null, "Opção invalida, digite 1 para cadastro," +
                            " 2 para consultar, 3 para exclusão, 4 para alteração e 5 para sair",
                    "cadastro",JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)){
            if (isOpcaoSair(opcao)){
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente separados por " +
                                "virgula, conforme exemplo: Nome, CPF, Telefone",
                        "Cadastro",JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            }
        }

    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo:","Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    private static boolean isOpcaoSair(String opcao) {
        if (opcao.equals("5")) {
            return true;
        }
        return false;
    }
    private static boolean isOpcaoValida(String opcao) {
       if (opcao.equals("1") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4") || opcao.equals("5") ) {
           return true;
       }
       return false;
       }
    private static boolean isCadastro(String opcao) {
        if (opcao.equals("1")){
            return true;
        }
        return false;
    }

}








