package funciones;

import java.util.Scanner;

public class reto1_examen {
	static Scanner entrada = new Scanner(System.in);
	static char[] tablero = new char[9];
	static char[][] tableroBidimensional = new char[9][9];

	public static void main(String[] args) {
		int opcion = 0;
		int win1 = 0, win2 = 0, empate = 0;
		int cont = 1;
		boolean ganajugador1 = false, ganajugador2 = false, Empate = false;
		do {
			int pos = '0';
			menu();
			opcion = entrada.nextInt();
			iniciar();
			switch (opcion) {
			case 1:
				entrada.nextLine();
				char ficha1='0', ficha2='0';
				iniciar();
				iniciarBidimensional();
				seleccionarFichas();
				ficha1=entrada.nextLine().charAt(0);
				while((ficha1!='X')&&(ficha1!='O')){
					System.out.println("Ficha no valida");
					ficha1=entrada.nextLine().charAt(0);
				}
				if(ficha1=='X') {
					ficha2='O';
					
				}
				if(ficha1=='O') {
					ficha2='X';
					
				}
				boolean fin = false;
				System.out.println("Partida comenzada");
				System.out.println(ficha1+": Jugador 1");
				System.out.println(ficha2+": Jugador 2");
				do {
					dibujarTablero();
					System.out.println("Jugador 1");
					pos = entrada.nextInt();
					mueveJugador1(pos, ficha1);
					dibujarTablero();
					guardar(cont);
					if (cont<=9) {
						cont++;
					}
					fin = quedanCasillas();
					if ((fin != true) && (ganaJugador1() != true)) {
						System.out.println("Jugador 2");
						pos = entrada.nextInt();
						mueveJugador2(pos, ficha2);
					}
					ganajugador1 = ganaJugador1();
					ganajugador2 = ganaJugador2();
					fin = quedanCasillas();
					guardar(cont);
					if (cont<=9) {
						cont++;
					}
				} while ((fin != true) && (ganajugador1 != true) && (ganajugador2 != true));
				dibujarTablero();
				muestraResultado();
				if (ganajugador1 == true) {
					win1++;
				}
				if (ganajugador2 == true) {
					win2++;
				}
				if ((esEmpate())) {
					empate++;
				}
				break;
			case 2:
				System.out.println("Estadisticas: ");
				System.out.println("El jugador 1 ha ganado " + win1 + " veces");
				System.out.println("El jugador 2 ha ganado " + win2 + " veces");
				System.out.println("Se han empatado " + empate + " veces");
				break;
			case 3:
				System.out.println("Recrear partida");
				dibujarTableroBidimensional(cont);
				break;
			case 4:
				System.out.println("Vuelve pronto");
				break;
			default:
				System.out.println("Opción invalida");
			}

		} while (opcion != 4);

	}

	public static void menu() {
		System.out.println("Introduzca una de las siguientes opciones: ");
		System.out.println("1: Jugar una partida");
		System.out.println("2: Mostrar estadisticas");
		System.out.println("3: Recrear partida");
		System.out.println("4: Salir");
		System.out.println("Introduzca la opción: ");

	}

	public static void mueveJugador1(int pos, char ficha) {
		boolean Movvalid = movimientoValido(pos);
		if (ficha=='X'){
			if (Movvalid == true) {
				tablero[pos - 1] = 'X';
			} else {
				System.out.println("Movimiento no valido");
			}
			while (Movvalid == false) {
				System.out.println("Intentelo de nuevo");
				pos = entrada.nextInt();
				Movvalid = movimientoValido(pos);
				if (Movvalid == true) {
					tablero[pos - 1] = 'X';
				}
			}
		}
		if (ficha=='O'){
			if (Movvalid == true) {
				tablero[pos - 1] = 'O';
			} else {
				System.out.println("Movimiento no valido");
			}
			while (Movvalid == false) {
				System.out.println("Intentelo de nuevo");
				pos = entrada.nextInt();
				Movvalid = movimientoValido(pos);
				if (Movvalid == true) {
					tablero[pos - 1] = 'O';
				}
			}
		}

	}

	public static void guardar(int cont) {
		for (int i = cont -1; i < cont-1; i++) {
			for (int j = 0; j < 9; j++) {
				tableroBidimensional[i][j] = tablero[j];
			}
		}
	}

	public static void mueveJugador2(int pos, char ficha) {
		boolean Movvalid = movimientoValido(pos);
		if (ficha!='X'){
			if (Movvalid == true) {
				tablero[pos - 1] = 'O';
			} else {
				System.out.println("Movimiento no valido");
			}
			while (Movvalid == false) {
				System.out.println("Intentelo de nuevo");
				pos = entrada.nextInt();
				Movvalid = movimientoValido(pos);
				if (Movvalid == true) {
					tablero[pos - 1] = 'O';
				}
			}
		}
		if (ficha!='O'){
			if (Movvalid == true) {
				tablero[pos - 1] = 'X';
			} else {
				System.out.println("Movimiento no valido");
			}
			while (Movvalid == false) {
				System.out.println("Intentelo de nuevo");
				pos = entrada.nextInt();
				Movvalid = movimientoValido(pos);
				if (Movvalid == true) {
					tablero[pos - 1] = 'X';
				}
			}
		}
	}

