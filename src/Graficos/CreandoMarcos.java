package Graficos;
import javax.swing.*;
public class CreandoMarcos {

	public static void main(String[] args) {
		Mimarco marco1=new Mimarco ();
		 marco1.setVisible(true);
		 marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class Mimarco extends JFrame  {
	public Mimarco() {
		
	//	setSize (500, 300) ;
		
		//setLocation(500,300);
		
		setBounds(500,300,250,250);
	}
	
}