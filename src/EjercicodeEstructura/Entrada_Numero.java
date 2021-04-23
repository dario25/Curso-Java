package EjercicodeEstructura;
import javax.swing.*;public class Entrada_Numero {

	public static void main(String[] args) {
	String num1=JOptionPane.showInputDialog ("introuzca un numero");
		double num2=Double.parseDouble(num1);
		System.out.print("la raiz"+num2+"es");
		System.out.printf ("%1.2f",Math.sqrt(num2));
	}

}



