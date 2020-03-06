package co.edu.unbosque.view;


import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Panel_1 extends JPanel {
	
	public JTextField[][] tablero;
	private int filas=3;
	private int columnas=3;
	
	public Panel_1() {
		
		setLayout(new GridLayout(filas,columnas));
		inicializar();
		setVisible(true);
}

	private void inicializar() {
		
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

}
