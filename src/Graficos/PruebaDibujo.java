package Graficos;
import javax.swing.*;
import java.awt.*;
public class PruebaDibujo {

	public static void main(String[] args) {
		
	}

	}



 class MarcoconDibujo extends JFrame {
	 
	 public  MarcoconDibujo () {
		 
		 
		 setTitle ("prueba de dibujo");
		 
		 setSize (300,500);
			Laminaconfigura milamina = new  Laminaconfigura ()  ;

			add(milamina);
	 }
	 
 }
 class Laminaconfigura extends JPanel  {
	public void paintComponent (Graphics g)  {
		
		super.paintComponent(g);
		Graphics2D g2 = new (Grapics2D) g;
		
	}
	   
 }