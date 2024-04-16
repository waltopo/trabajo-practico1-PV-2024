package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;




public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato =new Scanner(System.in);
		int numero , factorial ,a ;
		System.out.println("ingrese un numero");
		numero=dato.nextInt();
		factorial=1;
		a=numero;
		while (a>0) {
		
			factorial=(factorial*a);
			a --;
		}
		System.out.println();
		System.out.println("el factorial es: "+ numero + "!" + "="  + factorial );
		dato.close();
	}

}
