package correccion_examen;

import java.util.Scanner;

public class examen1_el3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce dos numeros entre 0 y 100");
		System.out.println("intraduce el primer numero: ");
		int a = entrada.nextInt();
		System.out.println("introduce el segundo numero: ");
		int b = entrada.nextInt();
		if (a < 0 || a > 100 || b < 0 || b > 100) {
			System.out.println("ERROR, numero no valido");
		} else {
			if (a < b) {
				while (a <= b) {
					System.out.println(a + " ");
					a++;
				}
			}
			if (a > b) {
				while (a >= b) {
					System.out.println(a + " ");
					a--;
				}
			}

		}

	}

}
