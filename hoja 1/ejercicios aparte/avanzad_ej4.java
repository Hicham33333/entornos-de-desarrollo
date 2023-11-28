import java.util.Scanner;

public class avanzad_ej4 {
/*4. Suma de Números Primos. Crea un programa en Java que encuentre todas las formas en
que un número entero positivo puede expresarse como la suma de dos números primos. Por
ejemplo, 10 se puede expresar como 3 + 7 y como 5 + 5.*/
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce el numero: ");
		int num=entrada.nextInt();
		int a=1;
		int b=1;
		boolean aesprimo=false;
		boolean besprimo=false;
		while (a<num) {
			b= 1;
			for (int i =1;i<a;i++) {
				if (a%i==0) {
				aesprimo=false;	
				}
				else {
					aesprimo=true;
				}
				
			}
			
			while(b<num) {
				for (int i =1;i<b;i++) {
					if (b%i==0) {
					besprimo=false;	
					}
					else {
						besprimo=true;
					}
			
			
			if (num==a+b && aesprimo==true && besprimo==true) {
				System.out.println(a+" + "+b+" = "+num);
				
			}
			
			
			b++;
			}
			a++;
			
			
			
		}
		
		
		
		
		
		
		
	}
	}
}
