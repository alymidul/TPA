package lista02;
import java.util.Scanner;
public class media {
public static void main(String[] args) {
   Scanner ler = new Scanner (System.in);
			
		    double a,b,m,n1,media=0;

		System.out.println("escreva a primeira nota:");
		a= ler.nextDouble();

		System.out.println("escreva a segundo nota: ");
		b = ler.nextDouble();

		m = (a+b)/2;

		if (m<3) {
		  System.out.println("Reprovado");

		}else if (m>=6) {
		  System.out.println("Aprovado");

		}else if (m>=3 && m<6) {
			System.out.println("Você está em exame,escreva sua nota:");
		
		 	n1 = ler.nextDouble();
		 
		 	media =(n1+m)/2;
		
		 	if (media >=6) {
			  System.out.println("Aprovado");
		 	}else {
			 System.out.println("Reprovado");
		 	}
		  }
		 
		ler.close();	

}
}
			



