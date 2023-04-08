package ejerc1_10;

import java.util.Scanner;

public class area_rectángulo {

	public static void main(String[] args) {
		// #1 Determinar el área de un rectángulo
		
		Scanner tc= new Scanner(System.in);
		
		float area=0,altura,base;
		try {
			do {
		System.out.println("Ingrese la base del rectángulo");
		base= tc.nextFloat();
			} while (base<0);
			do {
		System.out.println("Ingrese la altura del rectángulo");
		altura= tc.nextFloat();
		System.out.println("*************************************************************************");
			}while (altura<0);
		area= base*altura;
		
		System.out.println("El área del rectángulo es:"+ area);
		System.out.println("**************************************************************************");
	} catch ( java.util.InputMismatchException n) {
	System.out.println("Solo se permiten números ");
	}
}
}