package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;


import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos=new Scanner(System.in);
		System.out.println("ingresar nombre");
		String nombre=datos.nextLine();
		System.out.println("ingrese legajo");
		int legajo=datos.nextInt();
		System.out.println("ingrese salario");
		double salario= datos.nextDouble();
		Empleado empleado1= new Empleado(nombre, legajo, salario);
		System.out.println("salario sin aumento");
		empleado1.mostrarDatos();
		empleado1.dar_aumento();
		System.out.println("salario con aumento");
		empleado1.mostrarDatos();
		
		
		datos.close();
	}

}
