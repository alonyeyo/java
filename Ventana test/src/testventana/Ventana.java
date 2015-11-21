package testventana;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ventana extends JFrame{
	
	public Ventana(){
		setSize(1500, 1500);
		setContentPane(new Panel());
		
		
	}

}
