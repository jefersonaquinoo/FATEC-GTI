package AulaJava;

import java.util.Scanner;

public class LeituraNomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leia 20 nomes
		
		int num, i;
		Scanner entrada = new Scanner(System.in);
					
		for(i=0;i<20;i++) {
		
			System.out.println("Digite o nome de uma Pessoa: ");
			String nome=entrada.next();
			System.out.println("O valor do contador é: "+i);
		
	}

}
}