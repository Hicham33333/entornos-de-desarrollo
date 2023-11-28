//Que imprima la suma de todos los números impares que van del 1 al 100 y diga cuántos
//hay
public class hoja2_ej10 {
	public static void main(String[] args) {
		int i;
		int cont = 0;
		for (i=1;i<=100;i = i + 2) {
			System.out.println(i);
			cont = cont +1;
			
		}
		System.out.println("hay "+cont+" numeros pares del 1 al 100");
	}
}
