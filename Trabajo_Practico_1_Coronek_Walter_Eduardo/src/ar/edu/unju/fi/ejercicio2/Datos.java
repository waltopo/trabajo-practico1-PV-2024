package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;


public class Datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dato = new Scanner(System.in);
		//ingresa los datps pedidos al usuario
		System.out.println("ingrese Pais");
		String pais=dato.nextLine();
		System.out.println("ingrese telefono");
		String telefono=dato.nextLine();
		System.out.println("ingrese edad");
		int edad=dato.nextInt();
		System.out.println("ingrese altura del edeficio");
		double altura=dato.nextDouble();
		System.out.println("ingrese precio");
		double precio=dato.nextDouble();
		
		
		System.out.println("ingrese grado del angulo");
		double grado=dato.nextInt();
		// resuelve el coseno del grado pedido
		double resultado=Math.cos(grado);
		
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
