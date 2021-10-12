import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] vetor1 = new String[5];
        String[] vetor2 = new String[5];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Informe o nome de um carro: ");
            vetor1[i] = scanner.nextLine();
            vetor2[i] = vetor1[i];
        }
        System.out.println("--- VETOR 1 ----");

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println(vetor1[i]);
        }
        System.out.println("");
        System.out.println("--- VETOR 2 ----");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println(vetor2[i]);
        }
    }
}