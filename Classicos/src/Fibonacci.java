
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Informe o n�mero em que vc quer que pare a sequ�ncia: ");
		int n = sc.nextInt(), result = 1, anterior = 0;

		for (int i = 1; i <= n; i++) {
			
			System.out.print(result + " | ");
			result = result + anterior;
			anterior = result - anterior;
		}
}

}


