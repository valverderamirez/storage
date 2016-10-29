/**
 * 
 */
package clases;

/**
 * @author JAVA
 *
 */
public class mascota {

	/**
	 * 
	 */
	protected String nombre;
	protected int edad;
	public mascota() {
		// TODO Auto-generated constructor stub

	 this.nombre="";
	 this.edad=0;
	}
	

	public mascota(String nombre, int edad) {
		// TODO Auto-generated constructor stub
	this();
	 this.nombre=nombre;
	 this.edad=edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
   public void  presentarse()
   {
	   
	   System.out.println("Hola: " + this.nombre);
	   System.out.println("Tengo: " + this.edad + " de edad");
	   
   }

}
