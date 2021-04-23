package EjercicodeEstructura;

import javax.swing.JOptionPane;

public class Peso_Ideal {

	public static void main(String[] args) {
		String genero="";
		do {
			genero=JOptionPane.showInputDialog("intrpduce el genero  (h/m)");
		} 
		while (genero.equalsIgnoreCase("h")==false && genero.equalsIgnoreCase("m")==false);
int altura=Integer.parseInt(JOptionPane.showInputDialog("introduce la altura cm"));
int pesoideal=0;
if  (genero.equalsIgnoreCase("h")) {
	
	pesoideal=altura-110;

}
else if (genero.equalsIgnoreCase("m"))
{
	pesoideal=altura-120;

	
}
System.out.println("tu peso ideal es"+pesoideal);
}
}
