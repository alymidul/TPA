import java.util.Scanner;
public class Primos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe um n�mero: ");

		int primo = sc.nextInt(), x = 0;
		
		for (int i = 2; i <= primo; i++) {
			
			if (primo % i == 0) {
				if (primo != i) {
					System.out.println("N�o primo!");
					break;
				}
				
			}
			
			if (primo != i) {
				x++;
			}
			// x = 9
			// x -2 = 7
		}
		
		if (x == primo - 2) {
			System.out.println("Primo!");
		}
	}

	}