	public static boolean movimientoValido(int pos) {
		pos--;
		if (pos > 8) {
			return false;
		}
		if ((tablero[pos] == 'X') || (tablero[pos] == 'O')) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean quedanCasillas() {
		for (int i = 0; i < 9; i++) {
			if ((tablero[i] != 'X') && (tablero[i] != 'O')) {
				return false;
			}

		}
		return true;
	}

	public static void iniciar() {
		for (int i = 0; i < 9; i++) {
			tablero[i] = ' ';
		}
	}

	public static void iniciarBidimensional() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				tableroBidimensional[i][j] = ' ';
			}
		}
	}

	public static void dibujarTablero() {
		System.out.println("-------------");
		System.out.println("| " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " |");
		System.out.println("-------------");
		System.out.println("| " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " |");
		System.out.println("-------------");
		System.out.println("| " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " |");
		System.out.println("-------------");
	}

	public static void dibujarTableroBidimensional(int cont) {
		dibujarTablero();
		for (int i = 0; i < cont - 1; i++) {
			System.out.println("-------------");
			System.out.println("| " + tableroBidimensional[i][0] + " | " + tableroBidimensional[i][1] + " | "
					+ tableroBidimensional[i][2] + " |");
			System.out.println("-------------");
			System.out.println("| " + tableroBidimensional[i][3] + " | " + tableroBidimensional[i][4] + " | "
					+ tableroBidimensional[i][5] + " |");
			System.out.println("-------------");
			System.out.println("| " + tableroBidimensional[i][6] + " | " + tableroBidimensional[i][7] + " | "
					+ tableroBidimensional[i][8] + " |");
			System.out.println("-------------");
		}
		}


	public static boolean ganaJugador1() {
		
		if (((tablero[0] == 'X') && (tablero[4] == 'X') && (tablero[8] == 'X'))
				|| ((tablero[2] == 'X') && (tablero[4] == 'X') && (tablero[6] == 'X'))
				|| ((tablero[0] == 'X') && (tablero[3] == 'X') && (tablero[6] == 'X'))
				|| ((tablero[1] == 'X') && (tablero[4] == 'X') && (tablero[7] == 'X'))
				|| ((tablero[2] == 'X') && (tablero[5] == 'X') && (tablero[8] == 'X'))
				|| ((tablero[0] == 'X') && (tablero[1] == 'X') && (tablero[2] == 'X'))
				|| ((tablero[3] == 'X') && (tablero[4] == 'X') && (tablero[5] == 'X'))
				|| ((tablero[6] == 'X') && (tablero[7] == 'X') && (tablero[8] == 'X'))) {
			return true;
		}
		return false;
	}

	public static boolean ganaJugador2() {
		if (((tablero[0] == 'O') && (tablero[4] == 'O') && (tablero[8] == 'O'))
				|| ((tablero[2] == 'O') && (tablero[4] == 'O') && (tablero[6] == 'O'))
				|| ((tablero[0] == 'O') && (tablero[3] == 'O') && (tablero[6] == 'O'))
				|| ((tablero[1] == 'O') && (tablero[4] == 'O') && (tablero[7] == 'O'))
				|| ((tablero[2] == 'O') && (tablero[5] == 'O') && (tablero[8] == 'O'))
				|| ((tablero[0] == 'O') && (tablero[1] == 'O') && (tablero[2] == 'O'))
				|| ((tablero[3] == 'O') && (tablero[4] == 'O') && (tablero[5] == 'O'))
				|| ((tablero[6] == 'O') && (tablero[7] == 'O') && (tablero[8] == 'O'))) {
			return true;
		}
		return false;
	}

	public static boolean esEmpate() {
		boolean ganaJ1 = ganaJugador1(), ganaJ2 = ganaJugador2(), quedanCasillas = quedanCasillas();
		if ((ganaJ1 == true) && (ganaJ2 == true) && (quedanCasillas == true)) {
			return false;
		}
		return true;
	}

public static void muestraResultado(){
	if(ganaJugador1()) {
		System.out.println("Ha ganado Jugador 1");
	}
	if(ganaJugador2()) {
		System.out.println("Ha ganado Jugador 2");
	}
	if(esEmpate()) {
		System.out.println("Se ha empatado");
	}
}

	public static void seleccionarFichas() {
		System.out.println("Seleccione la ficha que desea (X o O)");
		}
	}

