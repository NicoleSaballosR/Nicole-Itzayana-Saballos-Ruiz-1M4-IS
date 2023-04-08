package ejerc1_10;

import java.util.Scanner; 

public class kg_a_lb {

	public static void main(String[] args) {
		// #6 Convertir de Kilogramo a Libra
		
		Scanner tc= new Scanner(System.in);
		double kg, lb=0;
		try {
			do {
		System.out.println("Ingrese el valor en kilogramo");
		kg=tc.nextDouble();
			}while (kg<0);
		System.out.println("*************************************************************************************************************************");
		lb= kg*2.2;
		System.out.println("El valor en libras es : "+ lb);
		System.out.println("*************************************************************************************************************************");
		}catch ( java.util.InputMismatchException k) {
			System.out.println("Solo se permiten números ");
		}
	}

}
