import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double sala;
		int s;
		
		do {
			System.out.println("Coloque o seu sal15�rio: ");
			sala = in.nextDouble();
					
			if (sala < 954) {
				System.out.println("Abaixo do sal�rio min�mo.");
				
			}else {
				System.out.println("Acima do sal�rio min�mo.");
			}
			System.out.println("Deseja continuar? (S-1 N-2)");
			s = in.nextInt();
			
		}while (s==1);
	}

}
