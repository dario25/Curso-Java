package EjercicodeEstructura;
import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
long resultado=1L;
int numero= Integer.parseInt(JOptionPane.showInputDialog("introduce el numero"));

for (int i=numero; i>0;i--) {
	
	resultado=   (resultado*i);
}
System.out.println("el factorial de numero"+numero+"es"+resultado);
	}

}
