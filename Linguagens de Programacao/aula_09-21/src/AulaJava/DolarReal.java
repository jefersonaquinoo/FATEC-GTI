package AulaJava;

import java.util.Scanner;

public class DolarReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a cotação do dolar: ");
		double cotacao = entrada.nextDouble();
		
		System.out.println("Digite de reais disponiveis: ");
		double reais = entrada.nextDouble();
		
		double dolar = (reais/cotacao);
		System.out.printf("A Quantidade de dolares é: %.2f", dolar);
		
	}

}
