import java.util.Scanner;
public class hoja2_ej23 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int sum = 0;
		int cont = -1;
		float media;
		int num = -1  ;
		while ( num != 0) {
			System.out.println("introduce un numero: ");
			num = lector.nextInt();
			sum = sum + num;
			cont = cont + 1;
		}
media = sum / cont;
		System.out.println("la media es, "+ media);
	
		
	}
}