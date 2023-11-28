package arrays;
//1. Que rellene un array con los 100 primeros números enteros y los muestre en
//pantalla en orden ascendente
public class hoja_4_ej1 {
	public static void main(String[] args) {
		int [] num; 
		int j = 0;
		int cont = 0;
		num = new int[100];
		for (int i=0;i<100;i++) {
		cont = cont +1;
			num[i]= cont;
			System.out.println(num[i]);
		}
		}
	}

