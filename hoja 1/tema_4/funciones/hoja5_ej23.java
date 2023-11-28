package funciones;

import java.util.Scanner;

public class hoja5_ej23 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
	
		int[] array1= rellenarArray();
		int[] array2= rellenarArray();
		array2 = copiar_array(array1);
		
		
	}

	public static int[] rellenarArray() {
		System.out.println("introduce el tamaño del array: ");
		int num = entrada.nextInt();
		int[]  array= new int[num] ;
		for (int i = 0; i<num;i++) {
			System.out.println("introduce un valor: ");
			array[i] = entrada.nextInt();
			
			
		}
		
		return array;
	}
	public static int[] copiar_array(int[] array1) {
		
		
		return array1;
		
	}
	
	
}
