import java.util.Scanner;
public class Tabuada {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        int i = 1;

        System.out.println("Digite o multiplicador da operação:");
        int n = scan.nextInt();
        System.out.println("Tabuada do " + n + ":");
        while (i<=10) {
            int res = i * n;
            System.out.println(i + " x " + n + " = " + res);
            i++;
        }
    }

}

