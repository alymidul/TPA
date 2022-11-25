package lista;

import java.util.Scanner;

public class Latadeoleo {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System. in);
		
		double r,h,rs,v;
		
		System.out.println("Digite o valor do raio:");
		r = leitura.nextDouble();
		System.out.println("Digite o valor da altura:");
		h = leitura.nextDouble();
		rs = (r*r*h);
		v = (rs/3.14);
		System.out.println("Esse será o volume da lata de óleo " + v );
		
	}

}
