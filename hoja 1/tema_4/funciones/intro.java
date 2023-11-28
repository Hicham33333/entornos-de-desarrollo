package funciones;

public class intro {
	// funcion principal. es la UNICA funcion
	// que se ejecuta en un programa
	public static void main(String[] args) {
		int suma = suma(5, 4);
		System.out.println(suma);
	}

// definimos una funcion
	// definimos la cabecera
	public static int suma(int a, int b) {
		// cuerpo
		return a + b;
	}

}
