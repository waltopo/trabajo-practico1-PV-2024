package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
private String nombre;
private int codigo;
private double precio;
private int descuento;
public Producto() {
	super();
	// TODO Auto-generated constructor stub
}
public Producto(String nombre, int codigo, double precio, int descuento) {
	super();
	this.nombre = nombre;
	this.codigo = codigo;
	this.precio = precio;
	this.descuento = descuento;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public int getDescuento() {
	return descuento;
}
public void setDescuento(int descuento) {
	this.descuento = descuento;
}
public double calcularDescuento() {
    double precioDescuento = precio;
    if (descuento > 0 && descuento <= 50) {
        double descuentoPorcentaje = descuento / 100.0;
        precioDescuento = precio - (precio * descuentoPorcentaje);
    }
    return precioDescuento;
}
}
