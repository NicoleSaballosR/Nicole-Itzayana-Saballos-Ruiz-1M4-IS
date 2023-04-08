package ejerc11_20;

import java.util.Scanner;

public class parimpar {

	public static void main(String[] args) {
		// #20 Par o impar 
		Scanner tc =new Scanner(System.in);

		int num;
		
		try {
		do {
		System.out.println("Ingrese el numero que desee saber ");
		num= tc.nextInt();
		} while (num<0);
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		//Operaciones 
		if (num%2==0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
			System.out.println("-------------------------------------------------------------------------------------------------------------------");
		}
	}catch ( java.util.InputMismatchException j) {
		System.out.println("Solo se permiten números ");
	}
	}
}
