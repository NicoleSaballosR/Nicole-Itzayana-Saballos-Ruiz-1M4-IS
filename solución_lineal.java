package ejerc11_20;

import java.util.Scanner;

public class solución_lineal {

	public static void main(String[] args) {
		// #14 Determinar la solución lineal que tiene la forma ax + b =0 donde a y b son números reales
		
		Scanner tc= new Scanner(System.in);
		
		double a, b;
		double x=0;

		//Recolección de datos 
		try {
		do {
		System.out.println("Ingrese el valor de ´a´");
		a= tc.nextInt();
		}while (a<0);
		do {
		System.out.println("Ingrese el valor de ´b´");
		b= tc.nextInt();
		}while (b<0);
		 System.out.println("***********************************************************************");
		 //Operación
        x= -(b)/a;
        System.out.println("El valor de ´´x´´ es :\n"+ x );
		}catch ( java.util.InputMismatchException j) {
			System.out.println("Solo se permiten números ");
		}
	}

}
