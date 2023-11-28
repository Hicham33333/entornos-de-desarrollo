import java.util.Scanner;

public class tres_en_raya_hicham {
	static Scanner in = new Scanner(System.in);
	static char[] tablero = new char[9];

	public static void main(String[] args) {
		int pos;
		boolean vacio = false;
		boolean quedan = true;
		boolean gana = false;
		for (int i = 0; i < 9; i++) {
			tablero[i] = ' ';
		}
		dibujaTablero();
		do {
			do {
				System.out.println("Introduzca movimiento (Jugador 1)(entre 1-9): ");
				pos = in.nextInt();
				vacio = movimientoValido(pos);
			} while (pos <= 0 || pos >= 10 || vacio == false);
			mueveJugador1(pos);
			quedan = quedanCasillas();
			gana = ganaJugador1();
			if (gana = true) {
				quedan = false;
				System.out.println("Ha Ganado el Jugador 1!");
			}
			if (quedan == true) {
				do {
					System.out.println("Introduzca movimiento (Jugador 2)(entre 1-9): ");
					pos = in.nextInt();
					vacio = movimientoValido(pos);
				} while (pos <= 0 || pos >= 10 || vacio == false);
				mueveJugador2(pos);
				quedan = quedanCasillas();
			}
		} while (quedan == true);
		System.out.println("fin");
	}

	public static void mueveJugador1(int pos) {
		tablero[pos - 1] = 'x';
		System.out.println("-------------");
		System.out.println("| " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " |");
		System.out.println("-------------");
		System.out.println("| " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " |");
		System.out.println("-------------");
		System.out.println("| " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " |");
		System.out.println("-------------");

	}

	public static void mueveJugador2(int pos) {
		tablero[pos - 1] = 'O';
		System.out.println("-------------");
		System.out.println("| " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " |");
		System.out.println("-------------");
		System.out.println("| " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " |");
		System.out.println("-------------");
		System.out.println("| " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " |");
		System.out.println("-------------");

	}

	public static void dibujaTablero() {
		System.out.println("-------------");
		System.out.println("| 1 | 2 | 3 |");
		System.out.println("-------------");
		System.out.println("| 4 | 5 | 6 |");
		System.out.println("-------------");
		System.out.println("| 7 | 8 | 9 |");
		System.out.println("-------------");

	}

	public static boolean movimientoValido(int pos) {

		if (tablero[pos - 1] == ' ') {
			return true;
		} else {
			return false;
		}

	}

	public static boolean quedanCasillas() {
		for (int i = 0; i < 9; i++) {
			if (tablero[i] == ' ') {
				return true;

			}

		}
		return false;
	}

	
	public static boolean ganaJugador1() {
		if(tablero[0]=='x' || tablero[1]=='x' || tablero[2]=='x' ) {
			return false;
		}
		return true;
		
		
	}
	
	
	
	
	
	
	
	
	
}
