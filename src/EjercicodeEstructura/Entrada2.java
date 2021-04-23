package EjercicodeEstructura;
import javax.swing.*;
public class Entrada2 {

	public static void main(String[] args) {
	String nombre_usuario=JOptionPane.showInputDialog("introduce tu nombre");
	//paquete sswing
String edad=JOptionPane.showInputDialog("introduzca su edad");
	 

	int edad_usuario= Integer.parseInt(edad);
	edad_usuario++;
	
	System.out.println("hola te llama"+nombre_usuario+"el proximo años tendra  "+edad_usuario+"años");
	}

}
