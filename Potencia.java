import java.util.Scanner;
public class Potencia {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		double res=1;
		double b,e;
		
		System.out.println("Escreva a base:");
		b= scan.nextDouble();
		System.out.println("Escreva o expoente:");
		e= scan.nextDouble();
		while (e>0) {
			res= res *b;
		e--;
		}
		System.out.println("O resultado é:" +res );


	}

}
