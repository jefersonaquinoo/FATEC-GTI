package vetor;

import java.util.Scanner;

public class Vetor2 {

		
	public static void main(String[] args) {
		
	Scanner teclado = new Scanner (System.in);
	System.out.println ("Digite a qtde de notas: ");
		int tamanho = teclado.nextInt();
	
	double notas[] = new double [tamanho];
	for (int i=0;i< notas.length;i++) {
	  
		System.out.println("digite uma nota");
		notas[i]=teclado.nextDouble();
	}
	for (int i=0;i< notas.length;i++) {
	System.out.println("nota "+(i+1)+" é="+nota[i]);
	}	
	}

}
