package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
private int codigo;
private String nombre;
private double precio;
private Pais pais2;
private int CantidadDeDias;
private String pais;

public DestinoTuristico(int codigo, String nombre, double precio, Pais pais2, int cantidadDeDias) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.precio = precio;
	this.setPais2(pais2);
	CantidadDeDias = cantidadDeDias;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public Pais getPais() {
	return getPais();
}

public void setPais(String pais) {
	this.pais = pais;
}

public int getCantidadDeDias() {
	return CantidadDeDias;
}

public void setCantidadDeDias(int cantidadDeDias) {
	CantidadDeDias = cantidadDeDias;
}

public Pais getPais2() {
	return pais2;
}

public void setPais2(Pais pais2) {
	this.pais2 = pais2;
}

}
