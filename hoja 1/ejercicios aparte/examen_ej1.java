import java.util.Scanner;

public class examen_ej1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;
		int cont5 = 0;
		System.out.println("introduce un numero de 5 cifras: ");
		num = entrada.nextInt();
		while (num > 10000 && num < 99999) {
			System.out.println("introduce un numero de 5 cifras: ");
			num = entrada.nextInt();
		}
		while (num < 10000) {
			if (num - 10000 > 10000) {
				cont1++;
			}
		}
		while (num < 1000) {
			if (num - 1000 > 1000) {
				cont2++;
			}
		}
		
		
		while (num < 100) {
			if (num - 100 > 100) {
				cont3++;
			}
		}
		while (num < 10) {
			if (num - 10 > 10) {
				cont4++;
			}
		}
		while (num < 1) {
			if (num - 1 > 1) {
				cont5++;
			}
		}
	System.out.println(cont1+cont2+cont3+cont4+cont5);
	
	
	
	
	
	
	
	
	
	
	}

}
