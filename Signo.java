import java.util.Scanner;
public class Signo {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	        System.out.println("Digite o n�mero do seu m�s de nascimento:");
	        int mes = scan.nextInt();
	        System.out.println("Digite o n�mero do seu dia de nascimento:");
	        int dia = scan.nextInt();

	        switch (mes) {
	            case 1:
	                if (dia < 21) {
	                    System.out.println("Capric�rnio");
	                } else if (dia <= 31) {
	                    System.out.println("Aqu�rio");
	                }
	                break;
	            case 2:
	                if (dia < 20) {
	                    System.out.println("Aqu�rio");
	                } else if (dia <= 29) {
	                    System.out.println("Peixes");
	                }
	                break;
	            case 3:
	                if (dia < 21) {
	                    System.out.println("Peixes");
	                } else if (dia <= 31) {
	                    System.out.println("�ries");
	                }
	                break;
	            case 4:
	                if (dia < 21) {
	                    System.out.println("�ries");
	                } else if (dia <= 30) {
	                    System.out.println("Touro");
	                }
	                break;
	            case 5:
	                if (dia < 21) {
	                    System.out.println("Touro");
	                } else if (dia <= 31) {
	                    System.out.println("G�meos");
	                }
	                break;
	            case 6:
	                if (dia < 21) {
	                    System.out.println("G�meos");
	                } else if (dia <= 30) {
	                    System.out.println("C�ncer");
	                }
	                break;
	            case 7:
	                if (dia < 22) {
	                    System.out.println("C�ncer");
	                } else if (dia <= 31) {
	                    System.out.println("Le�o");
	                }
	                break;
	            case 8:
	                if (dia < 23) {
	                    System.out.println("Le�o");
	                } else if (dia <= 31) {
	                    System.out.println("Virgem");
	                }
	                break;
	            case 9:
	                if (dia < 23) {
	                    System.out.println("Virgem");
	                } else if (dia <= 30) {
	                    System.out.println("Libra");
	                }
	                break;
	            case 10:
	                if (dia < 23) {
	                    System.out.println("Libra");
	                } else if (dia <= 31) {
	                    System.out.println("Escorpi�o");
	                }
	                break;
	            case 11:
	                if (dia < 22) {
	                    System.out.println("Escorpi�o");
	                } else if (dia <= 30) {
	                    System.out.println("Sagit�rio");
	                }
	                break;
	            case 12:
	                if (dia < 22) {
	                    System.out.println("Sagit�rio");
	                } else if (dia <= 31) {
	                    System.out.println("Capric�rnio");
	                }
	                break;
	            default:
	                System.out.println("M�s inv�lido");
	        }
	    }

	}

