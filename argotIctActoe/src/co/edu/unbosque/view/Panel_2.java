package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_2 extends JPanel{
	
	
	public JButton jugar;
	
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
	
	
	
	

}
