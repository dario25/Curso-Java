package EjercicodeEstructura;
import java.util.*;
public class Enunciado {

	enum Talla { 
		
		MINI ("s"),GRANDE("G"), MEDIANA ("m"),MUY_GRANDE("xml");
		
		private Talla (String  abreviatura)  {
		this.abreviatura=abreviatura;
		
		
		}
		public  String dameabreviatura () {
			return abreviatura;
		}
		private String abreviatura;
	}
	


	
	public static void main(String[] args) {
 Scanner entrada = new Scanner (System.in);
 System.out.println ("Escribi la talla mini.,grade,pequeña,muy grande");
 String entrada_dato=entrada.next().toUpperCase();
		 
	Talla la_latalla=Enum.valueOf(Talla.class,entrada_dato);
System.out.println ("la talla va ser igual"+la_latalla);
System.out.println ("Abreviatura"+la_latalla.dameabreviatura());

	}

}
