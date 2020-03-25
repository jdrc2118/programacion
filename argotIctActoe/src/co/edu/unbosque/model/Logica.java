package co.edu.unbosque.model;

import java.util.Random;

public class Logica {
	
	
	private String tablero[][];
	private int filas;
	private int columnas;
	
	private String ficha1;
	private String ficha2;
	
	
	
	
	
	public Logica() {
		
		filas=3;
		columnas=3;
		tablero = new String[filas][columnas];
		
		ficha1="X";
		ficha2="O";
	   
		}
		
		
		
	
	
	public String jugar() {
		
		
		mayusculas();
		
		if(logica1()) {
		
		}else if(circuloFilasGanar()) {
			
		}else if(circuloColumnasGanar()) {	
			
		}else if(circuloEsquinasGanar()) {
			
		}else if(filas() ) {
			
		}else if(columnas()  ) {
			
				
		}else if(esquinas() ){
			
				
		
		}else if(casosEspecialeciales()) {
			
		
			
		
		}else if(circuloFilas()){
			
			
		}else if(circuloColumnas()) {
			
		}else if(circuloEsquinas()) {
			
		}else if(colocarCirculo()) {
			
		}
	
		
		return ficha2;
		}
	
	public void mayusculas() {
		
	
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				if(tablero[i][j].equals("x")) {
					tablero[i][j]="X";
				
					
					

					
					
					
					
				}
				
			}
		}
		
		
		
	}

	public boolean verificarLetras() {
		
		// revision de la matriz por posiciones , para verificar que tenga los valores correctos
		int aux = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if (tablero[i][j].equalsIgnoreCase(ficha1)|| tablero[i][j].equalsIgnoreCase(ficha2)|| tablero[i][j].equalsIgnoreCase("")) {
					
					aux++;
					
					if(i==2 && j==2 && aux==9) {
						
						return true;
						
					}else if (i==2 && j==2 && aux!=9){
						
						return false;
					}
				}else {
					
					return false; 
					
				}
			}
		}
		
		return false;
			
		}
	
	public boolean logica1() {
		
		boolean a=false;
		int aux = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
					aux++;
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux++;
				}
			}
		}
			
			if(a==false && aux==1) {	
				
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {		
			
		
			if(tablero[1][1].equalsIgnoreCase(ficha1) && aux==1){
				// primera jugada si el jugador selecciona la posicion del centro 
				tablero[0][0]=ficha2;
				a=true;
				
			}else if(tablero[i][j].equalsIgnoreCase(ficha1) && aux==1) {
				//posicion fija si el jugado escoge cualquier posicion que no sea el centro  
					tablero[1][1]=ficha2;
				
					
				a=true;
					
			
			}
//			else if(tablero[i][j].equalsIgnoreCase(ficha2) && aux==1) {
//				
//				a=false;
//				
//				}
			}
			
				}
			}
			
		return a;
		
		
		
	
		
	}
	
	public boolean filas() {
		
		int i=0;
		int aux=0;
		int aux1=0;
		int aux2=0;
		int aux3=0;
		int aux4=0;
		int aux5=0;
	
		boolean a =false;
		
		if(a==false) {
		for(int j=0;j<3;j++) {
		//estudio de las posiciones en la primera fila
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux++;
			
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
				aux3++;
			}
			
			
		}
		
		if(aux==2 && aux3==0) {
			fila0();
			a=true;
			
			
		}
		}
		
		if(a==false) {
		i=1;
		for(int j=0;j<3;j++) {
			//estudio de las posiciones en la segunda fila
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux1++;
			
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
				aux4++;
			}
			
			
		}
		
		if(aux1==2 && aux4==0) {
			fila1();
			a=true;
			
			
		}
		i=2;
		for(int j=0;j<3;j++){
			//estudio de las posiciones en la tercer fila
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux2++;
			
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
				aux5++;
			}
		}
		
		if(aux2==2 && aux5==0) {
			fila2();
			a=true;
			
			
		}
			
		
		}
		
		return a;
		
	
		
	}
	
