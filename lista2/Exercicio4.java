/*Utilizando a estrutura de repetição for, 
 * faça algoritmo que leia 10 números e 
 * verifique quantos deles estão no intervalo de [10 a 20], e 
 * quantos estão fora do intervalo. 
 */



import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int fora = 0;
        int intervalo = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe um numero: ");
            n = sc.nextInt();
            if (n >= 10 && n <= 20){
            intervalo++;
            } else {
                fora ++;
            }
        }
        System.out.println("A quantidade de numeros entre o intervalo de 10 e 20 é: " + intervalo);
        System.out.println("A quantidade de numeros fora do intervalo de 10 e 20 é: " + fora);
    }
}
