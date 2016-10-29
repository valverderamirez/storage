package testRun;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   int x=12;
   int y=10;
   y +=5;
   
   String.valueOf(y);
   
   Object a=null;
   
   if (a !=null  && ((int)a)>5)
   {
	   System.out.println("ok");
   }
	   Scanner input =new Scanner(System.in, "UTF-8");
	   System.out.print("Digite una palabra:  ");
	   String palabra = input.nextLine();
	   
	   
	   System.out.println("La palabra digitada es: "+ palabra);
//////////////////////////////////////////////////////////////////////////	   
	   Scanner input2 =new Scanner(System.in, "UTF-8");
	   System.out.print("Digite un numero:  ");
	   
	   int numero= input2.nextInt();
	   
	   if (numero >0 && numero <=10)
	   {
		   System.out.println("Intervalo entre 0 y 10");
	   }
	   else if  (numero >10 && numero <50 )
	   	{System.out.println("Intervalo entre 11 y 50");}
	   else 
	   {
		   System.out.println("Intervalo diferente");
		   
	   }
	   
////////////////////////////////////////////////////////////////
	   Scanner input3 =new Scanner(System.in, "UTF-8");
	   System.out.print("Digite un numero:  ");
	   int numero2= input3.nextInt();
	   
	   
	   switch (numero2)
	   {
	   case 1:  ///en 1 y en 10 haria lo  mismo como no tiene break
	   case 10:
		   System.out.println("Lunes");
	   break;
	   case 21:
		   System.out.println("Martes");
	   break;   
	   default:
		   System.out.println("Desconocido");
		   break;
	   }
	   
	   
	   
//////////////////////////////////////////////////////////////	   
		//System.out.println("Hola: " + String.valueOf(y));

		
	}

}
