package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame{
		
	public Panel_2 panel_2;
	public Panel_1 panel_1;
	public ImageIcon imagen;
	
		
		public View() {
		
			
			
			 getContentPane().setLayout(null);
			 setTitle("JUEGO tIctActoe");
			 
			 
			 setBounds(0,0,700,700);
			 setResizable(false);
			 setDefaultCloseOperation(EXIT_ON_CLOSE);
			 getContentPane().setBackground(Color.white);
			 
			
			 
			 panel_1 = new Panel_1();
			 panel_1.setBounds(120,20,450,450);
			 panel_1.setBackground(Color.gray);
			 getContentPane().add(panel_1);
			
			 panel_2 = new Panel_2();
			 panel_2.setBounds(120,500,450,110);
			 getContentPane().add(panel_2);
			 panel_2.setBackground(Color.white);
			
	
			 
			 setLocationRelativeTo(null);
			 setVisible(true);
		}


		@Override
		public void paintComponents(Graphics g) {
			Dimension tam=getSize();
			imagen = new ImageIcon(new ImageIcon(getClass().getResource("..//imagenes//triqui.png")).getImage());
			g.drawImage(imagen.getImage(), 0, 0, tam.width, tam.height, null);
		}
		
		
		
		

}
