package testRun;

public class method {

	public static void main (String[] args)
	{
		
	/*	int[] array= {1,2,3};
	  hola();	
	print(7);
	print(array) ;
	*/
	///////////////////////
	
	int numero=7;
	print(numero);
	System.out.println(numero);
	
	
	Persona p= new Persona();
	p.setPersona(12);
	System.out.println("antes de llamada: " + p.getPersona() );
	print(p);
	
	System.out.println(p.getPersona());
	
	
	imprimirpalabras ("a","b","c","d","e");
	
	}
	
	
	public static void imprimirpalabras (String... palabras)
	{
		for (String palabra : palabras)
		{
			System.out.println(palabra);
			
		}
		
	}
	
	public static void hola()
	{
		
		System.out.println("hola");
		
	}
	
	public static void print(Persona p)
	{
		p.setPersona(p.getPersona()+1);
		System.out.println(p.getPersona());
		
	}
	
	public static void print(int numero)
	{
		numero++;
		System.out.println(numero);
		
	}
	
	
	public static void print(int[] numeros)
	{
		for ( int i=0; i < numeros.length; i++)
		{
				System.out.println(numeros[i]);
		}
	}
	
}


 class Persona
{
	
private int edad;


public Persona ()
{
	 
}

public Persona (int edad)
{
	 this.edad=edad;
}

public void setPersona(int edad)
{
  this.edad=edad;	
}

public int getPersona()
{
 return this.edad;	

}

}