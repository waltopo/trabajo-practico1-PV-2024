package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Promedio {

 double promedio=0;

	public static void main(String[] args) {
		
		Scanner numero=new Scanner(System.in);
	
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		double promedio;
		System.out.println("ingrese primer numero");
	
		int numero1=numero.nextInt();
		System.out.println("ingrese segundo numero ");
		numero2=numero.nextInt();
		System.out.println("ingrese tercer numero");
		numero3=numero.nextInt();
		System.out.println("ingrese cuarto numero");
		numero4=numero.nextInt();
		System.out.println("ingrese quinto numero");
		numero5=numero.nextInt();
		
		 promedio =(numero1+numero2+numero3+numero4+numero5) /5;
		System.out.println("el promedio es: "+promedio);
		
		numero.close();
		
	}

}
