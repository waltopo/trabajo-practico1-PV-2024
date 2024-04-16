package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
 private String nombre;
 private int legajo;
 private double salario;
 private double salario_minimo=20000;
 private double aumento=20000;
public Empleado(String nombre, int legajo, double salario) {
	this.nombre = nombre;
	this.legajo = legajo;
	if (salario>=salario_minimo) {
		this.salario = salario;
	}else {
		this.salario=salario_minimo;
	}	
	
}
public void mostrarDatos() {
	System.out.println("nombre: "+ nombre);
	System.out.println("legajo: "+legajo);
	System.out.println("salario: "+salario);
}
public void  dar_aumento() {
	salario+=aumento;
}
}
