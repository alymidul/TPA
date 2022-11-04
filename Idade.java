import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
	 int atual,nasc,idade,dec;
	 
	 do {
		 System.out.println("Escreva o ano atual:");
		 atual = in.nextInt();
		 System.out.println("Escreva o seu ano de nascimento:");
		 nasc = in.nextInt();
		 
		 idade = atual-nasc;
		 System.out.println("Sua Idade: "+idade);
		 
		 if (idade >= 18) {
			 System.out.println("Maior de idade");
		 } else {
			System.out.println("Menor de idade");
		}
		 System.out.println("Deseja continuar o programa? SIM-1 NÃO-2");
		 dec = in.nextInt();
		 
	 } while (dec == 1);
	 System.out.println("Obrigado por escolher o programa da empresa Lunique! :)");
		 
	}
}



