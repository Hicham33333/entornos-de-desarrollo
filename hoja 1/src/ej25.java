//25. Que calcule el sueldo que le corresponde al trabajador de una empresa que cobra
//40.000 euros anuales, el programa debe realizar los cálculos en función de los
//siguientes criterios:

//a. Si lleva más de 10 años en la empresa se le aplica un aumento del 10%.
//b. Si lleva menos de 10 años pero más que 5 se le aplica un aumento del 7%.
//c. Si lleva menos de 5 años pero más que 3 se le aplica un aumento del 5%.
//d. Si lleva menos de 3 años se le aplica un aumento del 3%
public class ej25 {
	public static void main(String[] args) {
		//declarar variables
		int sueldo;
		double aumento;
		int años;
		//inicializo las variables
		aumento = 0;
		sueldo = 0;
		System.out.println("introduce años en la empresa y sueldo");
		sueldo = 40000;
		años = 5;
		//escribimos la condicion 
		if (años > 10) {
		    aumento = (sueldo+ sueldo*10/100);
		}
		else if (años <=10  &&  años > 5){
			aumento = (sueldo+ sueldo*7/100);
		}
		else if (años <=5 && años > 3){
		    aumento = (sueldo+ sueldo*5/100);
		}
		else if (años <= 3 ){
			aumento = (sueldo+ sueldo*3/100);
		}
		
		System.out.println("tu sueldo es de, " + aumento);
		
	
	}

}
