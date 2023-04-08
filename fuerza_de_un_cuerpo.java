package ejerc1_10;

import java.util.Scanner;

public class fuerza_de_un_cuerpo {

	public static void main(String[] args) {
		// #10 Determine la fuerza de un cuerpo
		Scanner tc= new Scanner(System.in);

		float M,A;
		float Fuerza=0;
		 
		//Recolección de resultados 
		try { 
		do {
		System.out.println("Ingrese el valor masa");
		M= tc.nextFloat();
		} while (M<0);
		do {
		System.out.println("Ingrese el valor de la aceleración");
		A= tc.nextFloat();
		}while (A<0);
		//Operación
		Fuerza= M*A;
		//Resultado
	    System.out.println("**************************************************************************************************");
	    System.out.println("El valor de la fuerza es : \n"+Fuerza+"N");
	    System.out.println("**************************************************************************************************");
		} catch ( java.util.InputMismatchException j) {
			System.out.println("Solo se permiten números ");
		}
	}

}
