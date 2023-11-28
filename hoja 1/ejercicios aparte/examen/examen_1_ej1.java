package examen;

import java.util.Scanner;

public class examen_1_ej1 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int cont1 = 1;
		int cont2 = 1;
		int cont3 = 1;
		int cont4 = 1;
		int cont5 = 1;
	
		while (num < 10000 || num > 99999) {
			System.out.println("introduce un numero de 5 cifras: ");
			num = entrada.nextInt();
		}
		while (num >= 10000) {
			
			if (num - 10000 > 10000) {
				cont1++;
			}
			num = num -10000;
		}
		while (num >= 1000) {
			if (num - 1000 > 1000) {
				cont2++;
			}
			num = num -1000;
		}
		
		
		while (num >= 100) {
			if (num - 100 > 100) {
				cont3++;
			}
			num = num -100;
		}
		while (num >= 10) {
			if (num - 10 > 10) {
				cont4++;
			}
			num = num -10;
		}
		while (num >= 1) {
			if (num - 1 >= 1) {
				cont5++;
			}
			num = num -1;
		}
	System.out.println(cont1+" "+cont2+" "+cont3+" "+cont4+" "+cont5);
	if (cont1 == cont5 && cont2 == cont4) {
		System.out.println("es capicua");
		
		
	}
	else {
		System.out.println("no es capicua");
	}
	
	
	
	
	
	
	
	
	
	}


}
