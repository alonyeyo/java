package bola_y_raqueta;

import java.awt.Color;
import java.awt.Graphics;

public class Ladrillo extends Dibujable{
	
	private double x;
	private double y;
	private double ancho;
	private double alto;
	
	public Ladrillo(double x, double y, double ancho, double alto){
		this.x=x;
		this.y=y;
		this.ancho=ancho;
		this.alto=alto;
		
	}
	
	
	public void dibujar (Graphics g){
		g.setColor(Color.RED);
		g.fillRect((int)x, (int)y, (int)ancho, (int)alto);
	}
	
	
	
	public void mover() {
		
	}

}
