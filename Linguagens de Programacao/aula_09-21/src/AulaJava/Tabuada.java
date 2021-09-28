package AulaJava;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escreva um agoritmo que calcule e mostre
		// a tabuada de um numero utilizando o comando For
		
		int num, i;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		num= teclado.nextInt();
		for(i=1;i<=10;i++) {
		//	System.out.println(num * i);
	System.out.println(num+" x "+i+" = "+num*i);	
	}

}
}