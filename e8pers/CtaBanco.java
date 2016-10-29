package e8pers;

public class CtaBanco {

	private String nombre;
	private double fondos;
	
	public CtaBanco(String nombre, double fondos) {
		this.nombre=nombre;
		this.fondos=fondos;		
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void retiro (double cantidad ) throws withdrawException	
	{
		if (this.fondos <cantidad)
		{
			throw new  withdrawException ("no tiene suficientes fondos");
		}
		else
		{
			this.fondos-=cantidad;
		}
		
	}

}
