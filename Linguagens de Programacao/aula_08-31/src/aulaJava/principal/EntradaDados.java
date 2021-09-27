package aulaJava.principal;

import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String carros= JOptionPane.showInputDialog("informe a quantidade de carros:");
		String pessoas= JOptionPane.showInputDialog("informe a quantidade de pessoas:");		
	
		int CarroN = Integer.parseInt(carros);
		int pessoaN = Integer.parseInt(pessoas);
		
		int divisao = (CarroN/pessoaN);
		int resto = CarroN % pessoaN;
		
//		System.out.println("A divisão por pessoas resultou:" 
//		+" " +divisao+" e sobroram: " +resto+ "carro(s).");
		
		
	}

}
