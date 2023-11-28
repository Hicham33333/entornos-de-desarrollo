import javax.swing.plaf.synth.SynthColorChooserUI;

public class ej11 {
	public static void main(String[] args) {
    //Que pida una letra y detecte si es una vocal
	char letra;
	letra = '0';
	System.out.println("introduce letra");
	letra = 'a';
			
	if ((letra == 'a') || (letra == 'e') || (letra == 'i' ) || (letra == 'o' ) || (letra == 'u' )) {
		System.out.println("es una vocal");
	}else {
		System.out.println("no es vocal");
	}
			
	}
}
