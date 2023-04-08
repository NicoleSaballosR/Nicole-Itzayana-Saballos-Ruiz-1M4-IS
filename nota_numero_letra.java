package ejerc11_20;

import java.util.Scanner;

public class nota_numero_letra {

	public static void main(String[] args) {
		// #32 Calificación de números a letras 
		Scanner tc= new Scanner(System.in);
		
		int notas;
		try {
		do {
		System.out.println("Ingrese su nota 0-100");
		notas=tc.nextInt();
		} while (notas <0);
	  
		if (notas >= 90) {
		  System.out.println("Usted tiene una ''A''");
		}
		 if (notas<90 && notas>=80) { 
			System.out.println("Usted tiene una ''B''");
		}
		else if (notas<80 && notas>=70) {
			System.out.println("Usted tiene una ''C''");
		}
		else if (notas<70 && notas>=65) {
			System.out.println("Usted tiene una ''D''");
		}
			else {
				System.out.println("Usted tiene una ''E''");
			}

	}catch ( java.util.InputMismatchException j) {
		System.out.println("Solo se permiten números ");
	}

	}
}
