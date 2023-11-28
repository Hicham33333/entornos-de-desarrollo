import java.util.Scanner;
public class dibujar_figura1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont =1;
	int cont2=1;
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce un numero de filas: ");
		int num = entrada.nextInt();
		while (cont < num) {
			System.out.println("*");
			cont =cont + 1;
			cont2 = 1;
			while (cont2 < cont) {
			System.out.print("*");
			cont2 = cont2 +1;
			}
		}
	System.out.print("*");
	}

}
