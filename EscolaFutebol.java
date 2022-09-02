import java.util.Scanner;
public class EscolaFutebol {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	 int idade;

    	 System.out.println(" coloque a idade da criança:");
    	 idade= in.nextInt();

    	 switch (idade) {
    	  
    	   case 6:
    	           System.out.println("classe dente de leite");
    	                 break;

    	   case 7:
    	          System.out.println("classe Júnior");
    	                 break;

    	 case 8:
    	        System.out.println("classe Júnior max");
    	             break;

    	 case 9:
    	        System.out.println("classe Júnior master");
    	            break;

    	 case 10:
    	          System.out.println("classe master");
    	          
    	 default:
    	        System.out.println(" idade não aceita");
    	  }
    	in.close();
    }
}
