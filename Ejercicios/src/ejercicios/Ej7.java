package ejercicios;

import javax.swing.JOptionPane;

public class Ej7 {

	public static void main(String[] args) {
		double C = Integer.parseInt(JOptionPane.showInputDialog("dame C"));
		String positivo="";
		String par = "";
		String cinco = "";
		String diez = "";
		String M = "";
		if(C<0){
			positivo = "es negativo\n";
		}else{
			positivo = "es positivo\n";
		}
		
		if (C%2==0){
			par = "es par\n";
		}else{
			par = "es impar\n";
		}
		
		if(C%5==0){
			cinco = "es múltiplo de 5\n";
		}else{
			cinco = "no es múltiplo de 5\n";
		}
		
		if(C%10==0){
			diez = "es múltiplo de 10\ny";
		}else{
			diez = "no es múltiplo de 10\ny ";
		}
		
		if(C<100){
			M = "es menor de cien";
		}else{
			M = "es mayor que cien";
		}
		
		JOptionPane.showMessageDialog(null, positivo+par+cinco+diez+M);

	}

}
