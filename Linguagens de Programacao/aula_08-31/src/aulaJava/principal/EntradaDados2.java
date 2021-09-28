//
//
package aulaJava.principal;

import javax.swing.JOptionPane;

public class EntradaDados2 {

	public static void main(String[] args) {
		
		String carros= JOptionPane.showInputDialog("informe a quantidade de carros:");
		String pessoas= JOptionPane.showInputDialog("informe a quantidade de pessoas:");		
	
		int CarroN = Integer.parseInt(carros);
		int pessoaN = Integer.parseInt(pessoas);
		
		int divisao = (CarroN/pessoaN);
		int resto = CarroN % pessoaN;
		
		JOptionPane.showInternalMessageDialog(null, "A divisão por pessoas resultou: "
				+divisao+" carro por pessoa, sobraram: "+resto+" carros." );
		
		
		
	}

}
