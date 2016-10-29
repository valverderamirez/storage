package m7interface;

public class Persona implements iDesplazable {

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void moverse() {
		System.out.println("moverse");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverse(int distancia) {
		// TODO Auto-generated method stub
		System.out.println("moverse sobrecargado");
	}



}
