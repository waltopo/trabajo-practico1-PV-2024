package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;


public class Datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dato = new Scanner(System.in);
		String pais;
		int edad;
		double altura;
		double precio;
		String  telefono;
		double grado;
		double resultado;
		System.out.println("ingrese Pais");
		pais=dato.nextLine();
		System.out.println("ingrese telefono");
		telefono=dato.nextLine();
		System.out.println("ingrese edad");
		edad=dato.nextInt();
		System.out.println("ingrese altura del edeficio");
		altura=dato.nextDouble();
		System.out.println("ingrese precio");
		precio=dato.nextDouble();
		
		
		System.out.println("ingrese grado del angulo");
		grado=dato.nextInt();
		
		resultado=Math.cos(grado);
		
		System.out.println("pais ingresado es: " + pais);
		System.out.println("edad ingresada es: "+ edad);
		System.out.println("altura del edificio es: "+ altura);
		System.out.println("precio ingresado es: "+precio);
		System.out.println("telefono ingresado es:"+telefono);
		System.out.println("gredo ingresado es: "+grado);
		System.out.println("resultado del coseno es: "+resultado);
		
		dato.close();
	}

}
