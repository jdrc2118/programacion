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
			
			for(int i = 0;i<3;i++) {	
				for(int j=0;j<3;j++) {
					
					
				if(v.getPanel_1().getTablero()[i][j].getText().equals("X")) {
					
					
					
				l.getTablero()[i][j]="X";
				System.out.println(l.getTablero()[i][j]);
			  }
			}
		}
			

		
		
		}
		
		
	}
	
	
	
	


}
