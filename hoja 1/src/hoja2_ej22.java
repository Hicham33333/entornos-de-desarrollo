import java.util.Scanner;
public class hoja2_ej22 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		float media ;
		int sum = 0;
		int cont = 0;
		while (cont <10){
			System.out.println("introduce un numero");
		int num=entrada.nextInt();
		sum = sum + num;
		cont = cont +1;
		}
		media = sum / cont ;
		System.out.println(media);
	}
	
}
