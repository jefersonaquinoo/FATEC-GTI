package AulaJava;

import javax.swing.JOptionPane;

public class ConsumoCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String km1 = JOptionPane.showInputDialog("Digite a KM inicial: ");
	        String km2 = JOptionPane.showInputDialog("Digite a KM final: ");
	        String litros = JOptionPane.showInputDialog("Digite qtos litros consumidos: ");

	        double km1D = Double.parseDouble(km1);
	        double km2D = Double.parseDouble(km2);
	        double litrosD = Double.parseDouble(litros);
	        
	        double kmtotal = km2D=km1D;
	        double consumo = kmtotal/litrosD;
	        
	        JOptionPane.showInternalMessageDialog(null,
	    			"o total de km percorridos foi de: " +kmtotal+ "km");
	        JOptionPane.showInternalMessageDialog(null,
	    			"a média de consumo  foi de: " +consumo+ "litros por km percorridos");
	}

}
