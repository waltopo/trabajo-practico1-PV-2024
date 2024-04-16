package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos= new Scanner(System.in);
		Persona persona1=new Persona();
		System.out.println("ingrese DNI: ");
		persona1.setDni(datos.nextLine());
		System.out.println("ingresar Nombre: ");
		persona1.setNombre(datos.nextLine());
		System.out.println("ingrese fecha de nacimiento(formato:año-mes-dia): ");
		LocalDate fecha_de_nacimiento1=LocalDate.parse(datos.nextLine());
		persona1.setFecha_de_nacimienro(fecha_de_nacimiento1);
		System.out.print("Ingrese Provincia: "); 
		persona1.setProvincia(datos.nextLine());
		System.out.println("Persona1");
		persona1.mostrarDatos();
		
		
		System.out.println("ingrese DNI: ");
		String dni=datos.nextLine();
		System.out.println("ingresar Nombre: ");
		String Nombre2=datos.nextLine();
		System.out.println("ingrese fecha de nacimiento(formato:aaaa-mm-dd): ");
		LocalDate fecha_de_nacimiento2=LocalDate.parse(datos.nextLine());
		System.out.print("Ingrese Provincia: ");
		String Provincia2=datos.nextLine();
		System.out.println("Persona2");
		Persona persona2=new Persona(dni, Nombre2, fecha_de_nacimiento2, Provincia2);
		persona2.mostrarDatos();
		datos.close();
	}
	
}
