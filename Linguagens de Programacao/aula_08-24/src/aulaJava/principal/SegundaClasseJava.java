package aulaJava.principal;

public class SegundaClasseJava {

	static int maiorIdadeGlobal = 21;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int maiorIdade = 18;
		int idosoIdade = 60;
		String cpf = "123.456.789.12";
				
		System.out.println("A maioridade é com : "+maiorIdade);
		System.out.println("A idade do idoso começa a partir de: "+idosoIdade);
		System.out.println("e o CPF é: "+ cpf);
		metodo2();
		
	}

	public static void metodo2() {
		System.out.println(maiorIdadeGlobal);
}

}