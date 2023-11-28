package arraysbidim;

public class ej17 {
	public static void main(String[] args) {

		int[][] numeros = new int[11][10];
		int cont = 0;
		int suma = 0;
		int cont2 = 0;
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				cont = cont +1;
				numeros[i][j] = cont;
				
				
				
				
			}

		}
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				
		suma = suma + numeros[j][i];
				
				
				
			}
			numeros[10][cont2] =suma ;
			cont2++;
			suma = 0;
		}
		
		
		for (int i = 0; i < 11; i++) {

			for (int j = 0; j < 10; j++) {
				System.out.print("  "+numeros[i][j]+"  ");
				
				
				
				
			}
System.out.println();
		}

		
		
		
	}
}
