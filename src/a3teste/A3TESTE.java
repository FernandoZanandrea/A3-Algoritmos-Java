package a3teste;

import javax.swing.JOptionPane;

public class A3TESTE {

    public static void main(String[] args) {
        
    int opcao;
    
    opcao = Integer.parseInt(JOptionPane.showInputDialog(null," Menu Principal " + "\n 1 • Cadastro de contas" + " \n 2 • Baixa de contas" + " \n 3 • Relatórios" + " \n 0 • Finalizar"));

   switch (opcao){
    case 1:
        JOptionPane.showMessageDialog(null,"1 • Cadastro de contas");
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
