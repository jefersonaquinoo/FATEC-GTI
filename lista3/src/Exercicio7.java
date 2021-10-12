import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		int[] soma = new int[5];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe um numero para o vetor A na posição " + i + " : ");
			vetorA[i] = scanner.nextInt();
			System.out.print("Informe um numero para o vetor B na posição " + i + " : ");
			vetorB[i] = scanner.nextInt();
			soma[i] = vetorA[i] + vetorB[i];
		}

		for (int i = 0; i < soma.length; i++) {
			System.out.println("A soma do vetor A e B, da posição " + i + " valores: (" + vetorA[i] + ") + ("
					+ vetorB[i] + ") é: " + soma[i]);

		}

	}

}