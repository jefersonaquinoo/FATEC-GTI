package AulaJava;

import javax.swing.JOptionPane;

public class SomarDoisValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1= JOptionPane.showInputDialog("Digite um número inteiro:");
		String num2= JOptionPane.showInputDialog("Digite outro número inteiro:");
		
		int n1= Integer.parseInt(num1);
		int n2= Integer.parseInt(num2);
		
		if (n1<n2) {
		
			int soma = n1+n2;
			
			JOptionPane.showInternalMessageDialog(null,
			"A soma dos valores é: " +soma);
			
		}else {
			
			int sub = n1-n2;
			
			JOptionPane.showInternalMessageDialog(null,
			"A subtração dos valores é: " +sub);
			
		}
	}

}