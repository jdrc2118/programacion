package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame{
		
	private Panel_2 panel_2;
	private Panel_1 panel_1;
	private Panel_fondo panel_fondo;
	
	
		
		public View() {
		
			
			
			 getContentPane().setLayout(null);
			 setTitle("JUEGO tIctActoe");
			 
			 
			 setBounds(0,0,700,700);
			 setResizable(false);
			 setDefaultCloseOperation(EXIT_ON_CLOSE);
			 getContentPane().setBackground(Color.white);
			 
			inicializar();
			 
			 setLocationRelativeTo(null);
			 setVisible(true);
		}



		private void inicializar() {
			
			
			 panel_1 = new Panel_1();
			 panel_1.setBounds(120,20,450,450);
			 panel_1.setBackground(Color.gray);
			 getContentPane().add(panel_1);
			
			 panel_2 = new Panel_2();
			 panel_2.setBounds(120,500,450,110);
			 getContentPane().add(panel_2);
			 panel_2.setBackground(Color.white);
			 
			 panel_fondo = new Panel_fondo();
			 panel_fondo.setBounds(0,0,710,710);
			 add(panel_fondo);
			
			
		}



		public Panel_2 getPanel_2() {
			return panel_2;
		}



		public void setPanel_2(Panel_2 panel_2) {
			this.panel_2 = panel_2;
		}



		public Panel_1 getPanel_1() {
			return panel_1;
		}



		public void setPanel_1(Panel_1 panel_1) {
			this.panel_1 = panel_1;
		}



		public Panel_fondo getPanel_fondo() {
			return panel_fondo;
		}



		public void setPanel_fondo(Panel_fondo panel_fondo) {
			this.panel_fondo = panel_fondo;
		}
		
		

		

	
		
		
		
		

}
