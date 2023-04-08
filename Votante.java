package ejerc11_20;

import java.util.Scanner;

public class Votante {

	public static void main(String[] args) {
		// #19 votante dado que tiene 16 o más años de edad.
		
		Scanner tc= new Scanner(System.in);
		int edad;
		//Recolección de datos 
		try{
		do {
		System.out.println("Ingrese su edad");
		edad= tc.nextInt();
		}while (edad<0);
		System.out.println("**************************************************************************");
		if (edad<16 ) {
			System.out.println("Usted no puede votar, no cuenta con el requisito de edad");
		}else {
			System.out.println("Puede votar, el voto es secreto ;) ");
			System.out.println("**************************************************************************");
		}
		}catch ( java.util.InputMismatchException j) {
			System.out.println("Solo se permiten números ");
		}
	}

}
