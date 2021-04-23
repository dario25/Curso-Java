package EjercicodeEstructura;
import java.util.*;
public class Condiocionales {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		System.out.println("introduce tu edad"); 
		int edad= entrada.nextInt();
	
		
		if (edad<18) {
			System.out.println("eres un adolecente"); 
			
			
			
			
	}
		else  if (edad <40) { System.out.println("eres joven"); 
		
	}
		else if (edad<75) { System.out.println("eres maduro");
			
		}
		else { System.out.println("cuidate");
			
		}
}
}