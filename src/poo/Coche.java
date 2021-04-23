package poo;

public class Coche {
	// propiedad comunes y otra caracteristica de cada objeto
	
	private int rueda;
	private int largo;
	private int ancho;
     private int motor;
    private   int peso_plataforma ;
    private String color ;
   private  int  peso_total;
    private boolean asiento_cuero ,climatizador;
      
	public  Coche ()  {
		rueda=4;
		largo=2000;
		ancho=300;
		motor=3600;
		peso_plataforma=500;
		
	}
	public String dime_datosgenerales ()
	{
		return "la plataforma tiene"+rueda+
			"mide"+largo/1000+"metro de anchoe"+ancho+"cm peso plataforma"+peso_plataforma+"kilo";
	}
	public void establece_color (String color_coche) {
	
		color=color_coche;
	}
	
public String dime_color( ) {
	
	return " el color de coche es"+color;
}
//setter
public void  configura_asiento (String asiento_cuero ) {
if (asiento_cuero.equalsIgnoreCase("si")) {
	this.asiento_cuero=true;

	
	
}
	
else {
	this.asiento_cuero=false; 	
}
}
public String dime_asientocuero ( ) {
	
	if (asiento_cuero==true) {
		return "elcoche tiene asiento de cuero";
		
	
	}
	else {
		return "el coche tiene asiento de  serie ";
	}
}
public void configura_climitazador(String climatizador) {

if (climatizador.equalsIgnoreCase("si")) {
	this.climatizador=true;
	
}
else {
	this.climatizador=false;
}
}
public  String  dime_climatizador() {
	
	if(climatizador==true) {
		return "tiene climatizador";
	
	}else { 
		return "tiene aiere acondicionado";
		
	}
	
}
public String  dime_peso_coche ( ) {
	
int peso_caroceria=500;
peso_total=peso_total+peso_caroceria;
if (asiento_cuero=true) {
	
	peso_total=peso_total+peso_total+50;
}
if (climatizador==true) {
	peso_total=peso_total+20;
}
return "es el peso coche es"+peso_total;
}
public int precio_coche () {
	int precio_final=10000;
	if (asiento_cuero==true)
	{
		precio_final+=2500;
	}
	if (climatizador==true) {
		precio_final+=20000;
		
	}
	return precio_final;
}
}

