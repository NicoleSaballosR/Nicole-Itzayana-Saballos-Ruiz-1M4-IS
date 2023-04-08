package ejerc11_20;

import java.util.Scanner;

public class Promedio_Notas {

	public static void main(String[] args) {
		// #12 Promedio de notas 
		Scanner tc= new Scanner(System.in);
		
		int n;
		float promedio=0, notas, suma=0;
		//Recolección de Datos
		
		try {
		System.out.println("Registe la cantidad de notas");
		n= tc.nextInt();
		for (int i=0; i<=n; i++) {	
			do {
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Ingrese la nota ");
				notas= tc.nextFloat();
		} while (notas<0);
			
		suma= notas+suma;
		promedio= suma/n;
		
		System.out.println("Su promedio es = \n "+promedio);
        System.out.println("----------------------------------------------------------------------------------------------");
	}
	}catch ( java.util.InputMismatchException j) {
		System.out.println("Solo se permiten números ");
	}
		}
	}

