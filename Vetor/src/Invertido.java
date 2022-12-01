import java.util.Scanner;
public class Invertido {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int i,j,a[],b[];
		a = new int [10];
		b = new int [10];
		
		j=9;
		for (i=0; i<10; i++) {
			System.out.println("Digite o " + (i + 1) + "º indice do vetor A:");
			a[i] = in.nextInt();
			b[j] = a[i];
			j--;
		}
		
         //Exposição vetor A
		System.out.print("\nVetor A [ ");
		for (i=0; i<10; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.print(" ]");
		
		//Exposição vetor B
		System.out.print("\nVetor B [ ");
		for (i=0; i<10; i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.print(" ]");
	}

}


 