public class Exercicio1 {

	public static void main(String[] args) {

		int tab = 8;
		int num = 10;
		int tabuada[] = new int[11];

		for (int i = 0; i <= num; i++) {
			tabuada[i] = tab * i;
		}

		System.out.println("----- TABUADA -----");
		for (int i = 0; i <= num; i++) {
			System.out.println(tab + " x " + i + " = " + tabuada[i]);
		}
	}
}