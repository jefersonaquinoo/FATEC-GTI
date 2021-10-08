package vetor;

public class Vetor {

	public static void main(String[] args) {
		
		double notas[];
		double nota[]=new double[4];
		
		//atribuição de valores
		
		nota[0]=9.8;
		nota[1]=7.6;		
		nota[2]=5.5;
		nota[3]=8.4;
		
		for (int i=0;i<4;i++) {
		   System.out.println("nota "+(i+1)+" é="+nota[i]);
		}	   
	}

}
