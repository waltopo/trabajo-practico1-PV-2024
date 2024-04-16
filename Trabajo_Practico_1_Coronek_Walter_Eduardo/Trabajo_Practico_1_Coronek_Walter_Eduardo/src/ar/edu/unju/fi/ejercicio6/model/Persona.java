package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fecha_de_nacimienro;
	private String provincia;
	public Persona() {
	}
	public Persona (String dni,String nombre, LocalDate fecha_de_nacimiento, String provincia) {
		this.dni=dni;
		this.nombre=nombre;
		this.fecha_de_nacimienro= fecha_de_nacimiento;
		this.provincia=provincia;
	
	}
	public Persona (String dni, String nombre, LocalDate fecha_de_nacimiento) {
		this.dni=dni;
		this.nombre=nombre;
		this.fecha_de_nacimienro=fecha_de_nacimiento;
		this.provincia="jujuy";
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha_de_nacimienro() {
		return fecha_de_nacimienro;
	}
	public void setFecha_de_nacimienro(LocalDate fecha_de_nacimienro) {
		this.fecha_de_nacimienro = fecha_de_nacimienro;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public int calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		return fechaActual.getYear()-fecha_de_nacimienro.getYear();
	}
	public boolean esmayorDeEdad() {
		int edad=calcularEdad();
		return edad>=18;
	}
	public void mostrarDatos() {
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("fecha de nacimiento: "+ fecha_de_nacimienro);
		System.out.println("Provincia: "+ provincia);
		int edad = calcularEdad();
		System.out.println("edad: "+edad);
		if (esmayorDeEdad()) {
			System.out.println("la persona es mayor de edad");
		}else {
			System.out.println("la persona es menor de edad");
		}
	}
}
