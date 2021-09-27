package aulaJava.principal;

public class ClasseSeSenao2c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int notal = 90;
	int nota2 = 96;
	int nota3 = 90;
	int nota4 = 90;
	int media = 0;
		
		  media=(notal+nota2+nota3+nota4)/4; 
		  
		 System.out.println("Média: "+ media);
		 
		 
			  
	
	if(media>=50){
		if (media>=70) {
			if (media>=90) {
			System.out.println("Aluno aprovado direto - Parabéns! ");
			}else {
				System.out.println("Aluno aprovado direto! ");	
			}
		}else {	
			System.out.println("Aluno em recuperação ");
		}	
	}else {
			System.out.println("Aluno reprovado! ");
		}
	}
}

