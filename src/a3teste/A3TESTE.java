package a3teste;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import static a3teste.CadastroContas.*;

public class a3teste {
    static int total = 100;
    static int ndoc[] = new int[total];
    static String desc[] = new String[total];
    static String benef[] = new String[total];
    static double valor[] = new double[total];
    static LocalDate[] venc = new LocalDate[total];
    
    public static void main(String[] args) {
        ndoc[0] = 13;
        desc[0] = "Seila";
        benef[0] = "Banco";
        valor[0] = 314;
        venc[0] = LocalDate.parse("2026-12-25");
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
