//Que pida un número y diga si es par o impar.
public class ej2 {
	public static void main(String[] args) {
	//declaracion de variables
	// tipo_dato nombre_variable;

	int num;
	//num <- 0
	//mostrar por pantalla introduce un numero
	System.out.println("introduce un numero");
	//leer num
	num = 5;
	//si (num mod 2 = 0) entonces es par
	if (num%2==0) {
	//mostrar "es par"
		System.out.println("es par");
	//sino
	}else {
	//motrar "es impar"
		System.out.println("es impar");
	}
}
}