package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []numeros=new int[8];
		Scanner numero=new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("ingrese un numero entero par la posición "+i+": ");
			numeros[i]=numero.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("indice: "+i+", valor: "+numeros[i]);
		}
		numero.close();
	}

}