public boolean columnas() {
		
		int j=0;
		int aux=0;
		int aux1=0;
		int aux2=0;
		int aux3=0;
		int aux4=0;
		int aux5=0;
	
		boolean a = false;
		
		if(a==false) {
		for(int i=0;i<3;i++) {
			//estudio de las posiciones en la primer columna
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux++;
			
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
				aux3++;
			}
			
			
		}
		
		if(aux==2 && aux3==0) {
			columna0();
			a=true;
		}
		}
		
		if(a==false) {
		j=1;
		for(int i=0;i<3;i++) {
			//estudio de las posiciones en la segunda columna
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux1++;
			
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
				aux4++;
			}
			
			
		}
		
		if(aux1==2 && aux4==0) {
			columna1();
			a=true;
		}
		}
		
		if(a==false) {
		j=2;
		for(int i=0;i<3;i++){
			//estudio de las posiciones en la tercera columna
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux2++;
			
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
				aux5++;
			}
		}
		
		if(aux2==2 && aux5==0) {
			columna2();
			a=true;
		}
		}
		
		return a;
		
		
		
		
	
		
	}
	public boolean esquinas() {
		// revision de diagonales
		boolean a=false;
		
		if(a==false) {
			if(tablero[0][2].equalsIgnoreCase(ficha1) && tablero[1][1].equalsIgnoreCase(ficha1)) {
				
				tablero[2][0]=ficha2;
				a=true;
			}
		}
			
		if(a==false) {
		 if(tablero[1][1].equalsIgnoreCase(ficha1) && tablero[2][0].equalsIgnoreCase(ficha1)) {
			
			tablero[0][2]=ficha2;
			a=true;
			
		 	}
		}
		if(a==false) {
			 if(tablero[0][0].equalsIgnoreCase(ficha1) && tablero[2][2].equalsIgnoreCase(ficha1)) {
				
				tablero[1][0]=ficha2;
				a=true;
				
			 	}
			}
		if(a==false) {
			 if(tablero[2][0].equalsIgnoreCase(ficha1) && tablero[0][2].equalsIgnoreCase(ficha1)) {
				
				tablero[1][0]=ficha2;
				a=true;
				
			 	}
			}
	
		
		
		
		return a;
		
	}
	
	
	
	public void fila0() {
		// revision de la primera fila
		if(tablero[0][0].equalsIgnoreCase(ficha1) && tablero[0][2].equalsIgnoreCase(ficha1)) {
			
			tablero[0][1]=ficha2;
			
		}else if(tablero[0][0].equalsIgnoreCase(ficha1) && tablero[0][1].equalsIgnoreCase(ficha1)) {
			
			tablero[0][2]=ficha2;
			
		}else if(tablero[0][1].equalsIgnoreCase(ficha1) && tablero[0][2].equalsIgnoreCase(ficha1)) {
			
			tablero[0][0]=ficha2;
			
		}
		
		
		
	}
	public void fila1() {
		// revision de la segunda fila
		if(tablero[1][0].equalsIgnoreCase(ficha1) && tablero[1][2].equalsIgnoreCase(ficha1)) {
			
			tablero[1][1]=ficha2;
			
		}else if(tablero[1][0].equalsIgnoreCase(ficha1) && tablero[1][1].equalsIgnoreCase(ficha1)) {
			
			tablero[1][2]=ficha2;
			
		}else if(tablero[1][1].equalsIgnoreCase(ficha1) && tablero[1][2].equalsIgnoreCase(ficha1)) {
			
			tablero[1][0]=ficha2;
			
		}
		
		
		
	}
	
public void fila2() {
	// revision de la tercera fila
		if(tablero[2][0].equalsIgnoreCase(ficha1) && tablero[2][2].equalsIgnoreCase(ficha1)) {
			
			tablero[2][1]=ficha2;
			
		}else if(tablero[2][0].equalsIgnoreCase(ficha1) && tablero[2][1].equalsIgnoreCase(ficha1)) {
			
			tablero[2][2]=ficha2;
			
		}else if(tablero[2][1].equalsIgnoreCase(ficha1) && tablero[2][2].equalsIgnoreCase(ficha1)) {
			
			tablero[2][0]=ficha2;
			
		}
		
		
		
	}
		


