package EjercicodeEstructura;

public class ClaseString {

	public static void main(String[] args) {
String nombre="dario";
System.out.println("mi nombre es "  +nombre);
// devuelve la cantidad de la letra
System.out.println("mi nombre es "  +nombre.length() +"la letra");
System.out.println("la primera letra de mi nombre es " +nombre + "  primera letra" +nombre.charAt(0));
int ultima_letra;
ultima_letra=nombre.length();
System.out.println ("la ultima letra  "+nombre.charAt(ultima_letra -1));

	}

}
