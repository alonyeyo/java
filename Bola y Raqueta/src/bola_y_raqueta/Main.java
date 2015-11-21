package bola_y_raqueta;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ventana v = new Ventana();
		v.setUndecorated(true);
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setExtendedState(JFrame.MAXIMIZED_BOTH);


	}

}
