package ejerc1_10;

import java.util.Scanner;

public class números_enteros_imprimir {

	public static void main(String[] args) {
		// #34 Números enteros y luego imprimir 
		Scanner tc= new Scanner(System.in);
		
		int n;
		int numeros = 0;
		System.out.println("Ingrese la cantidad de numeros que desea ingresar :");
		n=tc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Ingrese el número #"+(i+1)+ ":");
			numeros=tc.nextInt();
			
		}
		for (int i=0; i<n; i++) {
		System.out.println("Los números ingresados son : ");
		System.out.println( numeros[i]);
	}
}
}