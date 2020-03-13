package co.edu.unbosque.model;

public class Logica {
	
	
	private String tablero[][];
	private int filas=3;
	private int columnas=3;
	
	private String ficha1;
	private String ficha2;
	private int posicion1;
	private int posicion2;
	
	
	
	
	public Logica() {
		
		
		tablero = new String[filas][columnas];
		
		ficha1="X";
		ficha2="O";
	
		}
		
		
		
	
	
	public String jugar() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(tablero[i][j]==ficha1) {
					tablero[2][2]=ficha2;
					posicion1=2;
					posicion2=2;
					
					}
				}
			}
		return ficha2;
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

	public int getPosicion1() {
		return posicion1;
	}

	public void setPosicion1(int posicion1) {
		this.posicion1 = posicion1;
	}

	public int getPosicion2() {
		return posicion2;
	}

	public void setPosicion2(int posicion2) {
		this.posicion2 = posicion2;
	}
	
	
	
	
	
				
				
			
		
	}


