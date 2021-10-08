/*2. Escreva um algoritmo que leia 3 lados de um triângulo e 
  determine se ele é equilátero, isósceles ou escaleno.
  triangulos
  */

package fatec;

import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        System.out.print("Informe o lado A do triangulo: ");
        a = sc.nextInt();
        System.out.print("Informe o lado B do triangulo: ");
        b = sc.nextInt();
        System.out.print("Informe o lado C do triangulo: ");
        c = sc.nextInt();

        if( a < b + c && b < a + c && c < a + b){
            if(a == b && b == c){
                System.out.print("O triângulo é Eqüilátero!");
            }else if(a == b || a == c || b == c){
                System.out.print("O triângulo é Isósceles!");
            }else{
                System.out.print("O triângulo é Escaleno!");
            }
        }
        else
        {
            System.out.print("Os lados fornecidos não caracterizam um triângulo");
        }
    }
}