package ejercicios;

public class Ej4 {

	public static void main(String[] args) {
		int A = 1;
		int B = 20;
		int C = 30;
		int D = 40;
		
		
		int aux = A;
		A = D;
		D = B;
		
		B = C;
		C = aux;
		
		
		System.out.println("A es: " + A);
		System.out.println("B es: " + B);
		System.out.println("C es: " + C);
		System.out.println("D es: " + D);
		
	}

}
