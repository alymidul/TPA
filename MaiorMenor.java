package laco02;
import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {

      Scanner in= new Scanner (System.in);
      
      int anoAtual,anoNac,idade,maisVelho=0,maisNovo=900;
		   
      for (int i=0;i<=10;i++) {
    	  
    	  System.out.println("Coloque o ano atual: ");
    	  anoAtual = in.nextInt();
    	  
    	  System.out.println("Coloque o ano de Nascimento: ");
    	   anoNac = in.nextInt();
    	  
    	  idade = anoAtual-anoNac;
    	  
    	  System.out.println("Sua idade é: "+idade);
    	  
    	  if (idade > maisVelho) {
    		  maisVelho = idade;
    	  }
          if (idade < maisNovo) {
        	  maisNovo = idade;
          }
      }
		System.out.println("O mais novo: " +maisNovo);
		System.out.println("O mais velho: " +maisVelho);
}
}