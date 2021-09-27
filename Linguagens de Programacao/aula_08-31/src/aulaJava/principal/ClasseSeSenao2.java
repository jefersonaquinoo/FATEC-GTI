package aulaJava.principal;

public class ClasseSeSenao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int notal = 50;
	int nota2 = 60;
	int nota3 = 70;
	int nota4 = 80;
	int media = 0;
		
		  media=(notal+nota2+nota3+nota4)/4; 
		 /* 
		 * System.out.println("media! "+ media);
		 */
		  
//		  condicao está com erros, testar novamente
//		  o if else
			  
	
	if(media>=70){
		System.out.println("Aluno aprovado direto! "+ media);
	}
	 if (media >= 40 && media <=69) {
		System.out.println("Aluno em recuperação "+ media);
	}else {
			System.out.println("Aluno reprovado! "+ media);
		}
	}
}

