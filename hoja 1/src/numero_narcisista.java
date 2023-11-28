import java.util.Scanner;

public class numero_narcisista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.println("introduce el numerode 3 cifras: ");
		int num = lector.nextInt();
		int numm = num;
		int num1 = 0;
		int num2 = 0;
		double num3 = 0;

		if (num >=100 && num <=999 ) {
			while (num >= 100) {
				  num = num-100;
				 num1 = num1 +1;
					 
				}
				while (num >=10 && num<=99) {
				  num= num-10;
				  num2 = num2 +1;
					
				}
				while (num<=9 && num>0) {
				 num = num-1;
				 num3 =num3 +1;
				}
			if (numm == (num1*num1*num1 )+(num2*num2*num2 )+(num3*num3*num3)) {
			
			System.out.println(numm+" es un numero narcisista");
			}else {
				System.out.println(numm+" no es un numero narcisista");
				
			
			 }
			
		}else{
			System.out.println(num+" no es un numero de 3 cifras");			
			
		}
			}
			}
	


