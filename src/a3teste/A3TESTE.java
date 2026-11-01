package a3teste;

import javax.swing.JOptionPane;
import static a3teste.CadastroContas.*;

public class a3teste {
    static final int NDOC = 0, DESC = 1, BENEF = 2, VALOR = 3, VENC = 4;
    static int total = 100;
    static String[][] contas = new String[total][5];
    static int qtdContas = 0;

    public static void main(String[] args) {
    contas[0][NDOC] = "2";
    contas[0][DESC] = "Exemplo1";
    contas[0][BENEF] = "Banco";
    contas[0][VALOR] = "300,00";
    contas[0][VENC] = "13/12/2026";
    int opcao;
    
    
    opcao = Integer.parseInt(JOptionPane.showInputDialog(null," Menu Principal " + "\n 1 • Cadastro de contas" + " \n 2 • Baixa de contas" + " \n 3 • Relatórios" + " \n 0 • Finalizar"));

   switch (opcao){
    case 1:
        cadastrarConta();
    break;
    
    case 2:
    JOptionPane.showMessageDialog(null,"2 • Baixa de contas");
    break;
    
    
   case 3:
    JOptionPane.showMessageDialog(null,"3 • Relatórios");
    break;
    
    case 0:
    JOptionPane.showMessageDialog(null,"0 • Finalizar");
    break;
   
    default:
    JOptionPane.showMessageDialog(null,"Opção inválida! ");
    break;
   
     
//1 — Cadastro de contas
//2 — Baixa de contas
//3 — Relatórios
//0 — Finalizar
     
    }
    }
}
