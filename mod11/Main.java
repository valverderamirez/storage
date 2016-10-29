/**
 * 
 */
package mod11;
//patterrn factory
/**
 * @author JAVA
 *
 */
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shapeFactory sf= new shapeFactory();

		shape s1 =sf.getShape("circulo");
			s1.draw();

    	shape s2 =sf.getShape("cuadrado");
			s2.draw();

		shape s3 =sf.getShape("rectangulo");
			s3.draw();

	}

}
