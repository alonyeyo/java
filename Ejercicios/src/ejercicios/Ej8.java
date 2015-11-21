package ejercicios;
import javax.swing.JOptionPane;

public class Ej8 {

	public static void main(String[] args) {
		int A = Integer.parseInt(JOptionPane.showInputDialog("Dímela"));
		int B = Integer.parseInt(JOptionPane.showInputDialog("dime otra"));
		
		JOptionPane.showMessageDialog(null, "primero "+A+" y luego "+B);
		

	}

}
