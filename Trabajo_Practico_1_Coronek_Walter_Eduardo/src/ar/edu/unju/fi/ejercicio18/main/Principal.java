package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Principal {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pais> paises=new ArrayList<>();
		List<DestinoTuristico> destinos=new ArrayList<>();
		paises.add(new Pais(1, "Italia"));
		paises.add(new Pais(2, "Francia"));
		paises.add(new Pais(3, "Japon"));
		Scanner datos =new Scanner(System.in);
		int opcion=0;
		do {
			System.out.println("MENU");
			System.out.println("1 Alta de destino turistico");
			System.out.println("2 Mostrar todos los destinos turisticos");
			System.out.println("3 Modificar el pais de un destino turistico");
			System.out.println("4 Limpiar la lista de destinos turisticos");
			System.out.println("5 Eliminar un destino turisticos");
			System.out.println("6 Mostrar destinos turisticos ordenados por nombre");
			System.out.println("7 Mostrar todos los paises");
			System.out.println("8 Mostrar los destinos turisticos de un pais");
			System.out.println("9 salir");
			
			try {
                opcion = datos.nextInt();
               datos.nextLine(); // 

                switch (opcion) {
                    case 1:
                        altaDestinoTuristico(datos, paises, destinos);
                        break;
                    case 2:
                        mostrarDestinosTuristicos(destinos);
                        break;
                    case 3:
                        modificarPaisDestinoTuristico(datos, destinos);
                        break;
                    case 4:
                        destinos.clear();
                        System.out.println("Se ha limpiado la lista de destinos turísticos.");
                        break;
                    case 5:
                        eliminarDestinoTuristico(datos, destinos);
                        break;
                    case 6:
                        mostrarDestinosOrdenadosPorNombre(destinos);
                        break;
                    case 7:
                        mostrarPaises(paises);
                        break;
                    case 8:
                        mostrarDestinosPorPais(datos, destinos);
                        break;
                    case 9:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Inténtalo nuevamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Se esperaba un número entero. Inténtalo nuevamente.");
                datos.nextLine(); 
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                datos.nextLine(); 
            }
        } while (opcion != 9);

        datos.close();
	}
	  private static void altaDestinoTuristico(Scanner sc, List<Pais> paises, List<DestinoTuristico> destinos) {
	        System.out.println("----- Alta de destino turístico -----");

	        // Leer los datos del destino turístico
	        System.out.print("Ingrese el código: ");
	        sc.nextLine(); // Consumir el salto de línea después de leer el entero

	        System.out.print("Ingrese el nombre: ");
	        String nombre = sc.nextLine();

	        System.out.print("Ingrese el precio: ");
	        double precio = sc.nextDouble();
	        sc.nextLine(); // Consumir el salto de línea después de leer el número

	        System.out.print("Ingrese el código de país: ");
	        int codigoPais = sc.nextInt();
	        sc.nextLine(); // Consumir el salto de línea después de leer el entero

	        Pais pais = buscarPaisPorCodigo(paises, codigoPais);
	        if (pais == null) {
	            System.out.println("El país con el código " + codigoPais + " no existe.");
	        } else {
	            System.out.print("Ingrese la cantidad de días: ");
	            int cantidadDias = sc.nextInt();
	            sc.nextLine(); // 

	            DestinoTuristico destino = new DestinoTuristico(codigoPais, nombre, precio, pais, cantidadDias);
	            destinos.add(destino);

	            System.out.println("El destino turístico ha sido agregado correctamente.");
	        }
	    }

	    private static Pais buscarPaisPorCodigo(List<Pais> paises, int codigoPais) {
		// TODO Auto-generated method stub
		return null;
	}
		private static void mostrarDestinosTuristicos(List<DestinoTuristico> destinos) {
	        System.out.println("----- Destinos Turísticos -----");
	        if (destinos.isEmpty()) {
	            System.out.println("No hay destinos turísticos para mostrar.");
	        } else {
	            for (DestinoTuristico destino : destinos) {
	                System.out.println(destino);
	            }
	        }
	    }

	    private static void modificarPaisDestinoTuristico(Scanner sc, List<DestinoTuristico> destinos) {
	        System.out.println("----- Modificar país de destino turístico -----");

	        if (destinos.isEmpty()) {
	            System.out.println("No hay destinos turísticos para modificar.");
	        } else {
	            System.out.print("Ingrese el código del destino turístico: ");
	            int codigoDestino = sc.nextInt();
	            sc.nextLine(); // Consumir el salto de línea después de leer el entero

	            DestinoTuristico destino = buscarDestinoPorCodigo(destinos, codigoDestino);
	            if (destino == null) {
	                System.out.println("No se encontró ningún destino turístico con el código " + codigoDestino + ".");
	            } else {
	                System.out.print("Ingrese el nuevo código de país: ");
	                int codigoPais = sc.nextInt();
	                sc.nextLine(); // Consumir el salto de línea después de leer el entero

	                Pais pais = buscarPaisPorCodigo(destino.getPais().getBytes());
	                if (pais == null) {
	                    System.out.println("El país con el código " + codigoPais + " no existe.");
	                } else {
	                    destino.getPais().offsetByCodePoints(codigoDestino, codigoPais);
	                    destino.getPais().offsetByCodePoints(codigoDestino, codigoPais);
	                    System.out.println("Se ha modificado el país del destino turístico correctamente.");
	                }
	            }
	        }
	    }

	    private static Pais buscarPaisPorCodigo(byte[] bytes) {
			// TODO Auto-generated method stub
			return null;
		}
		private static DestinoTuristico buscarDestinoPorCodigo(List<DestinoTuristico> destinos, int codigoDestino) {
			// TODO Auto-generated method stub
			return null;
		}
		private static void eliminarDestinoTuristico(Scanner sc, List<DestinoTuristico> destinos) {
	        System.out.println("----- Eliminar destino turístico -----");

	        if (destinos.isEmpty()) {
	            System.out.println("No hay destinos turísticos para eliminar.");
	        } else {
	            System.out.print("Ingrese el código del destino turístico: ");
	            int codigoDestino = sc.nextInt();
	            sc.nextLine(); // Consumir el salto de línea después de leer el entero

	            Iterator<DestinoTuristico> iterator = destinos.iterator();
	            boolean encontrado = false;

	            while (iterator.hasNext()) {
	                DestinoTuristico destino = iterator.next();
	                if (destino.getCodigo() == codigoDestino) {
	                    iterator.remove();
	                    encontrado = true;
	                    break;
	                }
	            }

	            if (encontrado) {
	                System.out.println("El destino turístico ha sido eliminado correctamente.");
	            } else {
	                System.out.println("No se encontró ningún destino turístico con el código " + codigoDestino + ".");
	            }
	        }
	    }

	    private static void mostrarDestinosOrdenadosPorNombre(List<DestinoTuristico> destinos) {
	        System.out.println("----- Destinos Turísticos Ordenados por Nombre -----");
	        if (destinos.isEmpty()) {
	            System.out.println("No hay destinos turísticos para mostrar.");
	        } else {
	            List<DestinoTuristico> destinosOrdenados = new ArrayList<>(destinos);
	            Collections.sort(destinosOrdenados, (d1, d2) -> d1.getNombre().compareToIgnoreCase(d2.getNombre()));

	            for (DestinoTuristico destino : destinosOrdenados) {
	                System.out.println(destino);
	            }
	        }
	    }

	    private static void mostrarPaises(List<Pais> paises) {
	        System.out.println("----- Países -----");
	        if (paises.isEmpty()) {
	            System.out.println("No hay países para mostrar.");
	        } else {
	            for (Pais pais : paises) {
	                System.out.println(pais);
	            }
	        }
	    }

	    private static void mostrarDestinosPorPais(Scanner sc, List<DestinoTuristico> destinos) {
	        System.out.println("----- Destinos Turísticos de un País -----");

	        if (destinos.isEmpty()) {
	            System.out.println("");
	        }
	    }
}
