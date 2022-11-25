package lista;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double prod,centa,desc;
		System.out.println("Digite o valor do produto:");
		prod = in.nextInt();
		System.out.println("Digite o valor da porcentagem de desconto:");
		centa = in.nextInt();
		desc = (prod*centa/100);
		System.out.println("Esse será o valor do desconto:" + desc );
		
		
		

	}

}
