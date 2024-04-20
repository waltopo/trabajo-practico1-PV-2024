package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos =new Scanner(System.in);
		//creando la lista de 5 nombres
		String[] nombres=new String[5];
		//pidiendo que el usuario agregue los nombres
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("ingrese nombre en la posicion "+i+": ");
			nombres[i]=datos.nextLine();
		}
		//muestra la lista 
		System.out.println("valoress de la lista");
		int i=0;
		while (i<nombres.length) {
			System.out.println(nombres[i]);
			i++;
		}
		System.out.println("tamaño de la lista: " +nombres.length);
		// con el indice solicitado elimina el elemento
		byte indice;
		do {
			System.out.println("ingrese el indice que desea eliminar (0-4): ");
			indice=datos.nextByte();
		} while (indice<0||indice>=nombres.length);
		//busca el elimento a eleminar
		for (int j = (int)indice; j < nombres.length -1; j++) {
			nombres[j]=nombres[j+1];
		}
		nombres[nombres.length-1]= " ";
		//muetra la lista actualizada
		System.out.println("lista actualizada");
		for (String nombre:nombres) {
			System.out.println(nombre);
		}
		datos.close();
	}
	
}
