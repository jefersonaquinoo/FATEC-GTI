package AulaJava;

import java.util.Scanner;

public class Metade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// leia 10 numeros e imprima a metade
	
		Scanner entrada = new Scanner(System.in);
					
		for(int i=0;i<10;i++) {
		
			System.out.println("Digite um numero: ");
			
			float num = entrada.nextFloat();
			float result = num/2;
			System.out.printf("A metade do numero lido é: %.2f \n",result);
	
	}
	}
}
