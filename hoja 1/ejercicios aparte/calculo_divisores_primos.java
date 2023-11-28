import java.util.Scanner;

public class calculo_divisores_primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		boolean esprimo = false;
		System.out.println("introduce un numero entero y positivo: ");
		int num = entrada.nextInt();
		while (num < 0) {
			System.out.println("ERROR, introduce un numero entero y positivo: ");
			num = entrada.nextInt();
		}
		while (num > 0) {
			esprimo = true;
			for (int i = 2; i < num - 1; i++) {
				if (num % i == 0) {
					esprimo = false;

				}
			}
			if (esprimo == true) {
				System.out.println(num + " es primo");
			}
			num = num - 1;

		}

	}

}