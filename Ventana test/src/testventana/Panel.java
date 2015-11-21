package testventana;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel {
	
	public Panel(){
		setBackground(Color.RED);
		
		
		MouseListener ml = new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				Random rand = new Random();
				float g = rand.nextFloat();
				float b = rand.nextFloat();
				float r = rand.nextFloat();
				Color randomColor = new Color(r, g, b);
				setBackground(randomColor);
			}
			
		};
		
	addMouseListener(ml );
		
	}
	
	@Override
	public void paint (Graphics g){
		super.paint(g);
		
		//dibujamos cosas
		g.setColor(Color.ORANGE);
		for(int j=0; j<10; j++){
			for(int i=0; i<10; i++){
				float red = 0.1f*i;
				float green = 1-red;
				float blue = 0.1f*j;
				Color miColor = new Color(red,green,blue);
				g.setColor(miColor);
				g.fillOval(i*100, j*100, 100, 100);
		
		}
		
		
	}

	}
}
