import java.util.Scanner;
public class EscolaFutebol {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	 int idade;

    	 System.out.println(" coloque a idade da crian�a:");
    	 idade= in.nextInt();

    	 switch (idade) {
    	  
    	   case 6:
    	           System.out.println("classe dente de leite");
    	                 break;

    	   case 7:
    	          System.out.println("classe J�nior");
    	                 break;

    	 case 8:
    	        System.out.println("classe J�nior max");
    	             break;

    	 case 9:
    	        System.out.println("classe J�nior master");
    	            break;

    	 case 10:
    	          System.out.println("classe master");
    	          
    	 default:
    	        System.out.println(" idade n�o aceita");
    	  }
    	in.close();
    }
}