public void columna0() {
	// revision de la primera columna
	if(tablero[0][0].equalsIgnoreCase(ficha1) && tablero[2][0].equalsIgnoreCase(ficha1)) {
		
		tablero[1][0]=ficha2;
		
	}else if(tablero[0][0].equalsIgnoreCase(ficha1) && tablero[1][0].equalsIgnoreCase(ficha1)) {
		
		tablero[2][0]=ficha2;
		
	}else if(tablero[1][0].equalsIgnoreCase(ficha1) && tablero[2][0].equalsIgnoreCase(ficha1)) {
		
		tablero[0][0]=ficha2;
		
	}
	
	
	
}

public void columna1() {
	// revision de la segunda columna
	
	if(tablero[0][1].equalsIgnoreCase(ficha1) && tablero[2][1].equalsIgnoreCase(ficha1)) {
		
		tablero[1][1]=ficha2;
		
	}else if(tablero[0][1].equalsIgnoreCase(ficha1) && tablero[1][1].equalsIgnoreCase(ficha1)) {
		
		tablero[2][1]=ficha2;
		
	}else if(tablero[1][1].equalsIgnoreCase(ficha1) && tablero[2][1].equalsIgnoreCase(ficha1)) {
		
		tablero[0][1]=ficha2;
		
	}
	
	
	
}

