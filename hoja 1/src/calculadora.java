//habilitamos entrada para lectura
import java.util.Scanner;
public class calculadora {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
            //introducimos la variable opcion que se leera por teclado
			Scanner lector = new Scanner(System.in);
			
			//establecemos las variables
			double perim;
			double lad1, lad2, lad3;
			int opcion = 0;
			while (opcion != 4) {
				//y las condiciones del programa que ejecutaran una solucion segun la opcion que elijamos
				//introducimos las opciones
				System.out.println("MENU");
					System.out.println("introduce una opciion, para calcular el perimetro de :");
					System.out.println("1. equilatero");
					System.out.println("2. isosceles");
					System.out.println("3. escaleno");
					System.out.println("4. salir");
				opcion = lector.nextInt();
			
			if (opcion == 1) {
				System.out.println("introduce el lado del triangulo equilatero: ");
				lad1 = lector.nextInt();
				perim = 3 * lad1;
				System.out.println("el perimetro es: " +perim );
			}
			if (opcion == 2) {
			    System.out.println("introduce los lados del triangulo isosceles: ");
			    System.out.println("introdce base: ");
			    lad1 = lector.nextInt();
			    System.out.println("introduce los lados");
			    lad2 = lector.nextInt();
			    perim = lad1 + lad2 + lad2;
			    System.out.println("el perimetro es: " +perim );
		    }
			if (opcion == 3) {
		    	System.out.println("introduce los lados del triangulo escaleno: ");
		    	System.out.println("introduce un lado: ");
		    	lad1 = lector.nextInt();
		    	System.out.println("introduce un lado: ");
		    	lad2 = lector.nextInt();
		    	System.out.println("introduce un lado: ");
		    	lad3 = lector.nextInt();
		    	perim = lad1 + lad2 + lad3;
		    	System.out.println("el perimetro es: " +perim );
		    } 
		    if(opcion ==4) {
		    	System.out.println("has salido");
		    
		    }
			}
			}

}
