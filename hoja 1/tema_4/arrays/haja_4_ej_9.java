package arrays;

//. Que lea 5 números por teclado, los copie a otro array multiplicados por 2 y
//muestre el segundo array.
import java.util.Scanner;

public class haja_4_ej_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// habilitamos la lectura por teclado
		Scanner entrada = new Scanner(System.in);
		// definimos los arrays
		int[] num;
		num = new int[5];
		int[] num2;
		num2 = new int[5];
		for (int i = 0; i < 5; i++) {
			// pedimos que escriba los numeros
			System.out.println("introduce un numero: ");
			// hacemos que la segunda array (num2[]) valga el doble
			num[i] = entrada.nextInt();
			num2[i] = num[i] * 2;
		}
		// mostramos el segundo array (num2[])
		for (int i = 0; i < 5; i++) {
			System.out.println(num2[i]);
		}
	}

}
