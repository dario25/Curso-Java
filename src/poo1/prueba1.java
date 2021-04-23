package poo1;

public class prueba1 {

	public static void main(String[] args) {
Empleado1 trabajador1 = new Empleado1("Juan");
Empleado1 trabajador2=new Empleado1	 ("Manuel");
Empleado1 trabajador3=new Empleado1 ("Luis") ;
Empleado1 trabajador4=new Empleado1 ("Luis") ;
trabajador1.cambiaseccion("Rhh");
	System.out.println (trabajador1.devuelveDato()+"/n"+trabajador2.devuelveDato()+"/n"
+trabajador3.devuelveDato()+"/n"+trabajador4.devuelveDato());	
System.out.println(Empleado1.DameIdSiguente());
	
	;

}
}
      /*  class Empleado{
		public Empleado (String nom) {
			nombre=nom;
			seccion="adminitracio";
		}
		public void cambiaseccion(String seccion) {
            this.cambiaseccion(seccion);		}
		
		 
		
		

	
	public String  devuelveDato() {
		
		return "el nombre es"+nombre+"la seccion es :"+seccion;	
	}
	private String nombre;
	private String seccion;
	*/
