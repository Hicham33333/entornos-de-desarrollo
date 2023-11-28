package arrays;

import java.util.Scanner;

public class hoja_4_ej_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// habilitamos la lectura por teclado
		Scanner entrada = new Scanner(System.in);
		// definimos el array y las variables
		int[] num;
		num = new int[10];
		int sum = 0;
		int rest = 0;
		int multi = 1;
		int div;
		div = num[0];
		boolean haycero = false;

		// rellenamos el array
		for (int i = 0; i < 10; i++) {
			System.out.println("introduce un numero");
			num[i] = entrada.nextInt();
			if (num[i] == 0) {
				haycero = true;
			}
		}
		// definimos la operacion de la suma y lo mostramos
		for (int i = 0; i < 10; i++) {
			sum = sum + num[i];
		}
		System.out.println("la suma es: " + sum);

		// definimos la operacion de la resta y lo mostramos
		for (int i = 0; i < 10; i++) {
			rest = rest - num[i];
		}
		System.out.println("la resta es: " + rest);

		// definimos la operacion de la multiplicacion y lo mostramos
		for (int i = 0; i < 10; i++) {
			multi = multi * num[i];
		}
		System.out.println("la multiplicacion es: " + multi);

		// definimos la operacion de la division y lo mostramos
		for (int i = 0; i < 10; i++) {
			div = div / num[i];
		}
		if (haycero == false) {
			System.out.println("la division es: " + div);
		}
		else {
			System.out.println("la division no se puede realizar");
		}
	}

}