package EjercicodeEstructura;
import java.util.*;
import javax.swing.*;
public class Areas {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		System.out.println("eleige una opcion  \n1: cuadrado\n2:rectanguñp \n3:triangulo\n4:circulo");
		int figura= entrada.nextInt();
		switch(figura) {
		
		
		case 1:
		int lado=Integer.parseInt(JOptionPane.showInputDialog("introduzaca un lado"));
		
		System.out.println("el area del cuadrado es" +Math.pow(lado, 2));
		break;
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
			System.out.println("el area del rectagulo  es" +base*altura);
			break;
		case 3:
			int base1=Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
			int altura1=Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
			System.out.println("el area del tringulo es" +(base1*altura1)/2);
			break;
		case 4:
		int radio= Integer.parseInt(JOptionPane.showInputDialog("introduzca el radio"));
		System.out.print("el area del circulo");
		System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
		break;
		default: 
			System.out.println("la opcion no es correcta ");
			
		}
	}

}
