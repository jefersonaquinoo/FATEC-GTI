import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] nome = new String[11];

		for (int i = 1; i < nome.length; i++) {
			System.out.print("Informe o nome " + i + ": ");
			nome[i] = scanner.next();
			scanner.nextLine();
		}

		for (int i = 1; i < nome.length; i++) {
			System.out.print("[" + nome[i] + "] ");
		}
	}
}