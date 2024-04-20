package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
 private String nombre;
 private Calendar fechaNacimiento;
public Persona(String nombre, Calendar fechaNacimiento) {
	super();
	this.nombre = nombre;
	this.fechaNacimiento = fechaNacimiento;
} 
 public int CalcularEdad(){
	    Calendar ahora = Calendar.getInstance();
        int edad = ahora.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (fechaNacimiento.get(Calendar.MONTH) > ahora.get(Calendar.MONTH) ||
            (fechaNacimiento.get(Calendar.MONTH) == ahora.get(Calendar.MONTH) && 
            fechaNacimiento.get(Calendar.DATE) > ahora.get(Calendar.DATE))) {
            edad--;
        }
        return edad;
 }

public String obtenerSigno() {
	int mes = fechaNacimiento.get(Calendar.MONTH) + 1; // Los meses en Calendar van de 0 a 11
    int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
    String signo = "";
    if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
        signo = "Aries";
    } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
        signo = "Tauro";
    } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
        signo = "Géminis";
    } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
        signo = "Cáncer";
    } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
        signo = "Leo";
    } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
        signo = "Virgo";
    } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
        signo = "Libra";
    } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
        signo = "Escorpio";
    } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
        signo = "Sagitario";
    } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
        signo = "Capricornio";
    } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
        signo = "Acuario";
    } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
        signo = "Piscis";
    }
    return signo;
}
public String obtenerEstacion() {//nos da las estaciones segun el emiferio sur
    int mes = fechaNacimiento.get(Calendar.MONTH) + 1; // Los meses en Calendar van de 0 a 11
    String estacion = "";
    if (mes == 1 || mes == 2 || mes == 12) {
        estacion = "Verano";
    } else if (mes >= 3 && mes <= 5) {
        estacion = "Otoño";
    } else if (mes >= 6 && mes <= 8) {
        estacion = "Invierno";
    } else if (mes >= 9 && mes <= 11) {
        estacion = "Primavera";
    }
    return estacion;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Calendar getFecha() {
	return fechaNacimiento;
}
public void setFecha(Calendar fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}

}
