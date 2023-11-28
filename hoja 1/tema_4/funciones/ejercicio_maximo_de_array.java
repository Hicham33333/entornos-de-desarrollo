package funciones;

import java.util.Scanner;

public class ejercicio_maximo_de_array {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int[] nums = new int[8];

		nums = rellenaArray(nums);
		muestraArray(nums);
		int max = encontrar_maximo( nums);
		System.out.println("el valor maximo del arrays es: "+max);
	}

	public static int[] rellenaArray(int[] nums) {
		for (int i = 0; i < 8; i++) {
			System.out.println("introduce valor: ");
			nums[i] = entrada.nextInt();

		}
		return nums;
	}

	public static void muestraArray(int[] nums) {

		for (int i = 0; i < 8; i++) {
			System.out.println(nums[i]);

		}

	}
	
	public static int encontrar_maximo(int[] nums) {
		int max = nums[0];
		for (int i = 1; i<nums.length;i++) {
			if (nums[i]> max) {
			max = nums[i];	
				
			}
			
			
		}
		return max;
		
		
		
	}
}
