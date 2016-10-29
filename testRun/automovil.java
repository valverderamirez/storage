package testRun;

public class automovil {

	public static int numeroAutos=0;
	
	private String marca;
	private String modelo;
	
	public automovil()
	{
		marca="";
		modelo="";
		numeroAutos++;
		// TODO Auto-generated constructor stub
	}
	
	public automovil(String marca, String modelo)
	{
		// TODO Auto-generated constructor stub
		this();
		this.marca=marca;
		this.modelo=modelo;
	}
	
	public int getnumeroAutos ()
	{
		return numeroAutos;
	}
	
	
}
