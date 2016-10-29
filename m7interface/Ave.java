package m7interface;

public class Ave implements iDesplazable{

	public String tipo;
	
	public Ave() {
		// TODO Auto-generated constructor stub
				
	}

	public Ave(String tipo) {
		// TODO Auto-generated constructor stub
				this.tipo=tipo;
	}

	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		System.out.println("el ave esta volando");
		
	}

	@Override
	public void moverse(int distancia) {
		// TODO Auto-generated method stub
		System.out.println("el ave esta volando" +  distancia + " metros");
	}

	
}
