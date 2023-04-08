package ejerc11_20;

import java.util.Scanner;

public class Calificaciones {

	public static void main(String[] args) {
		// #23 Calificación de un alumno aprobado o reprobado
		Scanner tc= new Scanner(System.in);
		
		float notas;
		try {
		do {
		 System.out.println("Ingrese su nota");
		 notas=tc.nextFloat();
		 System.out.println("****************************************************************************************");

		if (notas>=60) {
			System.out.println("Usted aprobo la clase \n FELICIDADES! ");
		} else {
			System.out.println("Usted reprobo la clase \n Pongase a estudiar");
		}
		System.out.println("*****************************************************************************************");
	}while (notas<0);
		}catch ( java.util.InputMismatchException j) {
			System.out.println("Solo se permiten números ");
		}
	}
}
