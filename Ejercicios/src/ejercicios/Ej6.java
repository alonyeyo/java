package ejercicios;

import javax.swing.JOptionPane;

public class Ej6 {

	public static void main(String[] args) {
		int B = Integer.parseInt(JOptionPane.showInputDialog("dame B... ¡¡¡pls!!!"));
		
		boolean deduccion = B<0;
		
		if(deduccion){
			JOptionPane.showMessageDialog(null, "es negativo");
		
		}
		else{
			JOptionPane.showMessageDialog(null, "es positivo ");
		}

	}

}
