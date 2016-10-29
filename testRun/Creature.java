package testRun;

public abstract class Creature {

	protected int edad;
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	
	public void raza ()
	{
		System.out.println("criatura");
		
	}
	
	public Creature() {
		// TODO Auto-generated constructor stub
	}

}
