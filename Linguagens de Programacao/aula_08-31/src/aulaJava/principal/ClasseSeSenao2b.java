// estrutura de comparação com operador ternário
		  //que substitui o bloco anterior

package aulaJava.principal;

public class ClasseSeSenao2b {

	public static void main(String[] args) {
	
	int notal = 50;
	int nota2 = 60;
	int nota3 = 70;
	int nota4 = 80;
	int media = 0;
		
		  media=(notal+nota2+nota3+nota4)/4; 
  
		  String saidaResultado = media>=70? "Aluno Aprovado"
		  	 :(media>=40 && media <=69)? "Aluno em Recuperação"
		  	 :"Reprovado";
		  
		System.out.println("Média: "+ media);
		System.out.println(saidaResultado);
				  
		}
	}