public void columna2() { 
	
	// revision de la tercera columna
	
	if(tablero[0][2].equalsIgnoreCase(ficha1) && tablero[2][2].equalsIgnoreCase(ficha1)) {
		
		tablero[1][2]=ficha2;
		
	}else if(tablero[0][2].equalsIgnoreCase(ficha1) && tablero[1][2].equalsIgnoreCase(ficha1)) {
		
		tablero[2][2]=ficha2;
		
	}else if(tablero[1][2].equalsIgnoreCase(ficha1) && tablero[2][2].equalsIgnoreCase(ficha1)) {
		
		tablero[0][2]=ficha2;
		
	}
	
	
	
}
	public boolean letreroEmpate() {
		
		//buscar si termina en empate el juego
		
		int aux= 0;
		int valor = 9;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {	
			
			
	
				if(tablero[i][j].equalsIgnoreCase("")) {
					return false;
		
				}else {
					aux++;
					if(aux==valor) {
						return true;
					}
				}
			}
	}
	return false;
}
	
	

		

	
	
	public boolean ganaJugador() {
	
		int i = 0;
		int aux =0;
		boolean a = false;
		if(a==false) {
		while(i<3) {
			
			for(int j = 0;j<3;j++) {
				if(tablero[i][j].equalsIgnoreCase(ficha1)) {
					aux++;
				}
			}
			if(aux==3) {
				a=true;
				i=3;
			}else {
				i++;
				aux=0;
			}
		
		}
		}
		int j=0;
		int aux1 = 0;
		
		if(a==false) {
			while(j<3) {
				
				for(int x = 0;x<3;x++) {
					if(tablero[x][j].equalsIgnoreCase(ficha1)) {
						aux1++;
					}
				}
				if(aux1==3) {
					a=true;
					j=3;
					
				}else {
					
					j++;
					aux1=0;
				}
			
			}
			
		}
		if(a==false) {
			if(tablero[0][0].equalsIgnoreCase(ficha1) && tablero[1][1].equalsIgnoreCase(ficha1) && tablero[2][2].equalsIgnoreCase(ficha1)) {
				a=true;
			}
			
		}
		if(a==false) {
			if(tablero[2][0].equalsIgnoreCase(ficha1) && tablero[1][1].equalsIgnoreCase(ficha1) && tablero[0][2].equalsIgnoreCase(ficha1)) {
				a=true;
			}
			
		}
		
	
		return a;
		
		
	}

	public boolean ganaPc() {
		
		int i = 0;
		int aux =0;
		boolean a = false;
		if(a==false) {
		while(i<3) {
			
			for(int j = 0;j<3;j++) {
				if(tablero[i][j].equalsIgnoreCase(ficha2)) {
					aux++;
				}
			}
			if(aux==3) {
				a=true;
				i=3;
			}else {
				i++;
				aux=0;
			}
		
		}
		}
		int j=0;
		int aux1 = 0;
		
		if(a==false) {
			while(j<3) {
				
				for(int x = 0;x<3;x++) {
					if(tablero[x][j].equalsIgnoreCase(ficha2)) {
						aux1++;
					}
				}
				if(aux1==3) {
					a=true;
					j=3;
					
				}else {
					
					j++;
					aux1=0;
				}
			
			}
			
		}
		if(a==false) {
			if(tablero[0][0].equalsIgnoreCase(ficha2) && tablero[1][1].equalsIgnoreCase(ficha2) && tablero[2][2].equalsIgnoreCase(ficha2)) {
				a=true;
			}
			
		}
		if(a==false) {
			if(tablero[2][0].equalsIgnoreCase(ficha2) && tablero[1][1].equalsIgnoreCase(ficha2) && tablero[0][2].equalsIgnoreCase(ficha2)) {
				a=true;
			}
			
		}
		
		
	
		return a;
		
		
	}
	public boolean circuloFilasGanar() {
		
		int i=0;
		int aux=0;
		int aux1=0;
		int aux2=0;
		int aux3=0;
		int aux4=0;
		int aux5=0;
	
		boolean a =false;
		
		if(a==false) {
		for(int j=0;j<3;j++) {
		//estudio de las posiciones en la primera fila
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux++;
			
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
				aux3++;
			}
			
			
		}
		
		if(aux3==2 && aux==0) {
			circuloFila0Ganar();
			a=true;
		}
		}
		
		if(a==false) {
		i=1;
		for(int j=0;j<3;j++) {
			//estudio de las posiciones en la segunda fila
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux1++;
			
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
				aux4++;
			}
			
			
		}
		
		if(aux4==2 && aux1==0) {
			circuloFila1Ganar();
			a=true;
		
		}
		i=2;
		for(int j=0;j<3;j++){
			//estudio de las posiciones en la tercer fila
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux2++;
			
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
				aux5++;
			}
		}
		
		if(aux5==2 && aux2==0) {
			circuloFila2Ganar();
			a=true;
			
			
		}
			
		
		}
	
	
		
				
		
		return a;
		
	}
	
	public void circuloFila0Ganar() {
		// revision de la primera fila
		if(tablero[0][0].equalsIgnoreCase(ficha2) && tablero[0][2].equalsIgnoreCase(ficha2)) {
			
			tablero[0][1]=ficha2;
			
		}else if(tablero[0][0].equalsIgnoreCase(ficha2) && tablero[0][1].equalsIgnoreCase(ficha2)) {
			
			tablero[0][2]=ficha2;
			
		}else if(tablero[0][1].equalsIgnoreCase(ficha2) && tablero[0][2].equalsIgnoreCase(ficha2)) {
			
			tablero[0][0]=ficha2;
			
		}
		
		
		
	}
	public void circuloFila1Ganar() {
		// revision de la segunda fila
		if(tablero[1][0].equalsIgnoreCase(ficha2) && tablero[1][2].equalsIgnoreCase(ficha2)) {
			
			tablero[1][1]=ficha2;
			
		}else if(tablero[1][0].equalsIgnoreCase(ficha2) && tablero[1][1].equalsIgnoreCase(ficha2)) {
			
			tablero[1][2]=ficha2;
			
		}else if(tablero[1][1].equalsIgnoreCase(ficha2) && tablero[1][2].equalsIgnoreCase(ficha2)) {
			
			tablero[1][0]=ficha2;
			
		}
		
		
		
	}
	
	public void circuloFila2Ganar() {
	// revision de la tercera fila
		if(tablero[2][0].equalsIgnoreCase(ficha2) && tablero[2][2].equalsIgnoreCase(ficha2)) {
			
			tablero[2][1]=ficha2;
			
		}else if(tablero[2][0].equalsIgnoreCase(ficha2) && tablero[2][1].equalsIgnoreCase(ficha2)) {
			
			tablero[2][2]=ficha2;
			
		}else if(tablero[2][1].equalsIgnoreCase(ficha2) && tablero[2][2].equalsIgnoreCase(ficha2)) {
			
			tablero[2][0]=ficha2;
			
		}
		
		
		
	}
	
	
	
	
	
	
	public boolean circuloColumnasGanar() {
		
		int j=0;
		int aux=0;
		int aux1=0;
		int aux2=0;
		int aux3=0;
		int aux4=0;
		int aux5=0;
		boolean a = false;
		
		if(a==false) {
		for(int i=0;i<3;i++) {
			//estudio de las posiciones en la primer columna
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux++;
			
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
				aux3++;
			}
			
			
		}
		
		if(aux3==2 && aux==0) {
			circuloColumna0Ganar();
			a=true;
		}
		}
		
		if(a==false) {
		j=1;
		for(int i=0;i<3;i++) {
			//estudio de las posiciones en la segunda columna
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux1++;
			
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
				aux4++;
			}
			
			
		}
		
		if(aux4==2 && aux1==0) {
			circuloColumna1Ganar();
			a=true;
		}
		}
		
		if(a==false) {
		j=2;
		for(int i=0;i<3;i++){
			//estudio de las posiciones en la tercera columna
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux2++;
			
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
				aux5++;
			}
		}
		
		if(aux5==2 && aux2==0) {
			circuloColumna2Ganar();
			a=true;
		}
		}
	
		
				
		
		
		
		
		return a;
		
	}
	

