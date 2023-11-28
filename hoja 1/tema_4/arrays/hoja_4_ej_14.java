package arrays;

//Que rellene un array con 20 números y luego busque un número concreto.
import java.util.Scanner;

public class hoja_4_ej_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// habilitanos la lectura por teclado
		Scanner entrada = new Scanner(System.in);
		// definimos el array y las variables y el booleano que vamos a utilizar
		final int TAMAÑO=5;
		int num[] = new int[TAMAÑO];
		int bus;
		int posicion = 1;
		boolean noesta = true;
		// este bucle for se encarga de almacenar las valorers que introducimos por
		// teclado a cada posicion
		for (int i = 0; i < TAMAÑO; i++) {
			System.out.println("introduce un numero: ");
			num[i] = entrada.nextInt();
		}
		// con este paso pedimos el numero que desea buscar
		System.out.println("introduce el numero que quieres buscar: ");
		bus = entrada.nextInt();
		// con este otro bucle for pedimos el numero que quiere saber su posicion
		for (int i = 0; i < TAMAÑO; i++) {
			// si el numero coincide con la posiscion entra en este bucle sino se salta este
			// bucle
			if (bus == num[i] && noesta == true) {
				// si entras al bucle te dice la posicion en la que se encuentra el numero
				// gracias al contador(cont)
				// y le pone un nuevo valor al booleano(noesta)
				System.out.println("el numero que buscas esta en la posicion: " + posicion);
				noesta = false;
			}
			posicion = posicion + 1;
		}
//por ultimo si no se encontro ningun numero te muestra este mensaje
		if (noesta == true) {
			System.out.println("el numero que buscas no se encuentra");
		}
	}

}
