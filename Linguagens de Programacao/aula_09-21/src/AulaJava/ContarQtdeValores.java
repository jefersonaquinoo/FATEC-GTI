package AulaJava;

import javax.swing.JOptionPane;

public class ContarQtdeValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num, i=0;
	do{
		String numS = JOptionPane.showInputDialog("Digite um número OU \n Para sair digite 0(zero) ");
	 num = Integer.parseInt(numS);
	i++;
	
	}while (num!=0);
	JOptionPane.showInternalMessageDialog(null, "Foram digitados  "+i+" numeros");
	}

}