public void circuloColumna0Ganar() {
	// revision de la primera columna
	if(tablero[0][0].equalsIgnoreCase(ficha2) && tablero[2][0].equalsIgnoreCase(ficha2)) {
		
		tablero[1][0]=ficha2;
		
	}else if(tablero[0][0].equalsIgnoreCase(ficha2) && tablero[1][0].equalsIgnoreCase(ficha2)) {
		
		tablero[2][0]=ficha2;
		
	}else if(tablero[1][0].equalsIgnoreCase(ficha2) && tablero[2][0].equalsIgnoreCase(ficha2)) {
		
		tablero[0][0]=ficha2;
		
	}
	
	
	
}

public void circuloColumna1Ganar() {
	// revision de la segunda columna
	
	if(tablero[0][1].equalsIgnoreCase(ficha2) && tablero[2][1].equalsIgnoreCase(ficha2)) {
		
		tablero[1][1]=ficha2;
		
	}else if(tablero[0][1].equalsIgnoreCase(ficha2) && tablero[1][1].equalsIgnoreCase(ficha2)) {
		
		tablero[2][1]=ficha2;
		
	}else if(tablero[1][1].equalsIgnoreCase(ficha2) && tablero[2][1].equalsIgnoreCase(ficha2)) {
		
		tablero[0][1]=ficha2;
		
	}
	
	
	
}

public void circuloColumna2Ganar() { 
	
	// revision de la tercera columna
	
	if(tablero[0][2].equalsIgnoreCase(ficha2) && tablero[2][2].equalsIgnoreCase(ficha2)) {
		
		tablero[1][2]=ficha2;
		
	}else if(tablero[0][2].equalsIgnoreCase(ficha2) && tablero[1][2].equalsIgnoreCase(ficha2)) {
		
		tablero[2][2]=ficha2;
		
	}else if(tablero[1][2].equalsIgnoreCase(ficha2) && tablero[2][2].equalsIgnoreCase(ficha2)) {
		
		tablero[0][2]=ficha2;
		
	}
	
	 
	
}

