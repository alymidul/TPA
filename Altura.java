import java.util.Scanner;
public class Altura {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int i=1;
		double j=1.34;
		double p=1.45;
		
		while (j<=p) {
			j= j+2.5;
			p=p+2.0;
			i++;
		}
		System.out.println("João será mais alto em " +i+ " anos"); 
}
}