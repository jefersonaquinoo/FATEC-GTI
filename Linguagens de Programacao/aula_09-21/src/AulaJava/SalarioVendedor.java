package AulaJava;

import javax.swing.JOptionPane;

public class SalarioVendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String nome = JOptionPane.showInputDialog("Informe o nome do vendedor: ");
		        String sal = JOptionPane.showInputDialog("Informe o salario do vendedor: ");
		        String totalVendas = JOptionPane.showInputDialog("Digite o total de vendas: ");

		        double salario = Double.parseDouble(sal);
		        double totalV = Double.parseDouble(totalVendas);

		        double comissao = (totalV * 15)/100;
		        double salatualizado = comissao+salario;

		        JOptionPane.showInternalMessageDialog(null,
		        "O nomedo do vendedor é: "+nome+"\n Salário Fixo: " +salario+
		        "\n Salario atualizado " +salatualizado); 
		        
		    }
		}

