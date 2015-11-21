package bola_y_raqueta;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ventana extends JFrame{
	public Ventana(){
		Panel mipanel = new Panel();
		setContentPane(mipanel);
		mipanel.setFocusable(true);
		mipanel.requestFocus();
	}
}
	
	
		
