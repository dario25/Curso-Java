package EjercicodeEstructura;

import javax.swing.JOptionPane;

public class CompruebaEmail
{public static void main(String[] args) {

	
int arroba =0;	
boolean punto= false;
	String mail=JOptionPane.showInputDialog("introduzca el mail");
for (int i = 0 ; i <mail.length(); i++){
		
		

	System.out.println (mail.length());
if (mail.charAt(i)==  '@') {
		
		arroba++;
	}
if (mail.charAt(i)=='.') {
	punto=true;
	
	
	
}

}
if (arroba==1&& punto==true) {
	
	System.out.println("el email es correcto");
}

else {
	System.out.println("no es correcto");
	}
	
	
}
}
