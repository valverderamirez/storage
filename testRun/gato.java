package testRun;

import clases.mascota;

public class gato extends mascota {

	private String raza;
	
	public gato() {
		// TODO Auto-generated constructor stub
		super();  //llamar el constructur de la clase padre
		
	}

	public  gato(String nombre, int edad, String raza)
	{
		super(nombre, edad);  //llamar constructor clase padre
		this.setRaza(raza);
		
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public void miRaza()
	{
		System.out.println("Mi raza: " + this.raza);
		
	}
}
