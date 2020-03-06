package co.edu.unbosque.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import co.edu.unbosque.view.View;



public class Controller implements ActionListener  {
	
	
	
	
	public View v;
	

	

	
	
	public Controller() {
		
		
	
		v= new View();
		v.panel_2.jugar.addActionListener(this);
		
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				v.panel_1.tablero[i][j].addActionListener(this);
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getActionCommand().equals("")) {
			System.out.println("hola");
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	


}
