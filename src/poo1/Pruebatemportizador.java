package poo1;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
public class Pruebatemportizador {

	public static void main(String[] args) {
//actionlistenerDamelahora
		
		DameLaHora oyente =new DameLaHora ();
Timer mitemporizador = new Timer (2222, oyente);

mitemporizador.start();
JOptionPane.showConfirmDialog(null, "pulsa aceptar para detener");
System.exit(0);
	}
}
class DameLaHora  implements ActionListener {
	public void actionPerformed (ActionEvent e) {
		Date ahora = new Date ();
Toolkit.getDefaultToolkit().beep();
		
		System.out.println ("te ponga la hora"+ahora);
	}
	
}

