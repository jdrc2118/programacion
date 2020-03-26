package co.edu.unbosque.model;

import java.util.Random;

public class Logica {

	private String tablero[][];
	private int filas;
	private int columnas;

	private String ficha1;
	private String ficha2;

	public Logica() {

		// inicializador matriz y variables
		filas = 3;
		columnas = 3;
		tablero = new String[filas][columnas];

		ficha1 = "X";
		ficha2 = "O";

	}

	public void jugar() {

		// llamador de metodos para el correcto funcionamiento en el orden
		// necesario del juego

		mayusculas();

		if (logica1()) {

		} else if (filasO()) {

		} else if (columnasO()) {

		} else if (diagonalesO()) {

		} else if (filasX()) {

		} else if (columnasX()) {

		} else if (diagonalesX()) {

		} else if (casosEspeciales()) {

		} else if (circuloFilas()) {

		} else if (circuloColumnas()) {

		} else if (circuloDiagonales()) {

		} else if (colocarCirculo()) {

		}

		
	}
	
	public boolean fichaPersona() {

		boolean a = false;
		int auxx = 0 ;
		int auxo = 0 ;
		
		if (a == false) {
			
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
					if(tablero[i][j].equalsIgnoreCase(ficha1)){
						auxx++;
					}
					if(tablero[i][j].equalsIgnoreCase(ficha2)){
						auxo++;
					}

				
			}
		}
		if(auxx>auxo){
			a = true;
		}
		}
		return a;

	}
	

	public void mayusculas() {

		// convierte la x minuscula a mayuscula si el usuario la digita de esta
		// manera
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (tablero[i][j].equals("x")) {
					tablero[i][j] = "X";

				}

			}
		}

	}

	public boolean verificarLetras() {

		// revision de la matriz por posiciones , para verificar que tenga los
		// valores correctos de las fichas ( X,O)
		int aux = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tablero[i][j].equalsIgnoreCase(ficha1)
						|| tablero[i][j].equalsIgnoreCase(ficha2)
						|| tablero[i][j].equalsIgnoreCase("")) {

					aux++;
					// auxiliar contara los espacios con x, O y espacio por lo
					// que tendra que dar 9
					if (i == 2 && j == 2 && aux == 9) {
						// si es nueve no mandara ningun error y el juego
						// continuara
						return true;

					} else if (i == 2 && j == 2 && aux != 9) {
						// si es menor a nueve significa que se ingreso un valor
						// incorrecto
						return false;
					}
				} else {

					return false;

				}
			}
		}

		return false;

	}

	// metodo de primera jugada
	public boolean logica1() {

		boolean a = false;
		int aux = 0;

		// contador para asegurarse de que sea la primera jugada
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (tablero[i][j].equalsIgnoreCase(ficha1)) {

					aux++;
				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux++;
				}
			}
		}
		// accion dependiendo de la primera jugada
		if (a == false && aux == 1) {

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {

					if (tablero[1][1].equalsIgnoreCase(ficha1) && aux == 1) {
						// primera jugada si el jugador selecciona la posicion
						// del centro
						tablero[0][0] = ficha2;
						a = true;

					} else if (tablero[i][j].equalsIgnoreCase(ficha1)
							&& aux == 1) {
						// posicion fija si el jugado escoge cualquier posicion
						// que no sea el centro
						tablero[1][1] = ficha2;

						a = true;

					}

				}

			}
		}

		return a;

	}

	// estudio por filas de las matriz para atacar a x
	public boolean filasX() {

		int i = 0;
		int aux = 0;
		int aux1 = 0;
		int aux2 = 0;
		int aux3 = 0;
		int aux4 = 0;
		int aux5 = 0;

		boolean a = false;

		if (a == false) {
			for (int j = 0; j < 3; j++) {
				// estudio de las posiciones de x en la primera fila
				if (tablero[i][j].equalsIgnoreCase(ficha1)) {
					aux++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux3++;
				}

			}

			if (aux == 2 && aux3 == 0) {
				fila0X();
				a = true;

			}
		}

		if (a == false) {
			i = 1;
			for (int j = 0; j < 3; j++) {
				// estudio de las posiciones de x en la segunda fila
				if (tablero[i][j].equalsIgnoreCase(ficha1)) {
					aux1++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux4++;
				}

			}

			if (aux1 == 2 && aux4 == 0) {
				fila1X();
				a = true;

			}
			i = 2;
			for (int j = 0; j < 3; j++) {
				// estudio de las posiciones de x en la tercer fila
				if (tablero[i][j].equalsIgnoreCase(ficha1)) {
					aux2++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux5++;
				}
			}

			if (aux2 == 2 && aux5 == 0) {
				fila2X();
				a = true;

			}

		}

		return a;

	}

	// estudio por columnas de las matriz para atacar a x
	public boolean columnasX() {

		int j = 0;
		int aux = 0;
		int aux1 = 0;
		int aux2 = 0;
		int aux3 = 0;
		int aux4 = 0;
		int aux5 = 0;

		boolean a = false;

		if (a == false) {
			for (int i = 0; i < 3; i++) {
				// estudio de las posiciones de x en la primer columna
				if (tablero[i][j].equalsIgnoreCase(ficha1)) {
					aux++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux3++;
				}

			}

			if (aux == 2 && aux3 == 0) {
				columna0X();
				a = true;
			}
		}

		if (a == false) {
			j = 1;
			for (int i = 0; i < 3; i++) {
				// estudio de las posiciones de x en la segunda columna
				if (tablero[i][j].equalsIgnoreCase(ficha1)) {
					aux1++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux4++;
				}

			}

			if (aux1 == 2 && aux4 == 0) {
				columna1X();
				a = true;
			}
		}

		if (a == false) {
			j = 2;
			for (int i = 0; i < 3; i++) {
				// estudio de las posiciones de x en la tercera columna
				if (tablero[i][j].equalsIgnoreCase(ficha1)) {
					aux2++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux5++;
				}
			}

			if (aux2 == 2 && aux5 == 0) {
				columna2X();
				a = true;
			}
		}

		return a;

	}

	// estudio de las diagonales para atacar a x
	public boolean diagonalesX() {

		boolean a = false;
		// estudio de las posiciones de x en las diagonales
		if (a == false) {
			if (tablero[0][2].equalsIgnoreCase(ficha1)
					&& tablero[1][1].equalsIgnoreCase(ficha1)) {

				tablero[2][0] = ficha2;
				a = true;
			}
		}

		if (a == false) {
			if (tablero[1][1].equalsIgnoreCase(ficha1)
					&& tablero[2][0].equalsIgnoreCase(ficha1)) {

				tablero[0][2] = ficha2;
				a = true;

			}
		}
		if (a == false) {
			if (tablero[0][0].equalsIgnoreCase(ficha1)
					&& tablero[2][2].equalsIgnoreCase(ficha1)) {

				tablero[1][0] = ficha2;
				a = true;

			}
		}
		if (a == false) {
			if (tablero[2][0].equalsIgnoreCase(ficha1)
					&& tablero[0][2].equalsIgnoreCase(ficha1)) {

				tablero[1][0] = ficha2;
				a = true;

			}
		}

		return a;

	}

	// revision de la primera fila para saber que espacio se encuentra vacio
	public void fila0X() {

		if (tablero[0][0].equalsIgnoreCase(ficha1)
				&& tablero[0][2].equalsIgnoreCase(ficha1)) {

			tablero[0][1] = ficha2;

		} else if (tablero[0][0].equalsIgnoreCase(ficha1)
				&& tablero[0][1].equalsIgnoreCase(ficha1)) {

			tablero[0][2] = ficha2;

		} else if (tablero[0][1].equalsIgnoreCase(ficha1)
				&& tablero[0][2].equalsIgnoreCase(ficha1)) {

			tablero[0][0] = ficha2;

		}

	}

	// revision de la segunda fila para saber que espacio se encuentra vacio
	public void fila1X() {

		if (tablero[1][0].equalsIgnoreCase(ficha1)
				&& tablero[1][2].equalsIgnoreCase(ficha1)) {

			tablero[1][1] = ficha2;

		} else if (tablero[1][0].equalsIgnoreCase(ficha1)
				&& tablero[1][1].equalsIgnoreCase(ficha1)) {

			tablero[1][2] = ficha2;

		} else if (tablero[1][1].equalsIgnoreCase(ficha1)
				&& tablero[1][2].equalsIgnoreCase(ficha1)) {

			tablero[1][0] = ficha2;

		}

	}

	// revision de la tercera fila para saber que espacio se encuentra vacio
	public void fila2X() {

		if (tablero[2][0].equalsIgnoreCase(ficha1)
				&& tablero[2][2].equalsIgnoreCase(ficha1)) {

			tablero[2][1] = ficha2;

		} else if (tablero[2][0].equalsIgnoreCase(ficha1)
				&& tablero[2][1].equalsIgnoreCase(ficha1)) {

			tablero[2][2] = ficha2;

		} else if (tablero[2][1].equalsIgnoreCase(ficha1)
				&& tablero[2][2].equalsIgnoreCase(ficha1)) {

			tablero[2][0] = ficha2;

		}

	}

	// revision de la primera columna para saber que espacio se encuentra vacio
	public void columna0X() {

		if (tablero[0][0].equalsIgnoreCase(ficha1)
				&& tablero[2][0].equalsIgnoreCase(ficha1)) {

			tablero[1][0] = ficha2;

		} else if (tablero[0][0].equalsIgnoreCase(ficha1)
				&& tablero[1][0].equalsIgnoreCase(ficha1)) {

			tablero[2][0] = ficha2;

		} else if (tablero[1][0].equalsIgnoreCase(ficha1)
				&& tablero[2][0].equalsIgnoreCase(ficha1)) {

			tablero[0][0] = ficha2;

		}

	}

	// revision de la segunda columna para saber que espacio se encuentra vacio
	public void columna1X() {

		if (tablero[0][1].equalsIgnoreCase(ficha1)
				&& tablero[2][1].equalsIgnoreCase(ficha1)) {

			tablero[1][1] = ficha2;

		} else if (tablero[0][1].equalsIgnoreCase(ficha1)
				&& tablero[1][1].equalsIgnoreCase(ficha1)) {

			tablero[2][1] = ficha2;

		} else if (tablero[1][1].equalsIgnoreCase(ficha1)
				&& tablero[2][1].equalsIgnoreCase(ficha1)) {

			tablero[0][1] = ficha2;

		}

	}

	// revision de la tercera columna para saber que espacio se encuentra vacio
	public void columna2X() {

		if (tablero[0][2].equalsIgnoreCase(ficha1)
				&& tablero[2][2].equalsIgnoreCase(ficha1)) {

			tablero[1][2] = ficha2;

		} else if (tablero[0][2].equalsIgnoreCase(ficha1)
				&& tablero[1][2].equalsIgnoreCase(ficha1)) {

			tablero[2][2] = ficha2;

		} else if (tablero[1][2].equalsIgnoreCase(ficha1)
				&& tablero[2][2].equalsIgnoreCase(ficha1)) {

			tablero[0][2] = ficha2;

		}

	}

	// estudio de matriz para saber si fue empate
	public boolean letreroEmpate() {

		int aux = 0;
		int valor = 9;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (tablero[i][j].equalsIgnoreCase("")) {

					return false;

				} else {
					aux++;
					if (aux == valor) {
						return true;
					}
				}
			}
		}
		return false;
	}

	// estudio de matriz para saber si la persona logro una fila de X
	public boolean ganaHumano() {

		// estudia por filas, columas o diagonales si se encuentran tres x
		// seguidas
		int i = 0;
		int aux = 0;
		boolean a = false;
		if (a == false) {
			while (i < 3) {

				for (int j = 0; j < 3; j++) {
					if (tablero[i][j].equalsIgnoreCase(ficha1)) {
						aux++;
					}
				}
				if (aux == 3) {
					a = true;
					i = 3;
				} else {
					i++;
					aux = 0;
				}

			}
		}
		int j = 0;
		int aux1 = 0;

		if (a == false) {
			while (j < 3) {

				for (int x = 0; x < 3; x++) {
					if (tablero[x][j].equalsIgnoreCase(ficha1)) {
						aux1++;
					}
				}
				if (aux1 == 3) {
					a = true;
					j = 3;

				} else {

					j++;
					aux1 = 0;
				}

			}

		}
		if (a == false) {
			if (tablero[0][0].equalsIgnoreCase(ficha1)
					&& tablero[1][1].equalsIgnoreCase(ficha1)
					&& tablero[2][2].equalsIgnoreCase(ficha1)) {
				a = true;
			}

		}
		if (a == false) {
			if (tablero[2][0].equalsIgnoreCase(ficha1)
					&& tablero[1][1].equalsIgnoreCase(ficha1)
					&& tablero[0][2].equalsIgnoreCase(ficha1)) {
				a = true;
			}

		}

		return a;

	}

	// estudio para saber si el computador completo tres o seguidas
	public boolean ganaPC() {

		int i = 0;
		int aux = 0;
		boolean a = false;

		// se estudia por filas si hay 3 O seguidas
		if (a == false) {
			while (i < 3) {

				for (int j = 0; j < 3; j++) {
					if (tablero[i][j].equalsIgnoreCase(ficha2)) {
						aux++;
					}
				}
				if (aux == 3) {
					a = true;
					i = 3;
				} else {
					i++;
					aux = 0;
				}

			}
		}
		int j = 0;
		int aux1 = 0;

		// se estudia por columnas si hay 3 O seguidas
		if (a == false) {
			while (j < 3) {

				for (int x = 0; x < 3; x++) {
					if (tablero[x][j].equalsIgnoreCase(ficha2)) {
						aux1++;
					}
				}
				if (aux1 == 3) {
					a = true;
					j = 3;

				} else {

					j++;
					aux1 = 0;
				}

			}

		}
		// se estudia por diagonales si hay O x seguidas
		if (a == false) {
			if (tablero[0][0].equalsIgnoreCase(ficha2)
					&& tablero[1][1].equalsIgnoreCase(ficha2)
					&& tablero[2][2].equalsIgnoreCase(ficha2)) {
				a = true;
			}

		}
		if (a == false) {
			if (tablero[2][0].equalsIgnoreCase(ficha2)
					&& tablero[1][1].equalsIgnoreCase(ficha2)
					&& tablero[0][2].equalsIgnoreCase(ficha2)) {
				a = true;
			}

		}

		return a;

	}

	// analizis por filas cuando O tiene la oportundidad de ganar
	public boolean filasO() {

		int i = 0;
		int aux = 0;
		int aux1 = 0;
		int aux2 = 0;
		int aux3 = 0;
		int aux4 = 0;
		int aux5 = 0;
		boolean a = false;

		// se analiza cada fila para saber si tiene dos O seguidas y un espacio
		// en blanco
		if (a == false) {
			for (int j = 0; j < 3; j++) {

				if (tablero[i][j].equalsIgnoreCase(ficha1)) {
					aux++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux3++;
				}

			}

			if (aux3 == 2 && aux == 0) {
				fila0O();
				a = true;
			}
		}

		if (a == false) {
			i = 1;
			for (int j = 0; j < 3; j++) {

				if (tablero[i][j].equalsIgnoreCase(ficha1)) {
					aux1++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux4++;
				}

			}

			if (aux4 == 2 && aux1 == 0) {
				fila1O();
				a = true;

			}
			i = 2;
			for (int j = 0; j < 3; j++) {

				if (tablero[i][j].equalsIgnoreCase(ficha1)) {
					aux2++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux5++;
				}
			}

			if (aux5 == 2 && aux2 == 0) {
				fila2O();
				a = true;

			}

		}

		return a;

	}

	// analizis de la primera fila para saber que espacio se encuentra vacio
	public void fila0O() {

		if (tablero[0][0].equalsIgnoreCase(ficha2)
				&& tablero[0][2].equalsIgnoreCase(ficha2)) {

			tablero[0][1] = ficha2;

		} else if (tablero[0][0].equalsIgnoreCase(ficha2)
				&& tablero[0][1].equalsIgnoreCase(ficha2)) {

			tablero[0][2] = ficha2;

		} else if (tablero[0][1].equalsIgnoreCase(ficha2)
				&& tablero[0][2].equalsIgnoreCase(ficha2)) {

			tablero[0][0] = ficha2;

		}

	}

	// analizis de la segunda fila para saber que espacio se encuentra vacio
	public void fila1O() {
		// revision de la segunda fila
		if (tablero[1][0].equalsIgnoreCase(ficha2)
				&& tablero[1][2].equalsIgnoreCase(ficha2)) {

			tablero[1][1] = ficha2;

		} else if (tablero[1][0].equalsIgnoreCase(ficha2)
				&& tablero[1][1].equalsIgnoreCase(ficha2)) {

			tablero[1][2] = ficha2;

		} else if (tablero[1][1].equalsIgnoreCase(ficha2)
				&& tablero[1][2].equalsIgnoreCase(ficha2)) {

			tablero[1][0] = ficha2;

		}

	}

	// analizis de la tercera fila para saber que espacio se encuentra vacio
	public void fila2O() {
		// revision de la tercera fila
		if (tablero[2][0].equalsIgnoreCase(ficha2)
				&& tablero[2][2].equalsIgnoreCase(ficha2)) {

			tablero[2][1] = ficha2;

		} else if (tablero[2][0].equalsIgnoreCase(ficha2)
				&& tablero[2][1].equalsIgnoreCase(ficha2)) {

			tablero[2][2] = ficha2;

		} else if (tablero[2][1].equalsIgnoreCase(ficha2)
				&& tablero[2][2].equalsIgnoreCase(ficha2)) {

			tablero[2][0] = ficha2;

		}

	}

	// analizis por columnas cuando O tiene la oportundidad de ganar
	public boolean columnasO() {

		int j = 0;
		int aux = 0;
		int aux1 = 0;
		int aux2 = 0;
		int aux3 = 0;
		int aux4 = 0;
		int aux5 = 0;
		boolean a = false;
		// se analiza cada columna para saber si tiene dos O y un espacio en
		// blanco
		if (a == false) {
			for (int i = 0; i < 3; i++) {
				// estudio de las posiciones en la primer columna
				if (tablero[i][j].equalsIgnoreCase(ficha1)) {
					aux++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux3++;
				}

			}

			if (aux3 == 2 && aux == 0) {
				columna0O();
				a = true;
			}
		}

		if (a == false) {
			j = 1;
			for (int i = 0; i < 3; i++) {
				// estudio de las posiciones en la segunda columna
				if (tablero[i][j].equalsIgnoreCase(ficha1)) {
					aux1++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux4++;
				}

			}

			if (aux4 == 2 && aux1 == 0) {
				columna1O();
				a = true;
			}
		}

		if (a == false) {
			j = 2;
			for (int i = 0; i < 3; i++) {
				// estudio de las posiciones en la tercera columna
				if (tablero[i][j].equalsIgnoreCase(ficha1)) {
					aux2++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux5++;
				}
			}

			if (aux5 == 2 && aux2 == 0) {
				columna2O();
				a = true;
			}
		}

		return a;

	}

	// revision de la primera columna para encontrar el espacio vacio
	public void columna0O() {

		if (tablero[0][0].equalsIgnoreCase(ficha2)
				&& tablero[2][0].equalsIgnoreCase(ficha2)) {

			tablero[1][0] = ficha2;

		} else if (tablero[0][0].equalsIgnoreCase(ficha2)
				&& tablero[1][0].equalsIgnoreCase(ficha2)) {

			tablero[2][0] = ficha2;

		} else if (tablero[1][0].equalsIgnoreCase(ficha2)
				&& tablero[2][0].equalsIgnoreCase(ficha2)) {

			tablero[0][0] = ficha2;

		}

	}

	// revision de la segunda columna para encontrar el espacio vacio
	public void columna1O() {

		if (tablero[0][1].equalsIgnoreCase(ficha2)
				&& tablero[2][1].equalsIgnoreCase(ficha2)) {

			tablero[1][1] = ficha2;

		} else if (tablero[0][1].equalsIgnoreCase(ficha2)
				&& tablero[1][1].equalsIgnoreCase(ficha2)) {

			tablero[2][1] = ficha2;

		} else if (tablero[1][1].equalsIgnoreCase(ficha2)
				&& tablero[2][1].equalsIgnoreCase(ficha2)) {

			tablero[0][1] = ficha2;

		}

	}

	// revision de la tercera columna para encontrar el espacio vacio
	public void columna2O() {

		if (tablero[0][2].equalsIgnoreCase(ficha2)
				&& tablero[2][2].equalsIgnoreCase(ficha2)) {

			tablero[1][2] = ficha2;

		} else if (tablero[0][2].equalsIgnoreCase(ficha2)
				&& tablero[1][2].equalsIgnoreCase(ficha2)) {

			tablero[2][2] = ficha2;

		} else if (tablero[1][2].equalsIgnoreCase(ficha2)
				&& tablero[2][2].equalsIgnoreCase(ficha2)) {

			tablero[0][2] = ficha2;

		}

	}

	// analizis de las diagonales para saber si se encuentran dos 0 seguidos y
	// un espacio en blanco
	public boolean diagonalesO() {
		boolean a = false;
		if (a == false) {
			if (tablero[0][0].equalsIgnoreCase(ficha2)
					&& tablero[1][1].equalsIgnoreCase(ficha2)
					&& tablero[2][2].equalsIgnoreCase("")) {

				tablero[2][2] = ficha2;
				a = true;
			}
		}
		if (a == false) {
			if (tablero[0][0].equalsIgnoreCase(ficha2)
					&& tablero[2][2].equalsIgnoreCase(ficha2)
					&& tablero[1][1].equalsIgnoreCase("")) {

				tablero[1][1] = ficha2;
				a = true;
			}
		}
		if (a == false) {
			if (tablero[1][1].equalsIgnoreCase(ficha2)
					&& tablero[2][2].equalsIgnoreCase(ficha2)
					&& tablero[0][0].equalsIgnoreCase("")) {

				tablero[0][0] = ficha2;
				a = true;
			}
		}
		if (a == false) {
			if (tablero[0][2].equalsIgnoreCase(ficha2)
					&& tablero[1][1].equalsIgnoreCase(ficha2)
					&& tablero[2][0].equalsIgnoreCase("")) {

				tablero[2][0] = ficha2;
				a = true;
			}
		}
		if (a == false) {
			if (tablero[0][2].equalsIgnoreCase(ficha2)
					&& tablero[2][0].equalsIgnoreCase(ficha2)
					&& tablero[1][1].equalsIgnoreCase("")) {

				tablero[1][1] = ficha2;
				a = true;
			}
		}
		if (a == false) {
			if (tablero[1][1].equalsIgnoreCase(ficha2)
					&& tablero[2][0].equalsIgnoreCase(ficha2)
					&& tablero[0][2].equalsIgnoreCase("")) {

				tablero[0][2] = ficha2;
				a = true;
			}
		}

		return a;

	}

	// estudio de casos en los que el PC no puede atacar ni intentar por los
	// metodos anteriores
	public boolean casosEspeciales() {

		boolean a = false;
		int aux = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tablero[i][j].equalsIgnoreCase(ficha1)) {
					aux++;
				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux++;
				}
			}
		}
		if (a == false && aux == 3) {
			if (tablero[1][0].equalsIgnoreCase(ficha1)
					&& tablero[1][2].equalsIgnoreCase(ficha1)) {

				tablero[0][1] = ficha2;
				a = true;
			}
		}
		if (a == false && aux == 3) {
			if (tablero[0][1].equalsIgnoreCase(ficha1)
					&& tablero[2][1].equalsIgnoreCase(ficha1)) {

				tablero[1][0] = ficha2;
				a = true;
			}
		}

		if (a == false && aux == 3) {
			if (tablero[0][0].equalsIgnoreCase(ficha1)
					&& tablero[2][1].equalsIgnoreCase(ficha1)) {

				tablero[1][0] = ficha2;
				a = true;
			}
		}
		if (a == false && aux == 3) {
			if (tablero[0][2].equalsIgnoreCase(ficha1)
					&& tablero[2][1].equalsIgnoreCase(ficha1)) {

				tablero[1][2] = ficha2;
				a = true;
			}
		}

		if (a == false && aux == 3) {
			if (tablero[0][0].equalsIgnoreCase(ficha1)
					&& tablero[1][2].equalsIgnoreCase(ficha1)) {

				tablero[0][1] = ficha2;
				a = true;
			}
		}
		if (a == false && aux == 3) {
			if (tablero[2][0].equalsIgnoreCase(ficha1)
					&& tablero[1][2].equalsIgnoreCase(ficha1)) {

				tablero[2][01] = ficha2;
				a = true;
			}
		}

		if (a == false && aux == 3) {
			if (tablero[2][0].equalsIgnoreCase(ficha1)
					&& tablero[0][1].equalsIgnoreCase(ficha1)) {

				tablero[1][0] = ficha2;
				a = true;
			}
		}
		if (a == false && aux == 3) {
			if (tablero[2][2].equalsIgnoreCase(ficha1)
					&& tablero[0][1].equalsIgnoreCase(ficha1)) {

				tablero[1][2] = ficha2;
				a = true;
			}
		}

		if (a == false && aux == 3) {
			if (tablero[0][2].equalsIgnoreCase(ficha1)
					&& tablero[1][0].equalsIgnoreCase(ficha1)) {

				tablero[0][1] = ficha2;
				a = true;
			}
		}
		if (a == false && aux == 3) {
			if (tablero[1][0].equalsIgnoreCase(ficha1)
					&& tablero[2][2].equalsIgnoreCase(ficha1)) {

				tablero[2][1] = ficha2;
				a = true;
			}
		}

		return a;

	}

	// estudio por filas para encontrar los espacios vacios y procurar poner O
	// intentando ganar
	public boolean circuloFilas() {

		int i = 0;
		int aux = 0;
		int aux1 = 0;
		int aux2 = 0;
		int aux3 = 0;
		int aux4 = 0;
		int aux5 = 0;

		boolean a = false;

		if (a == false) {
			for (int j = 0; j < 3; j++) {
				// estudio de las posiciones en la primera fila
				if (tablero[i][j].equalsIgnoreCase("")) {
					aux++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux3++;
				}

			}

			if (aux3 == 1 && aux == 2) {
				circuloFila0();
				a = true;
			}
		}

		if (a == false) {
			i = 1;
			for (int j = 0; j < 3; j++) {
				// estudio de las posiciones en la segunda fila
				if (tablero[i][j].equalsIgnoreCase("")) {
					aux1++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux4++;
				}

			}

			if (aux4 == 1 && aux1 == 2) {
				circuloFila1();
				a = true;

			}
			i = 2;
			for (int j = 0; j < 3; j++) {
				// estudio de las posiciones en la tercer fila
				if (tablero[i][j].equalsIgnoreCase("")) {
					aux2++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux5++;
				}
			}

			if (aux5 == 1 && aux2 == 2) {
				circuloFila2();
				a = true;

			}

		}

		return a;

	}

	public void circuloFila0() {

		if (tablero[0][0].equalsIgnoreCase("")
				&& tablero[0][2].equalsIgnoreCase("")) {
			if (random() == 0) {
				tablero[0][0] = ficha2;
			} else {
				tablero[0][2] = ficha2;
			}
		} else if (tablero[0][0].equalsIgnoreCase("")
				&& tablero[0][1].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[0][0] = ficha2;
			} else {
				tablero[0][1] = ficha2;
			}

		} else if (tablero[0][1].equalsIgnoreCase("")
				&& tablero[0][2].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[0][1] = ficha2;
			} else {
				tablero[0][2] = ficha2;
			}

		}

	}

	public void circuloFila1() {

		if (tablero[1][0].equalsIgnoreCase("")
				&& tablero[1][2].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[1][0] = ficha2;
			} else {
				tablero[1][2] = ficha2;
			}

		} else if (tablero[1][0].equalsIgnoreCase("")
				&& tablero[1][1].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[1][0] = ficha2;
			} else {
				tablero[1][1] = ficha2;
			}

		} else if (tablero[1][1].equalsIgnoreCase("")
				&& tablero[1][2].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[1][1] = ficha2;
			} else {
				tablero[1][2] = ficha2;
			}

		}

	}

	public void circuloFila2() {

		if (tablero[2][0].equalsIgnoreCase("")
				&& tablero[2][2].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[2][0] = ficha2;
			} else {
				tablero[2][2] = ficha2;
			}

		} else if (tablero[2][0].equalsIgnoreCase("")
				&& tablero[2][1].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[2][0] = ficha2;
			} else {
				tablero[2][1] = ficha2;
			}

		} else if (tablero[2][1].equalsIgnoreCase("")
				&& tablero[2][2].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[2][1] = ficha2;
			} else {
				tablero[2][2] = ficha2;
			}

		}
	}

	// estudio por columnas para encontrar los espacios vacios y procurar poner
	// O intentando ganar
	public boolean circuloColumnas() {

		int j = 0;
		int aux = 0;
		int aux1 = 0;
		int aux2 = 0;
		int aux3 = 0;
		int aux4 = 0;
		int aux5 = 0;

		boolean a = false;

		if (a == false) {
			for (int i = 0; i < 3; i++) {
				// estudio de las posiciones en la primer columna
				if (tablero[i][j].equalsIgnoreCase("")) {
					aux++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux3++;
				}

			}

			if (aux == 2 && aux3 == 1) {
				circuloColumna0();
				a = true;
			}
		}

		if (a == false) {
			j = 1;
			for (int i = 0; i < 3; i++) {
				// estudio de las posiciones en la segunda columna
				if (tablero[i][j].equalsIgnoreCase("")) {
					aux1++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux4++;
				}

			}

			if (aux1 == 2 && aux4 == 1) {
				circuloColumna1();
				a = true;
			}
		}

		if (a == false) {
			j = 2;
			for (int i = 0; i < 3; i++) {
				// estudio de las posiciones en la tercera columna
				if (tablero[i][j].equalsIgnoreCase("")) {
					aux2++;

				}
				if (tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux5++;
				}
			}

			if (aux2 == 2 && aux5 == 1) {
				circuloColumna2();
				a = true;
			}
		}

		return a;
	}

	public void circuloColumna0() {

		if (tablero[0][0].equalsIgnoreCase("")
				&& tablero[2][0].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[0][0] = ficha2;
			} else {
				tablero[2][0] = ficha2;
			}

		} else if (tablero[0][0].equalsIgnoreCase("")
				&& tablero[1][0].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[0][0] = ficha2;
			} else {
				tablero[1][0] = ficha2;
			}

		} else if (tablero[1][0].equalsIgnoreCase("")
				&& tablero[2][0].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[1][0] = ficha2;
			} else {
				tablero[2][0] = ficha2;
			}

		}

	}

	public void circuloColumna1() {

		if (tablero[0][1].equalsIgnoreCase("")
				&& tablero[2][1].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[0][1] = ficha2;
			} else {
				tablero[2][1] = ficha2;
			}

		} else if (tablero[0][1].equalsIgnoreCase("")
				&& tablero[1][1].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[0][1] = ficha2;
			} else {
				tablero[1][1] = ficha2;
			}

		} else if (tablero[1][1].equalsIgnoreCase("")
				&& tablero[2][1].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[1][1] = ficha2;
			} else {
				tablero[2][1] = ficha2;
			}

		}

	}

	public void circuloColumna2() {

		if (tablero[0][2].equalsIgnoreCase("")
				&& tablero[2][2].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[0][2] = ficha2;
			} else {
				tablero[2][2] = ficha2;
			}

		} else if (tablero[0][2].equalsIgnoreCase("")
				&& tablero[1][2].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[0][2] = ficha2;
			} else {
				tablero[1][2] = ficha2;
			}

		} else if (tablero[1][2].equalsIgnoreCase("")
				&& tablero[2][2].equalsIgnoreCase("")) {

			if (random() == 0) {
				tablero[1][2] = ficha2;
			} else {
				tablero[2][2] = ficha2;
			}

		}

	}

	// estudio por diagonales para encontrar los espacios vacios y procurar
	// poner O intentando ganar
	public boolean circuloDiagonales() {

		boolean a = false;
		if (a == false) {
			if (tablero[0][0].equalsIgnoreCase("")
					&& tablero[1][1].equalsIgnoreCase("")) {

				if (random() == 0) {
					tablero[0][0] = ficha2;
				} else {
					tablero[1][1] = ficha2;
				}
				a = true;
			}
		}
		if (a == false) {
			if (tablero[0][0].equalsIgnoreCase("")
					&& tablero[2][2].equalsIgnoreCase("")) {

				if (random() == 0) {
					tablero[0][0] = ficha2;
				} else {
					tablero[2][2] = ficha2;
				}
				a = true;
			}
		}
		if (a == false) {
			if (tablero[1][1].equalsIgnoreCase("")
					&& tablero[2][2].equalsIgnoreCase("")) {

				if (random() == 0) {
					tablero[1][1] = ficha2;
				} else {
					tablero[2][2] = ficha2;
				}
				a = true;
			}
		}
		if (a == false) {
			if (tablero[0][2].equalsIgnoreCase("")
					&& tablero[1][1].equalsIgnoreCase("")) {

				if (random() == 0) {
					tablero[0][2] = ficha2;
				} else {
					tablero[1][1] = ficha2;
				}
				a = true;
			}
		}
		if (a == false) {
			if (tablero[0][2].equalsIgnoreCase("")
					&& tablero[2][0].equalsIgnoreCase("")) {

				if (random() == 0) {
					tablero[0][2] = ficha2;
				} else {
					tablero[2][0] = ficha2;
				}
				a = true;
			}
		}
		if (a == false) {
			if (tablero[2][0].equalsIgnoreCase("")
					&& tablero[1][1].equalsIgnoreCase("")) {

				if (random() == 0) {
					tablero[2][0] = ficha2;
				} else {
					tablero[1][1] = ficha2;
				}
				a = true;
			}
		}

		return a;

	}

	// metodo para colocar O en el momento en que solo hayan posiciones
	// especificas sin posibilidad de atacar ni de intentar ganar
	public boolean colocarCirculo() {

		boolean a = false;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a == false) {
					if (tablero[i][j].equalsIgnoreCase("")) {
						tablero[i][j] = ficha2;
						a = true;
					}

				}
			}
		}

		return a;

	}

	public int random() {

		Random r = new Random();
		int r1 = r.nextInt(2);

		return r1;

	}

	public String[][] getTablero() {
		return tablero;
	}

	public void setTablero(String[][] tablero) {
		this.tablero = tablero;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public String getFicha1() {
		return ficha1;
	}

	public void setFicha1(String ficha1) {
		this.ficha1 = ficha1;
	}

	public String getFicha2() {
		return ficha2;
	}

	public void setFicha2(String ficha2) {
		this.ficha2 = ficha2;
	}

}



