package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;



import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Pincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner datos = new Scanner(System.in);

	        System.out.println("Ingrese  nombre:");
	        String nombre = datos.nextLine();

	        System.out.println("Ingrese la fecha de nacimiento (en formato dd/mm/aaaa):");
	        String fechaStr = datos.nextLine();
	        String[] fechaPartes = fechaStr.split("/");
	        int dia = Integer.parseInt(fechaPartes[0]);
	        int mes = Integer.parseInt(fechaPartes[1]) - 1; // Los meses en Calendar van de 0 a 11
	        int año = Integer.parseInt(fechaPartes[2]);

	        Calendar fechaNacimiento = Calendar.getInstance();
	        fechaNacimiento.set(año, mes, dia);

	        Persona persona = new Persona(nombre, fechaNacimiento);

	        System.out.println("Datos de la persona:");
	        System.out.println("Nombre: " + persona.getNombre());
	        System.out.println("Fecha de nacimiento: " + dia + "/" + (mes + 1) + "/" + año);
	        System.out.println("Edad: " + persona.CalcularEdad() + " años");
	        System.out.println("Signo del zodiaco: " + persona.obtenerSigno());
	        System.out.println("Estación del año : " + persona.obtenerEstacion());//nos da las estaciones segun el emiferio sur

	        datos.close();
	    }
	}
