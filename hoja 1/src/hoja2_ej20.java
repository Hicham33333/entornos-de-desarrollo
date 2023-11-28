import java.util.Scanner;
public class hoja2_ej20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner opcion=new Scanner(System.in);
		
	int op = 'n';
	System.out.println("desea salir del programa (s/n)");
	while (op != 's') {
		System.out.println(op+", no es valida introduce opcion valida");
		 op = opcion.nextInt();
	}
	 System.out.println("has salido del programa");
	}
	}


