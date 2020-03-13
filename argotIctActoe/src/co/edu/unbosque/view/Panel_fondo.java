package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel_fondo extends JPanel {
	
	ImageIcon imagen;

	protected void paintComponent(Graphics g) {
		Dimension tam=getSize();
		imagen = new ImageIcon(new ImageIcon(getClass().getResource("..\\Imagenes\\triqui.png")).getImage());
		g.drawImage(imagen.getImage(), 0, 0, tam.width, tam.height, null);
	}
	
	

}
