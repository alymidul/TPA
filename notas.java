import java.util.Scanner;
public class notas {
	  public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	    
	   int aluno,mb,b,r,i,media,escolha;
	   
	   System.out.println("digite o n�mero de alunos da sala:");
	   aluno = in.nextInt();
	   System.out.println("Digite o n�mero de alunos com MB:");
	   mb = in.nextInt();
	   System.out.println("Digite o n�mero de alunos com B:");
	   b = in.nextInt();
	   System.out.println("Digite o n�mero de alunos com R");
	   r = in.nextInt();
	   System.out.println("Digite o n�mero de alunos com I");
	   i = in.nextInt();
	   System.out.println("1-Est�tistica dos MB,2-Est�tisticas dos B");
	   System.out.println("3-Est�tistica dos R,4-Est�ticas dos I");
	   escolha = in.nextInt();
	   switch (escolha) {
	     case 1:
	    	 media = (mb*100)/aluno;
	    	 System.out.println(media+ "% dos seus alunos tiaram MB");
	    	   break;
	     case 2:
	    	 media = (b*100)/aluno;
	    	 System.out.println(media+ "% dos seus alunos tiaram B");
	    	   break;
	     case 3:
	    	 media = (r*100)/aluno;
	    	 System.out.println(media+ "% dos seus alunos tiaram R");
	    	   break;
	     case 4:
	    	 media = (i*100)/aluno;
	    	 System.out.println(media+ "% dos seus alunos tiaram I");
	    	   break;
	     default:
	    	 System.out.println("Nota invalida");
	   }
	  in.close();
 }
}
