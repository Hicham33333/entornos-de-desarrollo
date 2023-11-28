package funciones;

import java.util.Scanner;

public class hoja4_EJ4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce dos numeros para calcular la media: ");
		int a = entrada.nextInt();
		int b = entrada.nextInt();

		int media = media(a, b);
		System.out.println("la media es: " + media);

	}

	public static int media(int a, int b) {

		return (a + b) / 2;

	}
}
