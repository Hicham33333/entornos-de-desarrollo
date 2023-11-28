package arraysbidim;

import java.util.Scanner;

public class sudoku {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[][] sudoku = new int[9][9];

		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 9; j++) {

				System.out.println("introduce un numero: ");
				sudoku[i][j] = entrada.nextInt();

			}
		}
		for (int i = 0; i < 9; i++) {
			System.out.print(" | ");
			for (int j = 0; j < 9; j++) {

				System.out.print(sudoku[i][j]);

			}

			System.out.println();

		}
		comprobarBloques( sudoku);
		boolean ganafilas = comprobarFilas(sudoku);
		boolean ganacolumnas = comprobarColumnas(sudoku);

		if (ganafilas == true) {

			System.out.println("si");
		} else {

			System.out.println("no");
		}
		if (ganacolumnas == true) {

			System.out.println("si");
		} else {

			System.out.println("no");
		}

	}

	public static boolean comprobarFilas(int[][] sudoku) {
		int cont = 1;
		for (int i = 0; i < 9; i++) {
			cont = 1;
			for (int num = 0; num < 8; num++) {
				for (int j = 0; j + cont < 9; j++) {
					if (sudoku[i][num] == sudoku[i][j + cont]) {

						return false;

					}
				}
				cont++;
			}
		}
		return true;
	}

	public static boolean comprobarColumnas(int[][] sudoku) {
		int cont = 1;
		for (int i = 0; i < 9; i++) {
			cont = 1;
			for (int num = 0; num < 8; num++) {
				for (int j = 0; j + cont < 9; j++) {
					if (sudoku[num][i] == sudoku[j + cont][i]) {

						return false;

					}
				}
				cont++;
			}
		}
		return true;
	}

	public static boolean comprobarBloques(int[][] sudoku) {
		int iniciob = 0;
		int finb = 3;
		int inicioc = 0;
		int finc = 3;
		int cont = 1;

		for (int i = 0; i < 3; i++) {
			iniciob = iniciob + 3;
			finb = finb + 3;
			inicioc = 0;
			finc = 3;
			for (int b = iniciob; b < finb-1; b++) {
				for (int c = inicioc; c + cont < finc; c++) {

					if (sudoku[b][c] == sudoku[b][c + 1]) {
						System.out.println("adios");
						return false;
					}
				}
				cont++;
				inicioc = inicioc + 3;
				finc = finc + 3;
			}

		}
		System.out.println("hola");
		return true;
	}

}
