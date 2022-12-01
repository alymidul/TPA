import java.util.Scanner;
public class maiorMenorNumero {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
	
		int i,menor,maior,a[];
		a =new int [10];
	   
		for (i=0; i<10; i++) {
		  System.out.println("Digite o " +(i+1)+ "° indice ");
		  a[i] = in.nextInt();
		}
			menor = a[0];
			maior = 0;

	   	for ( i=0; i <10 ; i++) {
		   if (a[i] > maior ) {
			maior = a[i];
		}else if (a[i] <menor ){
			menor = a[i];
		}
	   	}
		System.out.println("\nO maior número é: " +maior);
	    System.out.println(	"\nO menor número é: "+menor);
		
	   }
	}

