package a3teste;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.Scanner;

public class a3teste {
    static final Scanner sc = new Scanner(System.in);
    static int total = 100;
    static int ndoc[] = new int[total];
    static String desc[] = new String[total];
    static String benef[] = new String[total];
    static double valor[] = new double[total];
    static LocalDate[] venc = new LocalDate[total];

    static void printCadastroConta() {
        int opcao;
        do {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "XYZ COMERCIO DE PRODUTO LTDA. \n SISTEMA DE CONTAS A PAGAR" + "\n 1  • Cadastro de contas" + "\n 2 • Baixa de contas" + "\n 3 • Relatórios" + "\n 0 • Finalizar"));

            switch (opcao) {
                case 1:
                    inclusao();
                    break;
                case 2:
                    break;
                case 3:
                    consulta();
                    break;
                case 4:
                    break;

            }

        } while (opcao != 0);

    }

    static void inclusao() {

    }

    static void consulta() {

    }

    public static void main(String[] args) {
        ndoc[0] = 13;
        desc[0] = "Seila";
        benef[0] = "Banco";
        valor[0] = 314;
        venc[0] = LocalDate.parse("2026-12-25");

        int opcao;

        do {
            String entrada = JOptionPane.showInputDialog(
                null,
                " Menu Principal " +
                "\n\n 1 • Cadastro de contas" +
                " \n 2 • Baixa de contas" +
                " \n 3 • Relatórios" +
                " \n 0 • Finalizar"
            );

            if (entrada == null) {
                opcao = 0;
            } else {
                opcao = Integer.parseInt(entrada);
            }

            switch (opcao) {
                case 1:
                    printCadastroConta();
                    break;

                case 2:
                    baixa_contas();
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "3 • Relatórios");
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "0 • Finalizar");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}
