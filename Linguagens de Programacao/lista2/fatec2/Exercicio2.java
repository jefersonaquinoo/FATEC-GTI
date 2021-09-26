package fatec2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n[] = new int[5];
        int soma = 0;

        for (int i = 0; i < n.length; i++) {
            System.out.print("Informe um numero: ");
            n[i] = sc.nextInt();
            if (n[i] % 2 == 0) {
                soma = soma + n[i];
            } else {
                n[i] = -1;
            }
        }
        System.out.println("A soma dos numeros pares é: " + soma);
    }
}

