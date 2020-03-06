package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_2 extends JPanel{
	
	
	public JButton jugar;
	public ImageIcon imagen;
	
	public Panel_2() {
		
		setLayout(null);
        inicializar();
		
		setVisible(true);
	}

	private void inicializar() {
		
		
		jugar= new JButton("Jugar");
		jugar.setBounds(170, 10, 120,70 );
		add(jugar);
		
		
	}
	
	
	@Override
	public void paintComponents(Graphics g) {
		Dimension tam=getSize();
		imagen = new ImageIcon(new ImageIcon(getClass().getResource("..//imagenes//triqui.png")).getImage());
		g.drawImage(imagen.getImage(), 0, 0, tam.width, tam.height, null);
	}
	
	
	
	

}
