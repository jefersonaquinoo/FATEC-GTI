package listaricardo;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n[] = new int[5];

        for (int i = 0; i < n.length; i++){
            System.out.print("Informe um numero: ");
            n[i] = sc.nextInt();
            if (n[i]%2==0){
                n[i] = 1;
            } else {
                n[i] = -1;
            }
        }
        System.out.print("[");
        for (int i = 0; i < n.length; i++){
            System.out.print(" " + n[i] + " ");
        }
        System.out.print("]");

    }

}
