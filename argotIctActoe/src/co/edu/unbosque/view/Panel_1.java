package co.edu.unbosque.view;


import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_1 extends JPanel {
	
	public JButton[][] tablero;
	private int filas=3;
	private int columnas=3;
	
	public Panel_1() {
		
		setLayout(new GridLayout(filas,columnas));
		inicializar();
		setVisible(true);
}

	private void inicializar() {
		
		tablero = new JButton[filas][columnas];
		for(int i = 0; i<filas; i++){
			for(int j = 0; j<columnas; j++){
        tablero [i][j]= new JButton();
        add(tablero[i][j]);
		
		
			}
		}
		
		
		
		
		

		
	
	}

}
