/*Crie um programa que faça a soma de duas matrizes [3x3]. */



import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];
        int soma[][] = new int[3][3];
        int somaT = 0;

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                System.out.print("Informe o numero da posição " + "[" + i + "]" + "[" + j + "]" + " da matriz A:");
                m1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                System.out.print("Informe o numero da posição " + "[" + i + "]" + "[" + j + "]" + " da matriz B:");
                m2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma.length; j++) {
                soma[i][j] = m1[i][j] + m2[i][j];
                somaT = somaT + soma[i][j];
            }
        }
                System.out.println("A soma da matriz A e B é: " + somaT);

    }
}

