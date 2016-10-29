/**
 * 
 */
package testRun;

/**
 * @author JAVA
 *
 */
public class animal {

	private String nombre;
	private int edad;
	private float altura;
	/**
	 * 
	 */
	public animal() {
		// TODO Auto-generated constructor stub
		this.nombre="";
		this.edad=0;
	}
	
	public animal(String nombre, int edad) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.edad=edad;
	}
	
		public void ladrar()
		{
			System.out.println("Nombre" + this.nombre);
			System.out.println(edad + "años de edad");
		}



}
