package ejerc11_20;

import java.util.Scanner;

public class Energía_Total {

	public static void main(String[] args) {
		// #17 Determinar la energía total 
		
		Scanner tc= new Scanner(System.in); 
		
		double m,v,h;
		double g= 9.8; 
		double ET=0,EC=0, EP=0;
		try {
		do {
		System.out.println("Ingrese el valor de la masa");
		m=tc.nextDouble();
		}while (m<=0);
		do {
		System.out.println("Ingrese el valor de la velocidad");
		v=tc.nextDouble();
		} while (v<=0);
		do {
		System.out.println("Ingrese el valor de la altura");
		h=tc.nextDouble();
		} while (h<=0);
		System.out.println("-----------------------------------------------------------------------------------");
		//Operaciones 
		EC=(m*(v*v))/2;
		EP= (m*h)*g;
		ET= EC+EP;
		//Respuestas 
		System.out.println("La energía Total es de = \n"+ET);
		System.out.println("----------------------------------------------------------------------------------");
		}catch ( java.util.InputMismatchException j) {
			System.out.println("Solo se permiten números ");
		}
	}

}
