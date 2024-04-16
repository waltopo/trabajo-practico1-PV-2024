package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
private int diametro;
private double precio;
private double area;
private boolean ingredientesEspeciales;
private final int adicionalIngredientesEspeciales2 = 500;
private final int adicionalIngredientesEspeciales3 = 750;
private final int adicionalIngredientesEspeciales4 = 1000;
public Pizza() {
	super();
	// TODO Auto-generated constructor stub
}
public Pizza(int diametro, double precio, double area, boolean ingredientesEspeciales) {
	super();
	this.diametro = diametro;
	this.precio = precio;
	this.area = area;
	this.ingredientesEspeciales = ingredientesEspeciales;
}
public int getDiametro() {
	return diametro;
}
public void setDiametro(int diametro) {
	this.diametro = diametro;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public double getArea() {
	return area;
}
public void setArea(double area) {
	this.area = area;
}
public boolean isIngredientesEspeciales() {
	return ingredientesEspeciales;
}
public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
	this.ingredientesEspeciales = ingredientesEspeciales;
}

public double calcularPrecio() {
	double precioPizza=0;
	if (diametro==20) {
		precioPizza=4500;
		if (ingredientesEspeciales) {
			precioPizza+=adicionalIngredientesEspeciales2;
		}
	}else if (diametro == 30) {
        precioPizza = 4800;
        if (ingredientesEspeciales) {
            precioPizza += adicionalIngredientesEspeciales3;
        }
    } else if (diametro == 40) {
        precioPizza = 5500;
        if (ingredientesEspeciales) {
            precioPizza += adicionalIngredientesEspeciales4;
        }
    }
    return precioPizza;
}

public double calcularArea() {
	double radio=diametro/2.0;
	area=Math.PI* Math.pow(radio,2);
	return area;
	
}
}
