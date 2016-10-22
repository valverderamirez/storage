package testRun;

import java.util.Scanner;


public class lab {

	
	public static void main(String[] args) {
	
		
		// daysf ();
		 
		 //rangos ();
		//arrays();
		cube_1();
	}
	
	public static  void  daysf ()
	{
		String[] dias= {"Lunes",
				"Martes",
				"Miercoles",
				"Jueves",
				"Viernes",
				"Sabado",
				"Domingo"};
		
		
		for (String dia:dias)
		{
			System.out.println(dia);
		}
			
	}

	
	public static void cube_1()
	{
		
		
   int [] [] [] cubo= new int [3] [3] [3];
   int n=0;
   
   for (int prof=0; prof < cubo.length; prof++)
   {  
		for ( int fila=0; fila < cubo[prof].length ; fila++)
		{
			for  (int col =0; col< cubo[prof] [fila].length ; col++)
			{
				cubo [prof] [fila] [col]=++n;
				System.out.print(cubo [prof] [fila] [col] + " ");				
			}
			
			System.out.println();
		}
   }	
		
	}
	
	public static void arrays()
	{
		int[] v1 = {1,2,3,4};
		
		int[] v2= new int [v1.length ];
		
   int [] [] a1={
		   		{1,2,3},
		   		{4,5,6},
		   		{7,8,9}
   				};
		for ( int fila=0; fila < a1.length; fila++)
		{
			for  (int col =0; col< a1[fila].length ; col++)
			{
				System.out.print(a1[fila][col] + " ");				
			}
			
			System.out.println();
		}
		
		
	}
	
	public static void  rangos ()
	{
		
		Scanner inputs =new Scanner(System.in, "UTF-8");


		   System.out.println();
		   System.out.print("Definir rango número inicial:  ");
		   int lim1= inputs.nextInt();
		   
		   System.out.println();
		   System.out.print("Definir rango número final:  ");
		   int lim2= inputs.nextInt();

		   		   
		   System.out.print("Digite numero de opción:  ");

		   
		   int numeros= inputs.nextInt();
		   
		   switch (numeros)
		   {
		   case 1:
		  		opcion1 (lim1, lim2);	  
			   break;
		   case 2: 
			   opcion2 (lim1, lim2);
			   break;
		   case 3:
			   opcion3 (lim1, lim2);
			   break;
		   default:
			   
			   System.out.println("Mamaste número nada que ver");
			   break;
		   }
	}
	
	
	public static void  opcion1 (int lm1 , int lm2 )
	{  int i=lm1;
		   System.out.println("Opcion 1 - while");
		   System.out.print("Numeros: ");
		   while  (i++<lm2)
		   {
			   if ((i%7==0 )  && (i%11==0))
			   {
				   
				   System.out.print(i + " , ");
			   }
			   
			   continue;
			   
		   }			
	}
	
	public static void opcion2 (int lm1 , int lm2 )
	{  int i=lm1;
	   System.out.println("Opcion 2 - do while");
	   System.out.print("Numeros: ");
	   do
	   {
		   if ((i%7==0 )  && (i%11==0))
		   {
			   
			   System.out.print(i + " , ");
		   }
		   
		   continue;
		   
	   }	
	   while  (i++<lm2);		
	}	
	
	public static void opcion3 (int lm1 , int lm2 )
	{ int i;
		   System.out.println("Opcion 3 - for");
		   System.out.print("Numeros: ");
		   for (i=lm1; i< lm2; i++)
		   {
			   if ((i%7==0 )  && (i%11==0))
			   {
				   
				   System.out.print(i + " , ");
			   }
			   
			   continue;
			   
		   }	
	}
}
