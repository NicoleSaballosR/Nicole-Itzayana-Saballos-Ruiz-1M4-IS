package ejerc11_20;

import java.util.Scanner;

public class divisible_3 {

	public static void main(String[] args) {
		// #25 Número divisible entre 3
		Scanner tc= new Scanner(System.in);
		int num;
		
		//Recolección de Datos 
		try {
		do {
		System.out.println("Ingrese el número");
		num= tc.nextInt();
		//Operaciones 
		System.out.println("********************************************************************************************");
		if (num%3==0) {
			System.out.println("El número es divisible entre 3");
		}else {
			System.out.println("El número no es divisible entre 3");
		}
		}while (num<0);
		}catch ( java.util.InputMismatchException j) {
			System.out.println("Solo se permiten números ");
		}
	}

}
