package arraysbidim;

import java.util.Scanner;

public class ej19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int[][] matrizInv = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("introduce un numero: ");
				matriz[i][j] = entrada.nextInt();

			}

		}
		System.out.println("esta es la matriz: ");
		System.out.println(" | "+matriz[0][0]+"  "+matriz[0][1]+"  "+matriz[0][2]+" | ");
		System.out.println(" | "+matriz[1][0]+"  "+matriz[1][1]+"  "+matriz[1][2]+" | ");
		System.out.println(" | "+matriz[2][0]+"  "+matriz[2][1]+"  "+matriz[2][2]+" | ");
		System.out.println();
		System.out.println("esta es la matriz traspuesta: ");
		System.out.println(" | "+matriz[0][0]+"  "+matriz[1][0]+"  "+matriz[2][0]+" | ");
		System.out.println(" | "+matriz[0][1]+"  "+matriz[1][1]+"  "+matriz[2][1]+" | ");
		System.out.println(" | "+matriz[0][2]+"  "+matriz[1][2]+"  "+matriz[2][2]+" | ");
		
		
		
	}

}
