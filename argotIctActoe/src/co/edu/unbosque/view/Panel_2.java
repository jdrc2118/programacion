package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_2 extends JPanel{
	
	
	private JButton jugar;
	
	
	public Panel_2() {
		
		setLayout(null);
        inicializarComponentes();
		
		setVisible(true);
	}

	private void inicializarComponentes() {
		
		
		jugar= new JButton("Jugar");
		jugar.setBounds(170, 10, 120,70 );
		add(jugar);
		
		
	}
	
	
	public JButton getJugar() {
		return jugar;
	}

	public void setJugar(JButton jugar) {
		this.jugar = jugar;
	}

	
	
	
	
	

}
