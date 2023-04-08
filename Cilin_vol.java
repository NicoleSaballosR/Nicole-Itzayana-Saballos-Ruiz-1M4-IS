package ejerc1_10;

import java.util.Scanner;

public class Cilin_vol {

	public static void main(String[] args) {
		// #9 Volumen de un Cilindro
		Scanner tc= new Scanner(System.in);
		
		double radio,altura, volum=0, pi=3.1416;
		
       //Recolección de datos
		try {
			do {
		System.out.println("Ingrese el radio del cilindro");
		radio=tc.nextDouble();
			}while (radio<0);
			do {
		System.out.println("Ingrese la altura del cilindro");
		altura=tc.nextDouble();
		System.out.println("***********************************************************************************");
			}while ( altura <0);
		volum= pi*radio*radio*altura;
		System.out.println("El volumen del cilindro es=\n"+volum+ "cm³");		
        System.out.println("***********************************************************************************");
		}catch ( java.util.InputMismatchException j) {
			System.out.println("Solo se permiten números ");
		}
	}
	
}
