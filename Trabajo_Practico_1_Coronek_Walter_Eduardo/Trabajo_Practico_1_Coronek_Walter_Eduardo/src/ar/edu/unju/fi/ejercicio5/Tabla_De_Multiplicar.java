package ar.edu.unju.fi.ejercicio5;


import java.util.Scanner;

public class Tabla_De_Multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato =new Scanner(System.in);
		int numero  ;
		System.out.println("ingrese un numero");
		numero=dato.nextInt();
		if (numero >=1 && numero<=9) {
			System.out.println("La tabla de multiplicar de: " +numero);
			for (int i=1; i<=10;i++) {
			
				System.out.println(numero+"x"+i+ "="+(numero*i));
			}
			
		}else {
			System.out.println("el numero ingresado esta fuera del rango del 1 al 9");
		}
		
		dato.close();
	}

}
