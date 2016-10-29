package testRun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

import m7interface.Ave;



public class lab {

	
	public static void main(String[] args) {
	
		
		// daysf ();
		 //rangos ();
		//arrays();
		//cube_1();
		//lab1();
		
		/*animal m1 = new animal ("animal",12);
		m1.ladrar();
		*/
		
		/*
		gato  migato=  new gato("minino",4,"felino" );
		
		migato.presentarse();
		migato.miRaza();
		*/
		/*
		automovil a1= new automovil ("BMW","3251");
		System.out.print(a1.getnumeroAutos());

		automovil a2= new automovil ("AUDI","TT");
		System.out.print(a2.getnumeroAutos());


		 */

			Humano h1 = new  Humano("h1",23);

			Ave a1= new Ave();
			a1.moverse();
			
			String[] palabras= {"Randal","Vargas","Li","Hola", "Que tal"};
			Arrays.sort(palabras);
			
			for (String p : palabras)
			{
				 System.out.println (p);
				
			}
			
			ArrayList<String> personas=  new ArrayList();
			personas.add("ejemplos");
			personas.add("ron");
			
			HashSet<String> st = new HashSet<String>();
			st.add("ram");
			st.add("ril");			
			st.add("ops");			
			st.add("tuis");
			st.add("tyer");			
						
			//List<integer> numeros = new ArrayList<Integer>(Arrays.asList(1,2.3.4));//
			int number=60000000;
			String concatenartor="frase x";
					String str="";
			StringBuilder sb = new StringBuilder();
			long start= System.currentTimeMillis();
			
			for (int i=0; i  <number; i++)
			{
				
				sb.append(concatenartor);
			}
			long end2= System.currentTimeMillis();
			long result=end2-start;
			
			System.out.println("tiempo: " + result);
			
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


	public static void lab1()
	{
int[] [] a1 = new int [4][4];
		

		for ( int fila=0; fila < a1.length; fila++)
		{
			for  (int col =0; col< a1[fila].length ; col++)
			{
				//System.out.print(a1[fila][col] + " ");
				
				a1[fila][col]=(int) (Math.random()*25+1);
				
				//System.out.print(a1[fila][col] + " ");

			}
			
			//System.out.println();
		}	
		
		for ( int fila=0; fila < a1.length; fila++)
		{
			for  (int col =0; col< a1[fila].length ; col++)
			{
				
				if (a1[fila][col] % 2 == 0)
					{
					a1[fila][col]=0;
					}
				//System.out.print(a1[fila][col] + " ");
			}
			
			//System.out.println();
		}	

		for ( int fila=0; fila < a1.length; fila++)
		{
			for  (int col =0; col< a1[fila].length ; col++)
			{
				
				System.out.print(a1[fila][col] + " ");
			}
			
			System.out.println();
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
