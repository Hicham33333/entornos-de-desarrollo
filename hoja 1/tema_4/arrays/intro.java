package arrays;
import java.util.Scanner;
//haz un programa en java que pida 10 notas y muestre la media
//ademas debe mostrar las notas pedidas
public class intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//habilitamos la entrada por teclado
		Scanner entrada=new Scanner(System.in);
		//1. definimos el array de notas
		int notas[];
		int suma =0;
		//2. construimos el array
		notas = new int[10];
		// 3. construimos el array de 10 posiciones
		for (int i=0;i<10;i++) {
		System.out.println("introduce 1 valor");
		notas[i]=entrada.nextInt();
		suma = suma + notas[i];
		}
		for (int i =0;i<10;i++) {
			System.out.println(notas[i]);
		}
		System.out.println("La media es: "+(suma/10));
	}

}
