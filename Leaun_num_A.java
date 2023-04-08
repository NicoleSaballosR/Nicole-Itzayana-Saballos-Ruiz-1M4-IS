package ejerc11_20;

import java.util.Scanner;

public class Leaun_num_A {

	public static void main(String[] args) {
		// #24 programa que lea un numero A
		Scanner tc= new Scanner(System.in);
		//Recolección de datos 
		
		int A;
		double y1=0, y2=0;
		try {
		do {
		System.out.println("Ingrese el valor de ´´A´´");
		A= tc.nextInt();
		}while (A<0);
		System.out.println("----------------------------------------------------------------------------------------------");
		if (A>0) {
			y1= Math.pow(2, A);
			System.out.println("Si ´´A´´ es positivo el valor de Y es = \n"+ y1);
		} else {
			y2= A+5;
			System.out.println("Si ´´A´´ es negativo el valor de Y es = \n"+ y2);
		}
       System.out.println("-----------------------------------------------------------------------------------------------");
	}catch ( java.util.InputMismatchException j) {
		System.out.println("Solo se permiten números ");
	}

}
}