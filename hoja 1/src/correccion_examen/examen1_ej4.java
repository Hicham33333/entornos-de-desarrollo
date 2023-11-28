package correccion_examen;

import java.util.Scanner;

public class examen1_ej4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char opcion = 'o';
		do {

			System.out.println("introduce una opcion valida(p / i)");
			opcion = entrada.nextLine().charAt(0);

			if (opcion == 'p') {
				for (int i = 0; i <= 500; i = i + 2) {
					System.out.println(i);
				}
			}
			if (opcion == 'i') {
				for (int i = 1; i < 500; i = i + 2) {
					System.out.println(i);

				}
			}

		} while (opcion != 'p' && opcion != 'i');

	}

}
