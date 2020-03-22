package co.edu.unbosque.model;

public class Logica {
	
	
	private String tablero[][];
	private int filas=3;
	private int columnas=3;
	
	private String ficha1;
	private String ficha2;
	
	
	
	
	
	public Logica() {
		
		
		tablero = new String[filas][columnas];
		
		ficha1="X";
		ficha2="O";
	
		}
		
		
		
	
	
	public String jugar() {
		

		verificarLetras();
		logica1();
		esquinas();
		filas();
		columnas();
		buscarEmpate();
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				if(tablero[i][j].equalsIgnoreCase(ficha1)) {
//					tablero[2][2]=ficha2;
//					System.out.println(tablero[2][2]);
//					
//					
//					
//					}
//				}
//			}
		return ficha2;
		}

	public boolean verificarLetras() {
		
		
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
	
	public void logica1() {
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
			if(tablero[1][1].equalsIgnoreCase(ficha1)){
				
				tablero[0][0]=ficha2;
				
			}else if(tablero[i][j].equalsIgnoreCase(ficha1)) {
					tablero[1][1]=ficha2;
					System.out.println(tablero[1][1]);
					
					
					
					}
				}
			}
		
		
		
	
		
	}
	
	public void filas() {
		
		int i=0;
		int aux=0;
		int aux1=0;
		int aux2=0;
		
		
		for(int j=0;j<3;j++) {
		
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux++;
			
			}
			
			
		}
		
		if(aux>1) {
			fila0();
		}
		i=1;
		for(int j=0;j<3;j++) {
			
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux1++;
			
			}
			
			
		}
		
		if(aux1>1) {
			fila1();
		}
		i=2;
		for(int j=0;j<3;j++){
			
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux2++;
			
			}
		}
		i++;
		if(aux2>1) {
			fila2();
		}
		
		
		
		
	
		
	}
	
public void columnas() {
		
		int j=0;
		int aux=0;
		int aux1=0;
		int aux2=0;
		
		
		for(int i=0;i<3;i++) {
		
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux++;
			
			}
			
			
		}
		
		if(aux>1) {
			columna0();
		}
		j=1;
		for(int i=0;i<3;i++) {
			
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux1++;
			
			}
			
			
		}
		
		if(aux1>1) {
			columna1();
		}
		j=2;
		for(int i=0;i<3;i++){
			
			if(tablero[i][j].equalsIgnoreCase(ficha1)) {
				aux2++;
			
			}
		}
		j++;
		if(aux2>1) {
			columna2();
		}
		
		
		
		
	
		
	}
	public void esquinas() {
	
		 if(tablero[0][2].equalsIgnoreCase(ficha1) && tablero[1][1].equalsIgnoreCase(ficha1)) {
			
			tablero[2][0]=ficha2;
			
		}else if(tablero[1][1].equalsIgnoreCase(ficha1) && tablero[2][0].equalsIgnoreCase(ficha1)) {
			
			tablero[0][2]=ficha2;
			
		}
		
		
	}
	
	
	
	public void fila0() {
		
		if(tablero[0][0].equalsIgnoreCase(ficha1) && tablero[0][2].equalsIgnoreCase(ficha1)) {
			
			tablero[0][1]=ficha2;
			
		}else if(tablero[0][0].equalsIgnoreCase(ficha1) && tablero[0][1].equalsIgnoreCase(ficha1)) {
			
			tablero[0][2]=ficha2;
			
		}else if(tablero[0][1].equalsIgnoreCase(ficha1) && tablero[0][2].equalsIgnoreCase(ficha1)) {
			
			tablero[0][0]=ficha2;
			
		}
		
		
		
	}
	public void fila1() {
		
		if(tablero[1][0].equalsIgnoreCase(ficha1) && tablero[1][2].equalsIgnoreCase(ficha1)) {
			
			tablero[1][1]=ficha2;
			
		}else if(tablero[1][0].equalsIgnoreCase(ficha1) && tablero[1][1].equalsIgnoreCase(ficha1)) {
			
			tablero[1][2]=ficha2;
			
		}else if(tablero[1][1].equalsIgnoreCase(ficha1) && tablero[1][2].equalsIgnoreCase(ficha1)) {
			
			tablero[1][0]=ficha2;
			
		}
		
		
		
	}
	
public void fila2() {
		
		if(tablero[2][0].equalsIgnoreCase(ficha1) && tablero[2][2].equalsIgnoreCase(ficha1)) {
			
			tablero[2][1]=ficha2;
			
		}else if(tablero[2][0].equalsIgnoreCase(ficha1) && tablero[2][1].equalsIgnoreCase(ficha1)) {
			
			tablero[2][2]=ficha2;
			
		}else if(tablero[2][1].equalsIgnoreCase(ficha1) && tablero[2][2].equalsIgnoreCase(ficha1)) {
			
			tablero[2][0]=ficha2;
			
		}
		
		
		
	}
		


public void columna0() {
	
	if(tablero[0][0].equalsIgnoreCase(ficha1) && tablero[2][0].equalsIgnoreCase(ficha1)) {
		
		tablero[1][0]=ficha2;
		
	}else if(tablero[0][0].equalsIgnoreCase(ficha1) && tablero[1][0].equalsIgnoreCase(ficha1)) {
		
		tablero[2][0]=ficha2;
		
	}else if(tablero[1][0].equalsIgnoreCase(ficha1) && tablero[2][0].equalsIgnoreCase(ficha1)) {
		
		tablero[0][0]=ficha2;
		
	}
	
	
	
}

public void columna1() {
	
	if(tablero[0][1].equalsIgnoreCase(ficha1) && tablero[2][1].equalsIgnoreCase(ficha1)) {
		
		tablero[1][1]=ficha2;
		
	}else if(tablero[0][1].equalsIgnoreCase(ficha1) && tablero[1][1].equalsIgnoreCase(ficha1)) {
		
		tablero[2][1]=ficha2;
		
	}else if(tablero[1][1].equalsIgnoreCase(ficha1) && tablero[2][1].equalsIgnoreCase(ficha1)) {
		
		tablero[0][1]=ficha2;
		
	}
	
	
	
}

public void columna2() {
	
	if(tablero[0][2].equalsIgnoreCase(ficha1) && tablero[2][2].equalsIgnoreCase(ficha1)) {
		
		tablero[1][2]=ficha2;
		
	}else if(tablero[0][2].equalsIgnoreCase(ficha1) && tablero[1][2].equalsIgnoreCase(ficha1)) {
		
		tablero[2][2]=ficha2;
		
	}else if(tablero[1][2].equalsIgnoreCase(ficha1) && tablero[2][2].equalsIgnoreCase(ficha1)) {
		
		tablero[0][2]=ficha2;
		
	}
	
	
	
}
	public boolean buscarEmpate( ) {
		int aux= 0;
		int valor = 9;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				if(tablero[i][j].equalsIgnoreCase("")) {
					
					
					return false;
					
					
				}else {
					
					return true;
					
				}
					
				
				}
			}
		return false;
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


