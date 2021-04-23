package poo1;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;
public class PruebaTemporizador2 {
	public static void main(String[] args) {
		Reloj mireloj = new Reloj ();
          mireloj.enMarcha(3000,true);
JOptionPane.showMessageDialog(null, "aceptar la opcion para detener");
System.exit(0);




}}
	class Reloj {
		//public Reloj (int intervalo,final  boolean sonido  ) {
			
			//this.intervalo=intervalo;
			//this.sonido=sonido;
			
		//}
		public void enMarcha (int intervalo, final boolean sonido) {
			   class  DamelaHora2 implements 	ActionListener {
					public void actionPerformed (ActionEvent evento ) {
						
						Date ahora=new Date ();
						System.out.println("imprima la hora cada 3 segundo"+ahora);
					
		 if (sonido) {
			 Toolkit.getDefaultToolkit().beep();
			 
		 }
		 }
			
					
				}
			ActionListener oyente = new DamelaHora2();
			Timer mitemporizador= new Timer (intervalo,oyente);
			mitemporizador.start();
		}
		private int intervalo ;
		private boolean sonido;
	       
	}
	

		
		



