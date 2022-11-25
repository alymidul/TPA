package lista02;

import java.util.Scanner;
public class exec03 {
public static void main(String[] args) {
 Scanner ler = new Scanner (System.in);
	
    int a,b,c;
	 
System.out.println("escreva o primeiro lado:");
a= ler.nextInt();

System.out.println("escreva o segundo lado: ");
b = ler.nextInt();

System.out.println("escreva o terceiro lado: ");
c = ler.nextInt();

if (a>b+c || b>a+c || c>a+b){
	 System.out.println("Não é triângulo");
	 
}else if (a==b && b==c && c==a) {
        System.out.println("É um triângulo Equilatero");

}else if (a != b  && b != c) {
         System.out.println("Triângulo Escaleno");

}else {
 System.out.println("Triângulo Isóscele");
}

 
ler.close();	

          }

	}
