package co.edu.unbosque.view;


import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Panel_1 extends JPanel {
	
	private JTextField[][] tablero;
	private int filas=3;
	private int columnas=3;

	
	public Panel_1() {
		
		setLayout(new GridLayout(filas,columnas));
		inicializar();
		setVisible(true);
}

	public void inicializar() {
		
		Font fuente = new Font("calibri",3,70);
		
		tablero = new JTextField[filas][columnas];
		for(int i = 0; i<filas; i++){
			for(int j = 0; j<columnas; j++){
        tablero [i][j]= new JTextField();
        tablero[i][j].setHorizontalAlignment(SwingConstants.CENTER);
        tablero[i][j].setFont(fuente);
        add(tablero[i][j]);
		
		
			}
		}
		
		
		
	}
	
	public void bloquear() {
		
		for(int i = 0; i<filas; i++){
			for(int j = 0; j<columnas; j++){
			
				if(tablero[i][j].getText().equals("")) {
					
					
				}else {
					tablero[i][j].setEnabled(false);
					
				}
				
				
				}
			}
				
		
		
		
	}
	
	
	
	
	
	

	public JTextField[][] getTablero() {
		return tablero;
	}

	public void setTablero(JTextField[][] tablero) {
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


	
	
	

}
