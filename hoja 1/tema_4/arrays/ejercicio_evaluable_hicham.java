package arrays;

import java.util.Scanner;

public class ejercicio_evaluable_hicham {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		double[] array = rellenarArray();
		for (int i = 0; i < 5; i++) {

			System.out.println(array[i]);
		}
		double sum = sumarElementos(array);
		System.out.println("la suma es: " + sum);

		double rest = restarElementos(array);
		System.out.println("la reta es: " + rest);
		double mult = multiplicarElementos(array);
		System.out.println("la multiplicacion es: " + mult);

		double div = dividirElementos(array);
		System.out.println("la division es: " + div);

		double promedio = calcularPromedio(array);
		System.out.println("el promedio es: " + promedio);

		double max = encontrarMaximo(array);
		System.out.println("el numero maximo es: " + max);

		double min = encontrarMinimo(array);
		System.out.println("el numero minimo es: " + min);

		double[] array2 = sumaAcumulada(array);
		System.out.println("array acumulada: ");
		for (int i = 0; i < 5; i++) {
			System.out.println(array2[i]);

		}

		array2 = invertirArray(array);
		System.out.println("el array invertido: ");
		for (int i = 0; i < 5; i++) {
			System.out.println(array2[i]);
		}
		System.out.println("introduce el numero que quieres buscar: ");
		double num = entrada.nextDouble();

		boolean numEsta = buscarNumero(array, num);
		if (numEsta) {
			System.out.println("el numero se encuentra en el array");

		}
		if (!numEsta) {
			System.out.println("el numero NO se encuentra en el array");

		}

	}

	public static double[] rellenarArray() {

		double[] array = new double[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("introduce un valor: ");
			array[i] = entrada.nextInt();
		}
		;

		return array;
	}

	public static double sumarElementos(double[] array) {
		double sum = 0;
		for (int i = 0; i < 5; i++) {

			sum = sum + array[i];
		}
		return sum;

	}

	public static double restarElementos(double[] array) {
		double rest = array[0];

		for (int i = 1; i < 5; i++) {

			rest = rest - array[i];
		}
		return rest;

	}

	public static double multiplicarElementos(double[] array) {
		double mult = 1;

		for (int i = 0; i < 5; i++) {

			mult = array[i] * mult;
		}
		return mult;

	}

	public static double dividirElementos(double[] array) {
		double div = array[0];
		for (int i = 1; i < 5; i++) {

			div = div / array[i];
		}
		return div;

	}

	public static double calcularPromedio(double[] array) {

		double sum = 0;
		for (int i = 0; i < 5; i++) {

			sum = sum + array[i];
		}
		return sum / 5;

	}

	public static double encontrarMaximo(double[] array) {
		double max = array[0];
		for (int i = 1; i < 5; i++) {
			if (array[i] > max) {
				max = array[i];

			}

		}
		return max;

	}

	public static double encontrarMinimo(double[] array) {
		double min = array[0];
		for (int i = 1; i < 5; i++) {
			if (array[i] < min) {
				min = array[i];

			}

		}
		return min;

	}

	public static double[] sumaAcumulada(double[] array) {

		double[] array2 = new double[5];
		array2[0] = array[0];
		for (int i = 1; i < 5; i++) {
			array2[i] = array[i] + array2[i - 1];

		}

		return array2;

	}

	public static double[] invertirArray(double[] array) {
		double[] array2 = new double[5];
		for (int i = 0; i < 5; i++) {
			array2[4 - i] = array[i];

		}
		return array2;

	}

	public static boolean buscarNumero(double[] array, double num) {
		for (int i = 0; i < 5; i++) {
			if (num == array[i]) {
				return true;

			}

		}
		return false;

	}

}