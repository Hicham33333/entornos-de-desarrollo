package funciones;

import java.util.Scanner;

public class hoja5_ej2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		int a = entrada.nextInt();
		int cuadrado = cuadrado(a);
		System.out.println("el cuadrado es: " + cuadrado);

	}

	public static int cuadrado(int a) {

		return a * a;

	}

}
