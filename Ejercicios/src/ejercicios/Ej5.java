package ejercicios;

import javax.swing.JOptionPane;

public class Ej5 {

	public static void main(String[] args) {
		int A = Integer.parseInt(JOptionPane.showInputDialog("dame A"));
		
		int resto = A % 2;
		
		if(resto == 0){
			JOptionPane.showMessageDialog(null, "A es par");
		}else{
			JOptionPane.showMessageDialog(null, "A es impar");
		}
		

	}

}
