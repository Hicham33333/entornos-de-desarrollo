package funciones;

import java.util.Scanner;

public class calculadora_Hicham_el_farissi {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		double num2;
		double num1;
		char opcion;
		double result;
		do {
			Mostrar_menu();
			opcion = entrada.nextLine().charAt(0);
			if (opcion != 'a' && opcion != 'A') {

				if (opcion == 's' || opcion == 'S') {
					System.out.println("introduzca el primer número: ");
					num1 = entrada.nextDouble();
					entrada.nextLine();
					System.out.println(" Introduzca el segundo número: ");
					 num2 = entrada.nextDouble();
					entrada.nextLine();
					result = Suma(num1, num2);
					System.out.println("el resultado es: " + result);
				}
				if (opcion == 'r' || opcion == 'R') {
					System.out.println("introduzca el primer número: ");
					 num1 = entrada.nextDouble();
					entrada.nextLine();
					System.out.println(" Introduzca el segundo número: ");
					 num2 = entrada.nextDouble();
					entrada.nextLine();
					result = Resta(num1, num2);
					System.out.println("el resultado es: " + result);
				}
				if (opcion == 'm' || opcion == 'M') {
					System.out.println("introduzca el primer número: ");
					 num1 = entrada.nextDouble();
					entrada.nextLine();
					System.out.println(" Introduzca el segundo número: ");
					 num2 = entrada.nextDouble();
					entrada.nextLine();
					result = Multiplicacion(num1, num2);
					System.out.println("el resultado es: " + result);
				}
				if (opcion == 'd' || opcion == 'D') {
					System.out.println("introduzca el primer número: ");
					 num1 = entrada.nextDouble();
					entrada.nextLine();
					do {
						System.out.println(" Introduzca el segundo número(no puede ser '0'): ");
						 num2 = entrada.nextDouble();
					}while (num2 == 0);
					entrada.nextLine();
					result = Division(num1, num2);
					System.out.println("el resultado es: " + result);
				} else {
					System.out.println("ERROR, introduce  una opcion valida");

				}
			}

		} while (opcion != 'a' && opcion != 'A');
		System.out.println("has salido");
	}

	public static void Mostrar_menu() {

		System.out.println("introduce una opcion; ");
		System.out.println("Suma");
		System.out.println("Resta");
		System.out.println("Multiplicacion");
		System.out.println("Division");
		System.out.println("sAlir");

	}

	public static double Suma(double num1, double num2) {
		return num1 + num2;
	}

	public static double Resta(double num1, double num2) {
		return num1 - num2;
	}

	public static double Multiplicacion(double num1, double num2) {
		return num1 * num2;
	}

	public static double Division(double num1, double num2) {
		return num1 / num2;
	}

}
