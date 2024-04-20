package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numeros=new Scanner(System.in);
		int rango;
		do {
			System.out.println("ingrese un numero entero en rango[3,10]");
			rango=numeros.nextInt();
		} while (rango<3||rango>10);
		int []numero=new int[rango];
		for (int i = 0; i < numero.length; i++) {
			System.out.println("ingre un numero posicion "+i+": ");
			numero[i]=numeros.nextInt();
		}
		int suma=0;
		for (int i = 0; i < numero.length; i++) {
			System.out.println("valor de la posicion "+i+": "+numero[i]);
			suma+=numero[i];
		}
		System.out.println("suma de todos los numeros: "+suma);
		numeros.close();
	}

}
