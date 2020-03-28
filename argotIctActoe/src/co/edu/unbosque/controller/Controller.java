package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import co.edu.unbosque.model.MatrizLogica;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	public View v;
	public MatrizLogica l;

	public Controller() {

		// inicializacion variables y activacion del action listener
		l = new MatrizLogica();
		v = new View();
		v.getPanel_2().getJugar().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Jugar")) {

			// activar con el boton jugar los diferentes metodos
			traspasoMatrizLogica();
			if(verificarLetras()){
			
			traspasoMatrizVista();
			v.getPanel_1().bloquearCuadrosUtilizados();
			
			verificarGanador();
			}
		}

	}

	public void traspasoMatrizLogica() {

		// transpaso de jugada del circulo hacia la ventana principal
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				l.getTablero()[i][j] = v.getPanel_1().getTablero()[i][j]
						.getText();

			}
		}
	}
      public void traspasoMatrizVista(){
		l.jugar();
		// transpaso de jugada de la persona a la matriz logica
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				v.getPanel_1().getTablero()[i][j].setText(l.getTablero()[i][j]);

			}
		}

	}

	public boolean verificarLetras() {
		boolean a = true;
		// metodo para admitir solo letra X y O
		if (!l.verificarLetras()) {

			v.mostrarMensaje("Ingreso una letra no valida");
			a = false;
		}
		if (!l.fichaPersona() ){
			
			v.mostrarMensaje(" usted es la ficha x ");
			a = false;
		}
		return a;
	}
	
	

	public void verificarGanador() {
		// letreros respectivos para ganar, perder o empatar
		if (l.ganaHumano()) {

			v.mostrarMensaje("Hmm, me ganaste, ¡qué aburrido!");

		} else if (l.ganaPC()) {

			v.mostrarMensaje("¡Ja, ja te gane humano!");

		} else if (l.letreroEmpate()) {

			v.mostrarMensaje("Empate. No pudimos");

		}
	}
}




	
	
	



