package testRun;

public class Humano extends Creature {

	public String nombre;
	
	public Humano() {
		// TODO Auto-generated constructor stub
		super();
		setNombre("");
		setEdad(0);
	}
	
	public Humano(String Nombre, int Edad) {
		// TODO Auto-generated constructor stub
		setNombre(Nombre);
		setEdad(Edad);
	}	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void raza()
	{
		System.out.println("Hola soy" + this.nombre);
		System.out.println("tengo " +  super.edad  + "de edad");
		
	}

}
