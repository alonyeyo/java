package bola_y_raqueta;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel{

	public static final double ANCHO= Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	public static final double ALTO= Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	Dibujable d = new Dibujable();

	private ArrayList<Dibujable> dibujables = new ArrayList<Dibujable>();
	private boolean izquierda = false;
	private boolean derecha = false;

	Raqueta raqueta = new Raqueta();
	Bola bola = new Bola(raqueta);
	public Panel(){
		setBackground(Color.GRAY);



		raqueta.setX(ANCHO/2-150);
		raqueta.setY(ALTO-100);
		bola.setX(ANCHO/2-25);
		bola.setY(ALTO-50);
		dibujables.add(raqueta);
		dibujables.add(bola);
		
			
			Ladrillo ladrillo = new Ladrillo(0, 0, 200, 100);
			dibujables.add(ladrillo);



		KeyListener kl = new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
					System.exit(0);
				}
				if(e.getKeyCode() == KeyEvent.VK_RIGHT){
					derecha = true;
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT){
					izquierda = true;
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_RIGHT){
					derecha = false;
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT){
					izquierda = false;
				}
			}

		};
		addKeyListener(kl);
		Thread t = new Thread(new Runnable(){
			@Override
			public void run(){
				while (true){
					try{
						Thread.sleep(20);
					} catch (InterruptedException e){}
					repaint();
					actualizarPosiciones();
				}
			}
		});
		t.start();



	}

	@Override
	public void paint (Graphics g){
		super.paint(g);
		for(Dibujable d : dibujables){
			d.dibujar(g);
		}

	}

	public void actualizarPosiciones(){
		for(Dibujable d : dibujables){
			d.mover();
		}

		boolean NoSePasaPorLaIzquierda = (raqueta.getX()<0);
		boolean NoSePasaPorLaDerecha = (raqueta.getX()+300>ANCHO);

		if(izquierda && !NoSePasaPorLaIzquierda){
			raqueta.setX(raqueta.getX()-15);
		}
		if(derecha && !NoSePasaPorLaDerecha){
			raqueta.setX(raqueta.getX()+15);
		}

	}


}
