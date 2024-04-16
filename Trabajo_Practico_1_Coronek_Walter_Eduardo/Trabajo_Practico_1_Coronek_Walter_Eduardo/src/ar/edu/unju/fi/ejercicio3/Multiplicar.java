package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato =new Scanner(System.in);
		int numero;
		int resultado;
	
		System.out.println("ingrese un numero");
		numero=dato.nextInt();
		if (numero % 2==0) {// se verifica si esl numero es par o impar
			System.out.println("el numero engresado  es par" + numero);
			resultado=numero*3; //si el numero es par se realiala el triple del numero ingresado
			
		}
		else {
			System.out.println("el numero ingresado es inpar " + numero);
			resultado=numero*2;//si el numero es impar se realiza el doble del numero ingresdo
		}
		System.out.println("el resultado es: " + resultado);  // muestra el resulda de la operacion segun sean par o impar
		
		dato.close();
	}
	

}
