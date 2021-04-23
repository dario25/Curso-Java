package poo1;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		//Empleado empleado1=new Empleado ("juan",8500,1998,03,29);
		//Empleado empleado2=new Empleado ("nico",9400,1999,12,29);
		//Empleado empleado3=new Empleado ("Diego",1500,1998,04,29);

		//empleado1.subesueldo(5);
		//empleado2.subesueldo(5);
		//empleado3.subesueldo(5);
		/*System.out.println("npmbre"+empleado1.damenombre()+"sueldo"+empleado1.damesueldo()+empleado1.damefechacontrato());
		System.out.println("npmbre"+empleado2.damenombre()+"sueldo"+empleado2.damesueldo()+empleado2.damefechacontrato());
		System.out.println("npmbre"+empleado3.damenombre()+"sueldo"+empleado3.damesueldo()+empleado3.damefechacontrato());

		*/

		//for (int i=0; i<3;i++) {
//			misEmpleado[1].subesueldo(5);
		//}
		/*for (int i=0;i<3;i++) {
			

			System.out.println("nombree"+misEmpleado[i].damenombre()+"suedo"+misEmpleado[i].damesueldo()+
				
					"alta" +misEmpleado[i].damefechacontrato()); */
			
		
        Jefatura jeferecursohumano=new  Jefatura("Dario", 130000,2019,03,19);
        jeferecursohumano.estableceIncentivo(2000);
		Empleado[] misEmpleado= new Empleado [6];
		misEmpleado[0] = new Empleado("juan ",8500,1998,03,29);
		misEmpleado[1]= new Empleado ("nico",9400,1999,12,29);
		misEmpleado [2]= new Empleado ("Diego",1500,1998,04,29);
          misEmpleado[3]=new Empleado("Juan");
          misEmpleado[4]=jeferecursohumano;// polimorfisfo//principio de sustituccion 
          misEmpleado[5]=new  Jefatura ("Nanada ",18000,20000,12,19);
         Jefatura Jefe_finanza=(Jefatura)misEmpleado[5];
       Jefe_finanza.estableceIncentivo(2000);
// Ejempolo de interfaz de herencia    //  Empleado director_comercial= new Jefatura ("Marcosw Antoni",19000,1998,12,1);
    //   Comparable ejemplo=new  Empleado ("Adrian Antoni",1080,1998,12,1);
       System.out.println(Jefe_finanza.tomaDecisiones("mas dia de vacaciones"));
    
	       //ordenado 
     Arrays.sort(misEmpleado);
for (Empleado e : misEmpleado) {
	e.subesueldo(5);
}
for (Empleado e: misEmpleado) {
	System.out.println("nombree:"+e.damenombre()+":sueldo:"+e.damesueldo()+
			
			"alta:" +e.damefechacontrato());
}
}
	}

	

class Empleado implements Comparable {
	
	public Empleado  (String nom,double sue,int agnos,int mes,int dias) {
			nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario= new GregorianCalendar (agnos,mes-1,dias);
	altacontrato=calendario.getTime();
	++idsiguente;
	id=idsiguente;

		
		
	}
	public Empleado (String nom) {
		this(nom,12000,1998,3,12);
		 
		
	}
	public String damenombre () {
		
		return nombre+"el id es:"+id;
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
	public int compareTo (Object  miObjeto) {
		Empleado otroEmpleado=(Empleado) miObjeto;
	
		if(this.sueldo<otroEmpleado.sueldo) {
			return  -1;
		
		
				}
		
		if (this.sueldo>otroEmpleado.sueldo) {
			return  1;
			
		}
		return 0;
	}
	
	private String nombre;
	private double sueldo;
	 private Date   altacontrato;
	 private int id ;
	 private static int idsiguente=1;
	
}
 class Jefatura extends Empleado implements Jefe{ 
public  Jefatura  (String nom, double sue, int años,int mes, int dias  )  {
	super(nom,sue,años,mes,dias);
	
	
}
public String  tomaDecisiones (String descripcion) {
	return "un miembre de la junta directiva tomo la decision"+descripcion;
}
public void estableceIncentivo (double b) {
	incentivo=b;
	
}
public double  damesueldo (  ) {
	double sueldojefe=super.damesueldo ();
	return sueldojefe+incentivo;
}

private double incentivo;  
	
 }
class Director extends Jefatura implements Jefe {
public Director (String nom,double sue,int años,int mes,int dias){
	super(nom,sue,años,mes,dias);
}
}

