// calculadora IMC
// com com duas casas decimais

package AulaJava;

import java.text.DecimalFormat;

public class CalculoImc {

	public static void main(String[] args) {
		
		double peso = 70.5;
		double altura = 1.65;
		double imc = peso/(altura*2);
		
		System.out.println("o IMC da pessoa é: "+imc);
		
		//formatacao das casas decimais com %.2f
		
		System.out.printf("o IMC da pessoa é: %.2f \n",imc);
		
		//formatacao das casas decimais com +new objeto
		System.out.println("o IMC da pessoa é: "+new DecimalFormat(".##").format(imc) );
	}

}
