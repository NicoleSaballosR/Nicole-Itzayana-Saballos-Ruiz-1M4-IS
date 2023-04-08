package ejerc1_10;

import java.util.Scanner;

public class grados_Fahre_Cels {

	public static void main(String[] args) {
		// #7 Fahrenheit a grados Celsius
		Scanner tc= new Scanner(System.in);
		
		//Recolección de datos
		double fahren, cels=0;
	try {
       //operación
		do {
	System.out.println("Ingrese el valor de grados Fahrenheit\n que desee transformar a Celsius ");
	fahren= tc.nextDouble();
		}while (fahren<0);
	System.out.println("****************************************************************************************************************************************");
	 cels= (fahren - 32)* 5/9;
	 System.out.println("El valor de grado Celsius es:"+ cels);
    System.out.println("****************************************************************************************************************************************");
}catch ( java.util.InputMismatchException j) {
	System.out.println("Solo se permiten números ");
}
	}
}