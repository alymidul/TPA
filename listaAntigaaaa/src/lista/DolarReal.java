package lista;

import java.util.Scanner;

public class DolarReal {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System. in);	
			
			double real, dolar;
			
			System.out.println("Digite o valor do real:");
			real = leitura.nextInt();
			dolar = (real/4.94);
			System.out.println("o valor do real convertido em dólar é " + dolar );
			
			
			

	}

}
