package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Crear 3 objetos Producto
        for (int i = 1; i <= 3; i++) {
            Producto producto = new Producto();

            System.out.println("Ingrese los datos del Producto " + i + ":");
            System.out.print("Nombre: ");
            producto.setNombre(scanner.nextLine());
            System.out.print("Código: ");
            producto.setCodigo(scanner.nextInt());
            System.out.print("Precio: ");
            producto.setPrecio(scanner.nextDouble());
            System.out.print("Descuento (%): ");
            producto.setDescuento(scanner.nextInt());

            scanner.nextLine(); 

            System.out.println();

          
            System.out.println("Datos del Producto " + i + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Descuento (%): " + producto.getDescuento());
            System.out.println("Precio con Descuento: " + producto.calcularDescuento());

            System.out.println();
        }

        scanner.close();
	}

}
