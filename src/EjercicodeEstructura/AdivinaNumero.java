package EjercicodeEstructura;
import java.util.*;
public class AdivinaNumero {

	public static void main(String[] args) {
	
		int aleatorio= (int) (Math.random()*100);
		Scanner entrada= new Scanner (System.in);
		int numero=0;
		int intento = 0;
		do 
		
		{
			intento++;
			
		System.out.println ("introduce un numero");
		numero=entrada.nextInt();
		if   (aleatorio<numero) {
			
			
			System.out.println("es mas bajo ");
			
			
			
			
		} else if (aleatorio>numero) {
			
			System.out.println("mas alto");
			
		}
		
		
			
		}while (numero!=aleatorio);
			
		System.out.println ("corecto");

		
		System.out.println ("lo ha conseguido"+ intento +"intentos");
	}
	

}
