import java.util.Scanner;
public class PrecoVenda {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double val,lucro,vend;
		int s;
		
		do {
		System.out.println("Coloque o valor do produto: ");
		val = in.nextDouble();
		System.out.println("Coloque a margem de Lucro : ");
		lucro = in.nextDouble();
		
		vend = val + ( val* lucro)/100;
		System.out.println("A venda é de: " + vend);
		 System.out.println("Deseja continuar o programa? (S-1  N-2)");
		 s = in.nextInt();
		 
		}while ( s== 1);
	}

}
