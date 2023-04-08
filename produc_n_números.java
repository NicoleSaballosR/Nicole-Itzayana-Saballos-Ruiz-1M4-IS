package ejerc1_10;

import java.util.Scanner;

public class produc_n_números {

	public static void main(String[] args) {
		// #41 producto de ´´n´´ números
		
		Scanner tc= new Scanner(System.in);
		int n, numeros, producto=1;
		
		try {
		do {
		System.out.println("Ingrese la cantidad de valores que desee evaluar");
		n=tc.nextInt();
		}while (n<0);
		
		for  (int  i=1; i<=n; i++) {
			System.out.println("Ingresa el número"  + i + ":");
			numeros= tc.nextInt();
			producto *= numeros;
		}
		System.out.println("El producto de los " + n + " números es: " + producto);
	} catch ( java.util.InputMismatchException j) {
		System.out.println("Solo se permiten números ");
	}
	}
}
