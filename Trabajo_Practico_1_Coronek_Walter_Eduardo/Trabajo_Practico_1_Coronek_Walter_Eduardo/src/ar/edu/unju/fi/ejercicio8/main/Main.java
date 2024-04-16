package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.Calculado_Especial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato=new Scanner(System.in);
		Calculado_Especial calculadora=new Calculado_Especial();
		
		System.out.println("ingrese un numero");
		calculadora.setNumero(dato.nextInt());
		System.out.println("Sumatoria: "+calculadora.calcularSumartoria());
		System.out.println("Productoria: "+calculadora.calcularProductoria());
		dato.close();
	}

}
