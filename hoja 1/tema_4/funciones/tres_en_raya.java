package funciones;

import java.util.Scanner;

public class tres_en_raya {
	// declaramos las variables globales
	static Scanner in = new Scanner(System.in);
	static char[] tablero = new char[9];

	public static void main(String[] args) {
		// aqui inicialivamos las variables
		char recreacion[][] = new char[9][9];
		int opcion = 0;
		int gana1 = 0;
		int gana2 = 0;
		int empate = 0;
		int partidas = 0;
		int cont = 0;
		int turno = 0;
		
//hacemos un bucle para que el programa se ejecute asta que el usuario desee salir
		while (opcion != 4) {
			// menu
			System.out.println("1. Jugar una partida");
			System.out.println("2. Mostrar estadísticas");
			System.out.println("3. recrear partida anterior");
			System.out.println("4. Salir");
			System.out.println("introduce una opcion: ");
			opcion = in.nextInt();

			// si introduce una opcion no valida se la volvera a pedir asta que esta sea
			// valida
			while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4) {
				System.out.println("introduce una opcion valida (1 - 2 - 3- 4): ");
				opcion = in.nextInt();

			}

			// opcion1: 1. Jugar una partida
			if (opcion == 1) {
				seleccionarFichas();	
			
				
				
				
				// inicializamos las variables turno y cont para que el array recreacion[][] no
				// tenga overflow ademas de para que recree la partida asta la ultima jugada
				turno = 0;
				cont = 0;
				// inicializamos las variables
				int pos;
				boolean vacio = false;
				boolean quedan = true;
				boolean gana = false;
				boolean gana_uno = false;
				boolean gana_dos = false;
				boolean empate_=false;
				char ficha_uno = 'x';
				char ficha_dos ='O';
				boolean fichas;
				 fichas= fichaUno(ficha_uno);
				 
				 if (!fichas) {
					 ficha_uno = 'O';
					 ficha_dos = 'x';
					 
					 
					 
				 }
				 else {
					 ficha_uno = 'x';
					 ficha_dos = 'O';
					 
					 
					 
				 }
				// esta funcion inicia el juego rellenando el array de espacios para una nueva
				// partida
				iniciar();

				// esta funcion muestra el tablero
				dibujaTablero();
				do {
					do {
						// dide que introduzca una posicion al jugador y si la posicion no es valida se
						// la vuelve a pedir
						System.out.println("Introduzca movimiento (Jugador 1)(entre 1-9): ");
						pos = in.nextInt();
						while (pos < 1 || pos > 9) {
							System.out.println("Introduzca movimiento (Jugador 1)(entre 1-9): ");
							pos = in.nextInt();
						}
						// esta funcio se encarga de comprobar si el movimiento se puede efectuar
						vacio = movimientoValido(pos);

					} while (pos <= 0 || pos >= 10 || vacio == false);
					// si el movimiento se puede efectuar esta funcion se encarga de poner el
					// movimiento del jugador 1 donde se quiera
					mueveJugador1(pos,ficha_uno);
					// en este bucle le asignamos los movimientos de cada turno del array tablero[]
					// al array recreacion[][]
					for (int i = 0; i < 9; i++) {
						recreacion[cont][i] = tablero[i];

					}
					cont++;
					turno++;
					// esta funcion se encarga de comprobar si queda alguna casilla
					quedan = quedanCasillas();
					// si no quedan casillas entra en la condicion y le suma 1 al contador empate
					if (!quedan) {
						empate_ = esEmpate();
						empate = empate + 1;
					}
					// esta funcion se encarga de comprobar si ha ganado el jugador 1
					gana = ganaJugador1(ficha_uno);
					// si gana le da un valor true y entra en la condicion y le da un valor false a
					// la variable quedan para que salga de la partida y se salte el turno del
					// jugador 2,
					// ademas de sumarle 1 al contador gana1 y mostrar un mensaje
					if (gana) {
						quedan = false;
						gana1 = gana1 + 1;
						gana_uno = true;
					
					}
					if (quedan == true) {
						do {// dide que introduzca una posicion al jugador y si la posicion no es valida se
							// la vuelve a pedir
							System.out.println("Introduzca movimiento (Jugador 2)(entre 1-9): ");
							pos = in.nextInt();
							while (pos < 1 || pos > 9) {
								System.out.println("Introduzca movimiento (Jugador 1)(entre 1-9): ");
								pos = in.nextInt();
							}
							// esta funcio se encarga de comprobar si el movimiento se puede efectuar
							vacio = movimientoValido(pos);
						} while (pos <= 0 || pos >= 10 || vacio == false);
						// si el movimiento se puede efectuar esta funcion se encarga de poner el
						// movimiento del jugador 2 donde se quiera
						mueveJugador2(pos,ficha_dos);
						// en este bucle le asignamos los movimientos de cada turno del array tablero[]
						// al array recreacion[][]
						for (int i = 0; i < 9; i++) {
							recreacion[cont][i] = tablero[i];

						}
						cont++;
						turno++;
						// esta funcion se encarga de comprobar si queda alguna casilla
						quedan = quedanCasillas();
						// esta funcion se encarga de comprobar si ha ganado el jugador 2
						gana = ganaJugador2(ficha_dos);
						// si gana le da un valor true y entra en la condicion y le da un valor false a
						// la variable quedan para que salga de la partida
						// ademas de sumarle 1 al contador gana1 y mostrar un mensaje
						if (gana) {
							quedan = false;
							gana2 = gana2 + 1;
							gana_dos = true;
							
						}
					}
				} while (quedan == true);
				muestraResultado(gana_uno, gana_dos, empate_);
			}
			

		
		// opcion 2: 2. Mostrar estadísticas
		if (opcion == 2) {
			partidas = gana1 + gana2 + empate;
			System.out.println("ESTADISTICAS");
			System.out.println();
			System.out.println("Se han jugado " + partidas + " partidas");

			System.out.println("El JUGADOR 1 ha ganado " + gana1 + " veces");

			System.out.println("El JUGADOR 2 ha ganado " + gana2 + " veces");

			System.out.println("Ha habido " + empate + " empates");
		}
		// opcion 3: 3. recrear partida anterior
		if (opcion == 3) {
			// este bucle representa cada jugada que se ha estado efectuando en la partida
			// anterior
			for (int i = 0; i < turno; i++) {

				System.out.println("-------------");
				System.out
						.println("| " + recreacion[i][0] + " | " + recreacion[i][1] + " | " + recreacion[i][2] + " |");
				System.out.println("-------------");
				System.out
						.println("| " + recreacion[i][3] + " | " + recreacion[i][4] + " | " + recreacion[i][5] + " |");
				System.out.println("-------------");
				System.out
						.println("| " + recreacion[i][6] + " | " + recreacion[i][7] + " | " + recreacion[i][8] + " |");
				System.out.println("-------------");

			}

		}
	
	}
		System.out.println("Vuelve Pronto!");
	}
	
	

	
	public static void muestraResultado(boolean gana_uno, boolean gana_dos, boolean empate_) {

		if (gana_uno==true) {
			System.out.println("Ha Ganado el Jugador 1!");
			
			
			
		}
		if (gana_dos==true) {
			System.out.println("Ha Ganado el Jugador 2!");
			
			
			
		}
		if (empate_==true) {
			System.out.println("Ha habido un empate!");
			
			
		}
		
		
		
		
		
	}
	
	public static void seleccionarFichas() {
		int opcion = 0;
		int pos = 1;
		
		while(opcion != 1 && opcion !=2) {
		
		System.out.println("elige una ficha(1 - 2): ");
		System.out.println("1. para 'x'");
		System.out.println("2. para 'O'");
		opcion = in.nextInt();
		
		
		
		}
	fichaUno(opcion);
		
		
		
	}
	
	
	public static boolean fichaUno(int opcion) {
		if (opcion==1) {
		return true;
		}
		else {
			return false;
		}
		
	}

	public static boolean esEmpate( ) {
		if (quedan == false) {

			return true;
		}
		return false;

	}

