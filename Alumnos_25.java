package ejerc11_20;

import java.util.Scanner;

public class Alumnos_25 {

	public static void main(String[] args) {
		// #43 25 alumnos; 3 examenes
		Scanner tc= new Scanner(System.in);
		String nombre;
		float nota1, nota2, nota3;
		float promedio=0, suma=0;
		 
		
		System.out.println("Ingrese el nombre del estudiante ");
		nombre= tc.nextLine();
		System.out.println("Hola \n " + nombre);
		try {
			do { 
				System.out.println("ingresa tu primera nota");
				nota1= tc.nextFloat();
				System.out.println("ingresa tu segunda nota");
				nota2= tc.nextFloat();
				System.out.println("ingresa tu tercera nota");
				nota3= tc.nextFloat();
				
				 suma= nota1 + nota2 + nota3;
				 promedio= suma/3;
				 System.out.println(nombre + "\n Tu promedio es de: \n" + promedio);
			} while (suma<0);
			
		}catch ( java.util.InputMismatchException j) {
			System.out.println("Solo se permiten números ");
		}
		
		
		

	}

}
