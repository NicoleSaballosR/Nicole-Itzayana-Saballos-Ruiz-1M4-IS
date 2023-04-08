package ejerc11_20;

import java.util.Scanner;

public class Definir_edad {

	public static void main(String[] args) {
		//  #44 Definir edad
		
		Scanner tc= new Scanner (System.in);
		
		int edad;
		try {
		do {
		System.out.println("Ingrese su edad");
		edad= tc.nextInt();
		}while (edad<0);
		if (edad<13){
			System.out.println("Usted todavía es un niño");
		} 
		else if (edad>=13 && edad<=25) {
			System.out.println("Usted es Joven");
		}
		else {
			System.out.println("Usted es un adulto ");
		}
		
		}catch ( java.util.InputMismatchException j) {
			System.out.println("Solo se permiten números ");
		}
	}

}
