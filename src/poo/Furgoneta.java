package poo;
import java.lang.*;
public class Furgoneta extends Coche {
	
	private int  capacidadextra;
	private int plazaextra;
	
	public Furgoneta(int plazaextra, int capacidadextra) {
		
	super ();
	this.plazaextra=plazaextra;
	this.capacidadextra=capacidadextra;
	
		
	}
	
	public String   dimeDatosFurgoneta () {
		
return "la plaza de la furgoneta son:"+plazaextra+"mas la capacidad extra"+ capacidadextra;
		
	}

}
