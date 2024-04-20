package ar.edu.unju.fi.ejercicio17.model;

import java.util.Calendar;

public class Jugador {
	private String nombre;
	private String apellido;
	private Calendar fechaNacimiento;
	private String Nacionalidad;
	private double altura;
	private double peso;
	private String posicion;
	
	
	public Jugador(String nombre, String apellido, Calendar fechaNacimiento, String nacionalidad, double altura,
			double peso, String posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		Nacionalidad = nacionalidad;
		this.altura = altura;
		this.peso = peso;
		this.posicion = posicion;
	}
	public int juegadorEdad() {
		Calendar fechaActual = Calendar.getInstance();
        int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (fechaNacimiento.get(Calendar.MONTH) > fechaActual.get(Calendar.MONTH) ||
            (fechaNacimiento.get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH) && 
            fechaNacimiento.get(Calendar.DATE) > fechaActual.get(Calendar.DATE))) {
            edad--;
        }
        return edad;
    }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
}
