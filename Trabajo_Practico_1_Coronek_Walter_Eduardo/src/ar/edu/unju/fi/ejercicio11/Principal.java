package ar.edu.unju.fi.ejercicio11;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int i = 2;
				int j = 40;
				int resul = j;
				for(i=2;0<=j-1;j=j-i) {
					if(j==38) {
						j--;
					}
					resul = resul + j;
					System.out.println(resul);
				}
				System.out.println("jota: ");
				
				for(;40>=j;j=j+i) {
					resul = resul - j ;
					
					if(resul==440) {
						resul++ ;
					}
					System.out.println(resul);
				}
			}
		

	}