//llena el array de espacios
	public static void iniciar() {
		for (int i = 0; i < 9; i++) {
			tablero[i] = ' ';
		}
	}

//llena la posicion deseada con una x
	public static void mueveJugador1(int pos, char ficha_uno) {
		
		 
		
		
		tablero[pos - 1] = ficha_uno;
		System.out.println("-------------");
		System.out.println("| " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " |");
		System.out.println("-------------");
		System.out.println("| " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " |");
		System.out.println("-------------");
		System.out.println("| " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " |");
		System.out.println("-------------");

	}
	// llena la posicion deseada con una O

	public static void mueveJugador2(int pos, char ficha_dos) {
		tablero[pos - 1] = ficha_dos;
		System.out.println("-------------");
		System.out.println("| " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " |");
		System.out.println("-------------");
		System.out.println("| " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " |");
		System.out.println("-------------");
		System.out.println("| " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " |");
		System.out.println("-------------");

	}

//dibuja el tablero
	public static void dibujaTablero() {
		System.out.println("-------------");
		System.out.println("| 1 | 2 | 3 |");
		System.out.println("-------------");
		System.out.println("| 4 | 5 | 6 |");
		System.out.println("-------------");
		System.out.println("| 7 | 8 | 9 |");
		System.out.println("-------------");

	}

