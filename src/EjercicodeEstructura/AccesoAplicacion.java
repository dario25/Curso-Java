package EjercicodeEstructura;
import javax.swing.*;
public class AccesoAplicacion {

	public static void main(String[] args) {

		String clave="dario";
		String pass= "";
		while(clave.equals(pass)==false)
		{
			pass=JOptionPane.showInputDialog("introduce la contrase�a porfavor");
			if (clave.equals(pass)==false) {
				System.out.println("contrase�a incorecta");
				
			}
		}
		System.out.println("es autenticado");
	}

}
