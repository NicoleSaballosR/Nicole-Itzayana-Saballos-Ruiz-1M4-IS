package ejerc1_10;

import java.util.Scanner;

public class valor_Y {

	public static void main(String[] args) {
		// #3 Encuentre el valor de "Y"
		Scanner tc= new Scanner(System.in);
		
		int X1=2;
		float C=(float) 2.5;
		float X, Y=0, Y1=0;
		try {
		Y= X1*C-2;
		System.out.println("Ejercicio de ejemplo cuando X=2");
		System.out.println("El valor de Y es:"+Y);
		System.out.println("*************************************************************************************");
     do {
        System.out.println("Escribe el valor X :");
        X= tc.nextFloat();
     }while (X<0);
        Y1= X*C-2;
        
        System.out.println("El valor de Y es:"+Y1);
        System.out.println("***************************************************************************************");
		} catch ( java.util.InputMismatchException y) {
			System.out.println("Solo se permiten números ");
		}
	}

}
