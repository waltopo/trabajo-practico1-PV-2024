package ar.edu.unju.fi.ejercicio8.model;

public class Calculado_Especial {
	private int n;

	
	public Calculado_Especial() {

	}


	public Calculado_Especial(int numero) {
	
		this.n = numero;
	}


	public int getNumero() {
		return n;
	}


	public void setNumero(int numero) {
		this.n= numero;
	}
	public int calcularSumartoria() {
		int sumatoria=0;
		for (int k = 1; k <=n; k++) {
			sumatoria+=Math.pow((k * (k + 1)) / 2, 2);
		
		}
		return sumatoria;
	}
	public int calcularProductoria() {
		int productoria = 1;
		for (int k = 1; k <=n; k++) {
			productoria=productoria * k*(k+4);
			
		}
		return productoria;
	}
}
