import java.util.Scanner;

public class calculadoraa {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		double result;
		double num1;
		double num2;
		Scanner lector = new Scanner(System.in);
		char opcion = 'f';
		double cont = 1;
		double cont2 = 1;
		do {
System.out.println("selecciona opcion: ");
			System.out.println("sumar");
			System.out.println("resta");
			System.out.println("multiplicar");
			System.out.println("dividir");
			System.out.println("potencias");
			System.out.println("decimal-binario");
			System.out.println("binario-decimal");
			System.out.println("salir");
			opcion = lector.nextLine().charAt(0);
			

			if (opcion == 's' || opcion == 'S') {
				System.out.println("introduce el primer numero: ");
				num1 = lector.nextDouble();
				//capturamos el enter
				lector.nextLine();
				System.out.println("introduce el segundo numero: ");
				num2 = lector.nextDouble();
				//capturamos el enter
				lector.nextLine();
				result = num1 + num2;
				System.out.println("el resultado de la suma es: " + result);
			}
			if (opcion == 'r' || opcion == 'R') {
				System.out.println("introduce el primer numero: ");
				num1 = lector.nextDouble();
				//capturamos el enter
				lector.nextLine();
				System.out.println("introduce el segundo numero: ");
				num2 = lector.nextDouble();
				//capturamos el enter
				lector.nextLine();
				result = num1 - num2;
				System.out.println("el resultado de la resta es: " + result);
			}
			if (opcion == 'm' || opcion == 'M') {
				System.out.println("introduce el primer numero: ");
				num1 = lector.nextDouble();
				//capturamos el enter
				lector.nextLine();
				System.out.println("introduce el segundo numero: ");
				num2 = lector.nextDouble();
				//capturamos el enter
				lector.nextLine();
				result = num1 * num2;
				System.out.println("el resultado de la multiplicacion es: " + result);
			}
			if (opcion == 'd' || opcion == 'D') {
				System.out.println("introduce el primer numero: ");
				num1 = lector.nextDouble();
				//capturamos el enter
				lector.nextLine();
				System.out.println("introduce el segundo numero: ");
				num2 = lector.nextDouble();
				//capturamos el enter
				lector.nextLine();
				result = num1 / num2;
				System.out.println("el resultado de la division es: " + result);

			}
			if (opcion == 'p' || opcion =='P') {
				System.out.println("introduce la base: ");
				num1 = lector.nextDouble();
				//capturamos el enter
				lector.nextLine();
				System.out.println("introduce el exponente: ");
				num2 = lector.nextDouble();
				//capturamos el enter
				lector.nextLine();
			while (cont2 <= num2) {
			cont = cont * num1;
			 cont2 = cont2 + 1 ;
			 System.out.println(cont2);
			}
			System.out.println(cont);
			}
		} while (opcion != 'a' && opcion != 'A');

		System.out.println("has salido");

	}
}