public boolean circuloEsquinasGanar() {
	boolean a = false;
	if(a==false) {
		 if(tablero[0][0].equalsIgnoreCase(ficha2) && tablero[1][1].equalsIgnoreCase(ficha2)&&tablero[2][2].equalsIgnoreCase("")) {

			tablero[2][2]=ficha2;
			a=true;
		 	}
		 	}
	if(a==false) {
		 if(tablero[0][0].equalsIgnoreCase(ficha2) && tablero[2][2].equalsIgnoreCase(ficha2)&&tablero[1][1].equalsIgnoreCase("")) {
			
			tablero[1][1]=ficha2;
			a=true;
		 	}
		 	}
	if(a==false) {
		 if(tablero[1][1].equalsIgnoreCase(ficha2) && tablero[2][2].equalsIgnoreCase(ficha2)&&tablero[0][0].equalsIgnoreCase("")) {
			
			tablero[0][0]=ficha2;
			a=true;
		 	}
		 	}
	if(a==false) {
		 if(tablero[0][2].equalsIgnoreCase(ficha2) && tablero[1][1].equalsIgnoreCase(ficha2)&&tablero[2][0].equalsIgnoreCase("")) {

			tablero[2][0]=ficha2;
			a=true;
		 	}
		 	}
	if(a==false) {
		 if(tablero[0][2].equalsIgnoreCase(ficha2) && tablero[2][0].equalsIgnoreCase(ficha2)&&tablero[1][1].equalsIgnoreCase("")) {
			
			tablero[1][1]=ficha2;
			a=true;
		 	}
		 	}
	if(a==false) {
		 if(tablero[1][1].equalsIgnoreCase(ficha2) && tablero[2][0].equalsIgnoreCase(ficha2)&&tablero[0][2].equalsIgnoreCase("")) {
			
			tablero[0][2]=ficha2;
			a=true;
		 	}
		 	}
	
	
	
	return a;
	
	
}
public boolean casosEspecialeciales() {
	
		boolean a= false;
		int aux=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
		if(tablero[i][j].equalsIgnoreCase(ficha1)) {
			aux++;
		}
		if(tablero[i][j].equalsIgnoreCase(ficha2)) {
			aux++;
		}
			}
		}
		if(a==false && aux == 3) {
			 if(tablero[1][0].equalsIgnoreCase(ficha1) && tablero[1][2].equalsIgnoreCase(ficha1)) {
	
				tablero[0][1]=ficha2;
				a=true;
			 	}
			 	}
		if(a==false && aux == 3 ) {
			 if(tablero[0][1].equalsIgnoreCase(ficha1) && tablero[2][1].equalsIgnoreCase(ficha1)) {
				
				tablero[1][0]=ficha2;
				a=true;
			 	}
			 	}
		
		if(a==false && aux == 3) {
			 if(tablero[0][0].equalsIgnoreCase(ficha1) && tablero[2][1].equalsIgnoreCase(ficha1)) {
	
				tablero[1][0]=ficha2;
				a=true;
			 	}
			 	}
		if(a==false && aux == 3) {
			 if(tablero[0][2].equalsIgnoreCase(ficha1) && tablero[2][1].equalsIgnoreCase(ficha1)) {
				
				tablero[1][2]=ficha2;
				a=true;
			 	}
			 	}
		
		if(a==false && aux == 3) {
			 if(tablero[0][0].equalsIgnoreCase(ficha1) && tablero[1][2].equalsIgnoreCase(ficha1)) {
	
				tablero[0][1]=ficha2;
				a=true;
			 	}
			 	}
		if(a==false && aux == 3) {
			 if(tablero[2][0].equalsIgnoreCase(ficha1) && tablero[1][2].equalsIgnoreCase(ficha1)) {
				
				tablero[2][01]=ficha2;
				a=true;
			 	}
			 	}
		
		if(a==false && aux == 3) {
			 if(tablero[2][0].equalsIgnoreCase(ficha1) && tablero[0][1].equalsIgnoreCase(ficha1)) {
	
				tablero[1][0]=ficha2;
				a=true;
			 	}
			 	}
		if(a==false && aux == 3) {
			 if(tablero[2][2].equalsIgnoreCase(ficha1) && tablero[0][1].equalsIgnoreCase(ficha1)) {
				
				tablero[1][2]=ficha2;
				a=true;
			 	}
			 	}
		
		
		if(a==false && aux == 3) {
			 if(tablero[0][2].equalsIgnoreCase(ficha1) && tablero[1][0].equalsIgnoreCase(ficha1)) {
	
				tablero[0][1]=ficha2;
				a=true;
			 	}
			 	}
		if(a==false && aux == 3) {
			 if(tablero[1][0].equalsIgnoreCase(ficha1) && tablero[2][2].equalsIgnoreCase(ficha1)) {
				
				tablero[2][1]=ficha2;
				a=true;
			 	}
			 	}
		
		return a;
		
	}

