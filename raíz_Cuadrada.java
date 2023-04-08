package ejerc1_10;

import java.util.Scanner;

public class raíz_Cuadrada {

	public static void main(String[] args) {
		// #4 Determine la raíz Cuadrada
		
		Scanner tc= new Scanner(System.in);
		
		int num;
		double raiz_Cuad=0;
		//Problemas 
		try {
			do {
		System.out.println("Ingrese el valor que desee evaluar o saber su raiz cuadrada");
		num= tc.nextInt();
			}while (num<0);
		System.out.println("***************************************************************************************");
		raiz_Cuad= (double) Math.sqrt(num);
		System.out.println("La raiz Cuadrada es: "+ raiz_Cuad);
		
		
		System.out.println("***************************************************************************************");

	}catch ( java.util.InputMismatchException j) {
		System.out.println("Solo se permiten números ");
	}
	}
}
