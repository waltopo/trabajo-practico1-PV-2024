package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner datos = new Scanner(System.in);

	        // Crear 3 objetos Pizza
	        for (int i = 1; i <= 3; i++) {
	            Pizza pizza = new Pizza();

	            System.out.println("Ingrese los datos de la Pizza " + i + ":");
	            System.out.print("Diámetro (20, 30 o 40): ");
	            pizza.setDiametro(datos.nextInt());
	            System.out.print("Ingredientes especiales true o false: ");
	            pizza.setIngredientesEspeciales(datos.nextBoolean());

	            System.out.println();

	            // Calcular precio y área de la Pizza
	            double precio = pizza.calcularPrecio();
	            double area = pizza.calcularArea();

	            // Mostrar los datos de la Pizza
	            System.out.println(" Pizza " + i );
	            System.out.println("Diámetro = " + pizza.getDiametro());
	            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
	            System.out.println("Precio Pizza = " + precio + "$");
	            System.out.println("Área de la pizza = " + area);

	            System.out.println();
	        }

	        datos.close();
	}

}
