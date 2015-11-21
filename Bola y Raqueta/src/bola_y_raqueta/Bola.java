package bola_y_raqueta;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Bola extends Dibujable{

	private Raqueta raqueta;

	private double x;
	private double y;

	private double vx = - 10;
	private double vy = - 10;
	
	private Image img;
	

	public Bola (Raqueta raqueta){
		this.raqueta = raqueta;
		try {
			img = ImageIO.read(new File("Bola.png"));
			img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void dibujar(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
		

	}

	@Override
	public void mover() {

		x = x+ vx;
		y = y + vy;
		if (x<0){
			vx = vx*-1;
		}
		if (y<0){
			vy = vy*-1;
		}
		if (x>Panel.ANCHO-img.getWidth(null)){
			vx = vx*-1;
		}
		if (y>Panel.ALTO-img.getHeight(null)){
			vy = vy*-1;
		}
		//la y de la bola + 50 tiene q ser mayor que la de la raqueta
		//la x de la raqueta tiene que ser menor que la de la bola - 25
		//la x de la raqueta + 300 tiene que ser mayor que la x de la bola - 25
		if(y+50>raqueta.getY() && x-25>raqueta.getX() && x-25<raqueta.getX()+300){
			vy = -10;
		}



	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

}
