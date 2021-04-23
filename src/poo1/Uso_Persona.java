package poo1;

import java.util.*;


public  class Uso_Persona {

	public static void main(String[] args) {

Persona [] lasPersonas1=new Persona [2];
lasPersonas1[0] =new Empleado2("Luis conde",50000,2000,02,25);


lasPersonas1[1]= new Alumnos2 ("darui","filosofia");

for  (Persona p:lasPersonas1) {
	System.out.println(p.dameNombre()+""+p.dameDescripcion());
	
	
}



	}

}

class Empleado2 extends Persona {
	
	public Empleado2  (String nom ,double sue,int agnos,int mes, int dias) {
			
		super (nom);
		sueldo=sue;
		++idsiguente;
		id=idsiguente;
		GregorianCalendar calendario= new GregorianCalendar (agnos,mes-1,dias);
	altacontrato=calendario.getTime();
	 

		
	}
	public String dameDescripcion () {
		return "este empleado tiene un"+id+"con un sueldo igual"+sueldo;
				
	}
	
	public  double damesueldo( ) {
		
		return sueldo;
	}
	public  Date damefechacontrato( ) {
		
		return altacontrato;
	}public void subesueldo (double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
		
	}
	
	
	private String nombre;
	private double sueldo;
	 private Date   altacontrato;
	 private int id ;
	 private  int  idsiguente=1;
	
}


 abstract class Persona  {
	 
	 public Persona  (String nom){      
		  nombre =nom;
		  
	 }
	 public String  dameNombre () {
		 return nombre;
	 }
	 public abstract String dameDescripcion(); 
	 private String nombre ; 
		 
 }
class Alumnos2 extends Persona {
	public Alumnos2 (String nom,String car) {
		super (nom);
		
		carrera=car;
		
	}
	public String  dameDescripcion () {
		return"rdte alumno estudia la carrera de:"+carrera;
	}
	 private String carrera;


}
