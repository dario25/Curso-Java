package EjercicodeEstructura;
import javax.swing.*;
public class UsoArrayDos {

	public static void main(String[] args) {
		String [] paises=new String[8];
  for  (int i=0;i<8;i++)
  {
	  
	  paises [1]=JOptionPane.showInputDialog("introduce un pais" +(i+1));
  }
	
for(String elemento:paises) {
	System.out.println("pais"+elemento);
	
}
}
}