//comprueba si el movimiento es valido mirando si hay un espacio en la posicion deseada
	public static boolean movimientoValido(int pos) {

		if (tablero[pos - 1] == ' ') {
			return true;
		} else {
			return false;
		}

	}

//comprueba si quedan casillas vacias 
	public static boolean quedanCasillas() {
		for (int i = 0; i < 9; i++) {
			if (tablero[i] == ' ') {
				return true;

			}

		}
		return false;
	}

//opciones en las que puede ganar el jugador 1
	public static boolean ganaJugador1(char ficha_uno) {

		if (tablero[0] == ficha_uno && tablero[1] == ficha_uno && tablero[2] == ficha_uno) {
			return true;
		}
		if (tablero[3] == ficha_uno && tablero[4] == ficha_uno && tablero[5] == ficha_uno) {
			return true;
		}
		if (tablero[6] == ficha_uno && tablero[7] == ficha_uno && tablero[8] == ficha_uno) {
			return true;
		}
		if (tablero[0] == ficha_uno && tablero[3] == ficha_uno && tablero[6] == ficha_uno) {
			return true;
		}
		if (tablero[1] == ficha_uno && tablero[4] == ficha_uno && tablero[7] == ficha_uno) {
			return true;
		}
		if (tablero[2] == ficha_uno && tablero[5] == ficha_uno && tablero[8] == ficha_uno) {
			return true;
		}
		if (tablero[0] == ficha_uno && tablero[4] == ficha_uno && tablero[8] == ficha_uno) {
			return true;
		}
		if (tablero[2] == 'x' && tablero[4] == 'x' && tablero[6] == 'x') {
			return true;
		}
		return false;

	}

	// opciones en las que puede ganar el jugador 2
	public static boolean ganaJugador2(char ficha_dos) {
		if (tablero[0] == ficha_dos && tablero[1] == ficha_dos && tablero[2] == ficha_dos) {
			return true;
		}
		if (tablero[3] == ficha_dos && tablero[4] == ficha_dos && tablero[5] == ficha_dos) {
			return true;
		}
		if (tablero[6] == ficha_dos && tablero[7] == ficha_dos && tablero[8] == ficha_dos) {
			return true;
		}
		if (tablero[0] == ficha_dos && tablero[3] == ficha_dos && tablero[6] == ficha_dos) {
			return true;
		}
		if (tablero[1] == ficha_dos && tablero[4] == ficha_dos && tablero[7] == ficha_dos) {
			return true;
		}
		if (tablero[2] == ficha_dos && tablero[5] == ficha_dos && tablero[8] == ficha_dos) {
			return true;
		}
		if (tablero[0] == ficha_dos && tablero[4] == ficha_dos && tablero[8] == ficha_dos) {
			return true;
		}
		if (tablero[2] == ficha_dos && tablero[4] == ficha_dos && tablero[6] == ficha_dos) {
			return true;
		}
		return false;
	}
}