public boolean circuloFilas() {
	
	int i=0;
	int aux=0;
	int aux1=0;
	int aux2=0;
	int aux3=0;
	int aux4=0;
	int aux5=0;

	boolean a =false;
	
	if(a==false) {
	for(int j=0;j<3;j++) {
	//estudio de las posiciones en la primera fila
		if(tablero[i][j].equalsIgnoreCase("")) {
			aux++;
		
		}
		if(tablero[i][j].equalsIgnoreCase(ficha2)) {
			aux3++;
		}
		
		
	}
	
	if(aux3==1 && aux==2) {
		circuloFila0();
		a=true;
	}
	}
	
	if(a==false) {
	i=1;
	for(int j=0;j<3;j++) {
		//estudio de las posiciones en la segunda fila
		if(tablero[i][j].equalsIgnoreCase("")) {
			aux1++;
		
		}
		if(tablero[i][j].equalsIgnoreCase(ficha2)) {
			aux4++;
		}
		
		
	}
	
	if(aux4==1 && aux1==2) {
		circuloFila1();
		a=true;
	
	}
	i=2;
	for(int j=0;j<3;j++){
		//estudio de las posiciones en la tercer fila
		if(tablero[i][j].equalsIgnoreCase("")) {
			aux2++;
		
		}
		if(tablero[i][j].equalsIgnoreCase(ficha2)) {
			aux5++;
		}
	}
	
	if(aux5==1 && aux2==2) {
		circuloFila2();
		a=true;
		
		
	}
		
	
	}


	
			
	
	return a;
	
}

	public void circuloFila0() {
		
		
		if(tablero[0][0].equalsIgnoreCase("") && tablero[0][2].equalsIgnoreCase("")) {
			if(random()==0) {
			tablero[0][0]=ficha2;
			}else {
				tablero[0][2]=ficha2;
			}
		}else if(tablero[0][0].equalsIgnoreCase("") && tablero[0][1].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[0][0]=ficha2;
				}else {
					tablero[0][1]=ficha2;
				}
			
		}else if(tablero[0][1].equalsIgnoreCase("") && tablero[0][2].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[0][1]=ficha2;
				}else {
					tablero[0][2]=ficha2;
				}
			
		}
		
	}
	public void circuloFila1() {
		
		
		if(tablero[1][0].equalsIgnoreCase("") && tablero[1][2].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[1][0]=ficha2;
				}else {
					tablero[1][2]=ficha2;
				}
			
		}else if(tablero[1][0].equalsIgnoreCase("") && tablero[1][1].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[1][0]=ficha2;
				}else {
					tablero[1][1]=ficha2;
				}
			
		}else if(tablero[1][1].equalsIgnoreCase("") && tablero[1][2].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[1][1]=ficha2;
				}else {
					tablero[1][2]=ficha2;
				}
			
		}
		
	}
	public void circuloFila2() {
		
		if(tablero[2][0].equalsIgnoreCase("") && tablero[2][2].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[2][0]=ficha2;
				}else {
					tablero[2][2]=ficha2;
				}
			
		}else if(tablero[2][0].equalsIgnoreCase("") && tablero[2][1].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[2][0]=ficha2;
				}else {
					tablero[2][1]=ficha2;
				}
			
		}else if(tablero[2][1].equalsIgnoreCase("") && tablero[2][2].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[2][1]=ficha2;
				}else {
					tablero[2][2]=ficha2;
				}
			
		}
	}
	
	public boolean circuloColumnas() {
		
		int j=0;
		int aux=0;
		int aux1=0;
		int aux2=0;
		int aux3=0;
		int aux4=0;
		int aux5=0;
	
		boolean a = false;
		
		if(a==false) {
		for(int i=0;i<3;i++) {
			//estudio de las posiciones en la primer columna
			if(tablero[i][j].equalsIgnoreCase("")) {
				aux++;
			
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
				aux3++;
			}
			
			
		}
		
		if(aux==2 && aux3==1) {
			circuloColumna0();
			a=true;
		}
		}
		
		if(a==false) {
		j=1;
		for(int i=0;i<3;i++) {
			//estudio de las posiciones en la segunda columna
			if(tablero[i][j].equalsIgnoreCase("")) {
				aux1++;
			
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
				aux4++;
			}
			
			
		}
		
		if(aux1==2 && aux4==1) {
			circuloColumna1();
			a=true;
		}
		}
		
		if(a==false) {
		j=2;
		for(int i=0;i<3;i++){
			//estudio de las posiciones en la tercera columna
			if(tablero[i][j].equalsIgnoreCase("")) {
				aux2++;
			
			}
			if(tablero[i][j].equalsIgnoreCase(ficha2)) {
				aux5++;
			}
		}
		
		if(aux2==2 && aux5==1) {
			circuloColumna2();
			a=true;
		}
		}
		
		return a;
	}
	
	
	public void circuloColumna0() {
		
		if(tablero[0][0].equalsIgnoreCase("") && tablero[2][0].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[0][0]=ficha2;
				}else {
					tablero[2][0]=ficha2;
				}
			
		}else if(tablero[0][0].equalsIgnoreCase("") && tablero[1][0].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[0][0]=ficha2;
				}else {
					tablero[1][0]=ficha2;
				}
			
		}else if(tablero[1][0].equalsIgnoreCase("") && tablero[2][0].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[1][0]=ficha2;
				}else {
					tablero[2][0]=ficha2;
				}
			
		}
		
		
		
	}
	public void circuloColumna1() {
		
		if(tablero[0][1].equalsIgnoreCase("") && tablero[2][1].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[0][1]=ficha2;
				}else {
					tablero[2][1]=ficha2;
				}
			
		}else if(tablero[0][1].equalsIgnoreCase("") && tablero[1][1].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[0][1]=ficha2;
				}else {
					tablero[1][1]=ficha2;
				}
			
		}else if(tablero[1][1].equalsIgnoreCase("") && tablero[2][1].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[1][1]=ficha2;
				}else {
					tablero[2][1]=ficha2;
				}
			
		}
		
		
		
	}
	public void circuloColumna2() {
		
		if(tablero[0][2].equalsIgnoreCase("") && tablero[2][2].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[0][2]=ficha2;
				}else {
					tablero[2][2]=ficha2;
				}
			
		}else if(tablero[0][2].equalsIgnoreCase("") && tablero[1][2].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[0][2]=ficha2;
				}else {
					tablero[1][2]=ficha2;
				}
			
		}else if(tablero[1][2].equalsIgnoreCase("") && tablero[2][2].equalsIgnoreCase("")) {
			
			if(random()==0) {
				tablero[1][2]=ficha2;
				}else {
					tablero[2][2]=ficha2;
				}
			
		}
	
	
	
	}
	
	public boolean circuloEsquinas() {
		
		boolean a = false;
		if(a==false) {
			 if(tablero[0][0].equalsIgnoreCase("") &&tablero[1][1].equalsIgnoreCase("")) {

				 if(random()==0) {
						tablero[0][0]=ficha2;
						}else {
							tablero[1][1]=ficha2;
						}
				a=true;
			 	}
			 	}
		if(a==false) {
			 if(tablero[0][0].equalsIgnoreCase("") &&tablero[2][2].equalsIgnoreCase("")) {
				
				 if(random()==0) {
						tablero[0][0]=ficha2;
						}else {
							tablero[2][2]=ficha2;
						}
				a=true;
			 	}
			 	}
		if(a==false) {
			 if(tablero[1][1].equalsIgnoreCase("") &&tablero[2][2].equalsIgnoreCase("")) {

				 if(random()==0) {
						tablero[1][1]=ficha2;
						}else {
							tablero[2][2]=ficha2;
						}
				a=true;
			 	}
			 	}
		if(a==false) {
			 if(tablero[0][2].equalsIgnoreCase("") &&tablero[1][1].equalsIgnoreCase("")) {
				
				 if(random()==0) {
						tablero[0][2]=ficha2;
						}else {
							tablero[1][1]=ficha2;
						}
				a=true;
			 	}
			 	}
		if(a==false) {
			 if(tablero[0][2].equalsIgnoreCase("") && tablero[2][0].equalsIgnoreCase("")) {

				 if(random()==0) {
						tablero[0][2]=ficha2;
						}else {
							tablero[2][0]=ficha2;
						}
				a=true;
			 	}
			 	}
		if(a==false) {
			 if(tablero[2][0].equalsIgnoreCase("") && tablero[1][1].equalsIgnoreCase("")) {
				
				 if(random()==0) {
						tablero[2][0]=ficha2;
						}else {
							tablero[1][1]=ficha2;
						}
				a=true;
			 	}
			 	}
		
		
		return a;
		
	}
	
	
	
	
	public boolean colocarCirculo() {
		
		boolean a=false;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a==false ) {
				if(tablero[i][j].equalsIgnoreCase("")) {
					tablero[i][j]=ficha2 ;
					a=true;
				}
				
				}
				}
			}
		
		return a;
		
		
		
		
		
		
	}
	
	
	public int random() {
		
		Random r = new Random();
		int r1 = r.nextInt(2) ;
		
		
		
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


