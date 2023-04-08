package ejerc11_20;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// #40 factorial 
		Scanner tc= new Scanner(System.in);
		
		int n;
		double factorial=1;
		 //Procedimientos 
		try {
			do {
				System.out.println("Ingrese un número entero mayor o igual a 0");
				n=tc.nextInt();
				System.out.println("--------------------------------------------------------------------------");
			} while (n < 0);
			for (int i=1; 1<=n; i++) {
				factorial = factorial * i;
				System.out.println(factorial);
				System.out.println("---------------------------------------------------------------------------");
			}
		}catch ( java.util.InputMismatchException j) {
			System.out.println("Solo se permiten números ");
		}

	}

}
