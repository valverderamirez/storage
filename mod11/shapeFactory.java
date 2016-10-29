package mod11;

public class shapeFactory {

	public shape  getShape (String tipo){
		// TODO Auto-generated constructor stub
	
	if (tipo.equals("circulo"))
	{  return new circle();}
	else if (tipo.equals("cuadrado"))
	{  return new square();}
	else if (tipo.equals("rectangulo"))
	{ return new rectangle();}
		return null;
	
	
	}

}
