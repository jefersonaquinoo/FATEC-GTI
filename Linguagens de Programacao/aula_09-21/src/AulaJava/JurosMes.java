/*Faça um algoritmo que calcule o 
  rendimento de uma poupança sabendo 
  que eu juro fixo é de 1% ao mês .
  0 usuário e informa o valor depositado.
*/
package AulaJava;

import javax.swing.JOptionPane;


public class JurosMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String deposito = JOptionPane.showInputDialog("Informe o valor depositado: ");
	
	double depositoD = Double.parseDouble (deposito);
	double juros = (depositoD*1)/100;
	double renda = juros+depositoD;
	
	JOptionPane.showInternalMessageDialog(null, "Valor depositado "+depositoD+
			"\n valor dos juros: "+juros+"\n saldo final: "+renda);

	}

}
