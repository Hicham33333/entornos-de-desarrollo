package tema_4;
import java.util.Scanner;
public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// habilitamos la lectura por teclado
		Scanner entrada = new Scanner(System.in);
		boolean salir = false;
		int num[] = new int[10];
		int num2[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("introduce un numero: ");
			num[i] = entrada.nextInt();
		}

		while (salir == false) {

			System.out.println("MENU, introduce una opcion: ");
			System.out.println("a. el valor máximo y mínimo del array");
			System.out.println("b. eliminar duplicados y sutituirlos por 0 (todos menos el primero");
			System.out.println("c. rotar array");
			System.out.println("d. salir");

			char opcion = entrada.next().charAt(0);

			if (opcion == 'd' || opcion == 'D') {
				salir = true;

			}

			if (opcion == 'a' || opcion == 'A') {
				int mayor = num[0];
				int menor = num[0];
				for (int i = 1; i < 10; i++) {
					if (num[i] > mayor) {
						mayor = num[i];
					}
					if (num[i] < menor) {
						menor = num[i];
					}
				}
				System.out.println("el numero mayor es: " + mayor);
				System.out.println("el numero menor es: " + menor);
			}
			if (opcion == 'b' || opcion == 'B') {
				for (int j = 0; j < 10; j++) {
					 int dup = num[j];
					for (int i = j + 1; i < 10; i++) {
						if (dup == num[i]) {
							num[i] = 0;
						}

					}

				}
				for (int i = 0; i < 10; i++) {
					System.out.println(num[i]);
				}

			}
			if (opcion == 'c' || opcion == 'C') {

				for (int i = 9; i >= 0; i--) {
					num2[i] = num[i];
				}

				for (int i = 0; i < 10; i++) {
					num[i] = num2[9 - i];
					System.out.println(num[i]);
				}

			}

		}

		System.out.println("has salido");

	}

}
