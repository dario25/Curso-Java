package EjercicodeEstructura;
import javax.swing.*;
public class AccesoAplicacion {

	public static void main(String[] args) {

		String clave="dario";
		String pass= "";
		while(clave.equals(pass)==false)
		{
			pass=JOptionPane.showInputDialog("introduce la contraseņa porfavor");
			if (clave.equals(pass)==false) {
				System.out.println("contraseņa incorecta");
				
			}
		}
		System.out.println("es autenticado");
	}

}
