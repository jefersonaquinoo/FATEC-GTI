// utilizando o Continue após o break
//

package aulaJava.principal;

public class ClassePara1c {

	public static void main(String[] args) {
		
		

		for(int numero =0; numero<=10;numero++) {
		if (numero ==3||numero ==6||numero ==9) {
										
		System.out.println("o numero foi encontrado: ");
		System.out.println(numero);
		continue;
		}
		System.out.println("processando laço de repetição em : "+ numero);
		}
		
	}

}
