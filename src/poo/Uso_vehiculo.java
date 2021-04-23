package poo;
import javax.swing.*;
public class Uso_vehiculo {
public static void main(String[] args) {
		
	/*Coche micoche=new Coche ();
     /* micoche.establece_color(JOptionPane.showInputDialog("introduce el color"));
	System.out.println (micoche.dime_datosgenerales());
	 System.out.println (micoche.dime_color());
	micoche.configura_asiento(JOptionPane.showInputDialog("¡¿introduce si tiene asiento de cuero?"));
	System.out.println (micoche.dime_asientocuero());
	micoche.configura_climitazador( JOptionPane.showInputDialog("introduce si tiene climatizador o sino"));
	System.out.println (micoche.dime_climatizador());
	System.out.println (micoche.dime_peso_coche());
	System.out.println("el precio del coche es:"+micoche.precio_coche());
	*/
	
	Coche micoche=new  Coche ();
	micoche.establece_color("rojo");
	Furgoneta mifurgoneta1=new Furgoneta(7,580);
	mifurgoneta1.establece_color("azuel");
	mifurgoneta1.configura_asiento("si");
	mifurgoneta1.configura_climitazador("si");
	System.out.println (micoche.dime_datosgenerales()+micoche.dime_color());
	System.out.println (mifurgoneta1.dime_datosgenerales()+mifurgoneta1.dimeDatosFurgoneta());
	
	
}
}