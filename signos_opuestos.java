package ejerc11_20;

import java.util.Scanner;

public class signos_opuestos {

	public static void main(String[] args) {
		// ejercicio  #28 
		
		Scanner tc= new Scanner(System.in);
		
		int num1, num2;
		//Recolección de datos 
		try {
		System.out.println("Ingrese el primer número entero");
		num1= tc.nextInt();
		System.out.println("Ingrese el segundo número entero");
		num2= tc.nextInt();
		System.out.println("*************************************************************************");
		
		if((num1>0 && num2<0)|| (num1<0 && num2>0)) {
			System.out.println("Signos opuestos");
		}
		else {
			System.out.println("No hay signos opuestos");}
		System.out.println("*******************************************************************************");
		}catch ( java.util.InputMismatchException j) {
			System.out.println("Solo se permiten números ");
		}
	}
	}

