package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner(System.in);
		int rango;
		do {
			System.out.println("ingrese un numero entre [5,10]: ");
			rango =datos.nextInt();
		} while (rango <5 || rango>10);
		String []nombre = new String [rango];
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("ingrese nombre posicion "+i+": ");
			nombre[i]=datos.next();
		}
		// muestra la lista desde la primera posicion
		System.out.println("lista desde la primera posicion");
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("posicion "+i+": "+nombre[i]);
		}
		System.out.println("muestra la lista desde la ultima posision");
		for (int i = nombre.length -1; i >=0; i--) {
			System.out.println("muestra la lista desde la ultima posicion "+i+": "+ nombre[i]);
			
		}
		datos.close();
	}

}
