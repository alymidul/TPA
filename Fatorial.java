import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

        System.out.println("Digite um n�mero para descobrir seu fatorial:");
        int f = scan.nextInt();
        int res = 1;

        while (f>0) {
            res = res * f;
            f--;
        }
        System.out.println("O fatorial do n�mero inserido �: " + res);

	}

}
