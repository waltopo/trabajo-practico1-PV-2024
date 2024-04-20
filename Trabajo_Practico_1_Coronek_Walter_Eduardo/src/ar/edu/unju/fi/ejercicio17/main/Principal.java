package ar.edu.unju.fi.ejercicio17.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stkub
		Scanner datos=new Scanner(System.in);
		ArrayList<Jugador> jugadores =new ArrayList<>();
		int opcion;
		do {
			System.out.println("\nMenú de opciones:");
            System.out.println("1 - Alta de jugador");
            System.out.println("2 - Mostrar los datos del jugador");
            System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 - Modificar los datos de un jugador");
            System.out.println("5 - Eliminar un jugador");
            System.out.println("6 - Mostrar la cantidad total de jugadores");
            System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion=datos.nextInt();
            datos.nextLine();
            switch (opcion) {
			case 1: {
				// Alta de jugador
                System.out.println("\nAlta de jugador:");
                System.out.print("Nombre: ");
                String nombre = datos.nextLine();
                System.out.print("Apellido: ");
                String apellido = datos.nextLine();
                System.out.print("Fecha de nacimiento (en formato dd/mm/aaaa): ");
                String fechaStr = datos.nextLine();
                String[] fechaPartes = fechaStr.split("/");
                int dia = Integer.parseInt(fechaPartes[0]);
                int mes = Integer.parseInt(fechaPartes[1]) - 1; // Los meses en Calendar van de 0 a 11
                int año = Integer.parseInt(fechaPartes[2]);
                Calendar fechaNacimiento = Calendar.getInstance();
                fechaNacimiento.set(año, mes, dia);
                System.out.print("Nacionalidad: ");
                String nacionalidad = datos.nextLine();
                System.out.print("Estatura: ");
                double estatura = datos.nextDouble();
                System.out.print("Peso: ");
                double peso = datos.nextDouble();
                datos.nextLine(); // Consumir la nueva línea después de leer el número
                System.out.print("Posición (delantero, medio, defensa, arquero): ");
                String posicion = datos.nextLine();

                Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
                jugadores.add(jugador);
                System.out.println("Jugador agregado con éxito.");
                break;
                  
			}
			case 2:{
				 // Mostrar los datos del jugador
                System.out.println("\nMostrar los datos del jugador:");
                System.out.print("Ingrese el nombre del jugador: ");
                String nombreBuscar = datos.nextLine();
                System.out.print("Ingrese el apellido del jugador: ");
                String apellidoBuscar = datos.nextLine();
                boolean encontrado = false;
                for (Jugador j : jugadores) {
                    if (j.getNombre().equalsIgnoreCase(nombreBuscar) && j.getApellido().equalsIgnoreCase(apellidoBuscar)) {
                        System.out.println("Datos del jugador:");
                        System.out.println("Nombre: " + j.getNombre());
                        System.out.println("Apellido: " + j.getApellido());
                        System.out.println("Fecha de nacimiento: " + j.getFechaNacimiento().get(Calendar.DATE) + "/" + (j.getFechaNacimiento().get(Calendar.MONTH) + 1) + "/" + j.getFechaNacimiento().get(Calendar.YEAR));
                        System.out.println("Nacionalidad: " + j.getNacionalidad());
                        System.out.println("Estatura: " + j.getAltura());
                        System.out.println("Peso: " + j.getPeso());
                        System.out.println("Posición: " + j.getPosicion());
                        System.out.println("Edad: " + j.juegadorEdad());
                        encontrado = true;
                        break;
                    }
                    
                }
                if (!encontrado) {
                    System.out.println("Jugador no encontrado.");
                }
                break;
               
			}
			case 3:{
				// Mostrar todos los jugadores ordenados por apellido
                System.out.println("\nMostrar todos los jugadores ordenados por apellido:");
                if (jugadores.isEmpty()) {
                    System.out.println("No hay jugadores registrados.");
                } else {
                    Collections.sort(jugadores, (j1, j2) -> j1.getApellido().compareToIgnoreCase(j2.getApellido()));
                    for (Jugador j : jugadores) {
                        System.out.println(j.getApellido() + ", " + j.getNombre());
                    }
                }
                break;
			}
			case 4:{
				// Modificar los datos de un jugador
                System.out.println("\nModificar los datos de un jugador:");
                System.out.print("Ingrese el nombre del jugador: ");
                String nombreModificar = datos.nextLine();
                System.out.print("Ingrese el apellido del jugador: ");
                String apellidoModificar = datos.nextLine();
                boolean encontradoModificar = false;
                for (Jugador j : jugadores) {
                    if (j.getNombre().equalsIgnoreCase(nombreModificar) && j.getApellido().equalsIgnoreCase(apellidoModificar)) {
                        System.out.print("Nueva nacionalidad: ");
                        j.setNacionalidad(datos.nextLine());
                        System.out.println("nueva estatura: ");
                        j.setAltura(datos.nextDouble()); 
                        System.out.println("nueva posicion: ");
                       j.setPosicion(datos.nextLine());
                       System.out.println("nuevo peso: ");
                       j.setPeso(datos.nextDouble());
                        System.out.println("Datos modificados con éxito.");
                        encontradoModificar = true;
                        break;
                    }
                }
                if (!encontradoModificar) {
                    System.out.println("Jugador no encontrado.");
                }
                break;
			}
			case 5:{
				// Eliminar un jugador
                System.out.println("\nEliminar un jugador:");
                System.out.print("Ingrese el nombre del jugador: ");
                String nombreEliminar = datos.nextLine();
                System.out.print("Ingrese el apellido del jugador: ");
                String apellidoEliminar = datos.nextLine();
                Iterator<Jugador> iter = jugadores.iterator();
                while (iter.hasNext()) {
                    Jugador j = iter.next();
                    if (j.getNombre().equalsIgnoreCase(nombreEliminar) && j.getApellido().equalsIgnoreCase(apellidoEliminar)) {
                        iter.remove();
                        System.out.println("Jugador eliminado con éxito.");
                        break;
                    }
                }
                break;
			}
			case 6:{
				// Mostrar la cantidad total de jugadores
                System.out.println("\nCantidad total de jugadores: " + jugadores.size());
                break;
			}
			case 7:{
				// Mostrar la cantidad de jugadores que pertenecen a una nacionalidad
                System.out.println("\nMostrar la cantidad de jugadores que pertenecen a una nacionalidad:");
                System.out.print("Ingrese la nacionalidad: ");
                String nacionalidadBuscar = datos.nextLine();
                int contador = 0;
                for (Jugador j : jugadores) {
                    if (j.getNacionalidad().equalsIgnoreCase(nacionalidadBuscar)) {
                        contador++;
                    }
                }
                System.out.println("Cantidad de jugadores de la nacionalidad " + nacionalidadBuscar + ": " + contador);
                break;

			}
			case 8:{
				// Salir
                System.out.println("Saliendo del programa...");
                break;
                }
                default:
				System.out.println("\nopcion invalida intente de nuevo");
			
			}
			
		} while (opcion !=8);
		datos.close();
	}

}
