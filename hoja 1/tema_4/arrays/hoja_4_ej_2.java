package arrays;
// Que rellene un array con los 100 primeros números enteros y los muestre en
//pantalla en orden descendente
public class hoja_4_ej_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num; 
		int j = 0;
		int cont = 101;
		num = new int[100];
		for (int i=0;i<100;i++) {
		cont = cont -1;
			num[i]= cont;
			System.out.println(num[i]);	
		}
		}	
	}