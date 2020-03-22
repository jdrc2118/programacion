package co.edu.unbosque.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import co.edu.unbosque.model.Logica;
import co.edu.unbosque.view.View;



public class Controller implements ActionListener  {
	
	
	
	
	public View v;
	public Logica l;

	

	
	
	public Controller() {
		
		
		l=new Logica();
		v= new View();
		v.getPanel_2().getJugar().addActionListener(this);
			
			
		}
		
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Jugar")) {
			
			conexion_matrices();
			verificarLetras();
		
			
						
						
					  }
					
				
			
			
			
		

		
		}




	public void conexion_matrices() {

		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				l.getTablero()[i][j]=v.getPanel_1().getTablero()[i][j].getText();
				
				
			    }
			}
		
		l.jugar();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				v.getPanel_1().getTablero()[i][j].setText(l.getTablero()[i][j]);
				
				
			    }
			}
		
		
	}
	
	public void verificarLetras() {
		
		if(!l.verificarLetras()) {
			
			v.mostrarMensaje("Ingreso una letra no valida");
			
		}
	}
	public void verificarempate() {
			
			if(l.buscarEmpate()) {
				
				v.mostrarMensaje("empate");
				
			}
		
		
		
	}
		
		
	}
	
	
	
	



