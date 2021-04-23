package Graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
public class EscribiendoMarco {
	public static void main(String[] args) {
		Marcotexto mimarco=  new Marcotexto ();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
}
}
class Marcotexto extends JFrame  {
public Marcotexto () {
	
setVisible (true);

setSize (600,450);
setLocation (200,400);
setTitle("primer texto");

}
}

class lamina extends JPanel {
	
	public void painComponent(Graphics g) {
		super.paint(g);
g.drawString("Estamos aprediendo", 100, 100);
		
	}
}