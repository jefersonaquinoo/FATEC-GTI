import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int [] numero = new int[10];
        int [] metade = new int[10];

        for (int i = 0; i < numero.length; i++) {
            System.out.print("informe um numero: ");
            numero[i] = scanner.nextInt();
            metade[i] = numero[i] / 2;
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.println("A metade de " + numero[i] + " é: " + metade[i]);
        }
    }
}