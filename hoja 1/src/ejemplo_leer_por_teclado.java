//leer numero por teclado y astrar suma
import java.util.Scanner;
public class ejemplo_leer_por_teclado {
	//habiliamos la lectura de datos por consola
	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
	int num1,num2;
	//Leemos un entero
	num1=entrada.nextInt();
	num2=entrada.nextInt();
	System.out.println("la suma es: "+(num1+num2));
	
	}
}
