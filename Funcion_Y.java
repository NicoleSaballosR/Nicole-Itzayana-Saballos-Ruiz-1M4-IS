package ejerc1_10;

import java.util.Scanner;

public class Funcion_Y {

	public static void main(String[] args) {
		//#5 Función de ´´y´´
		
		Scanner tc= new Scanner(System.in);
		double X=1;
		float x,y=0,Y=0;
	try {
		do {
		y= (float) (5*Math.pow(X, 4)+ 2* Math.pow(X,3)+ 3*Math.pow(X, 2)+7);
		System.out.println("Ejercicio de ejemplo cuando X=1");
		System.out.print ("La función de Y="+ y);
		}while (y<0);
		do {
		System.out.println("***********************************************************************************************************************");
        System.out.println("Ingrese el valor de X");
		x= tc.nextFloat();
		}while (x<0);
		Y= (float) (5*Math.pow(x, 4)+ 2* Math.pow(x,3)+ 3*Math.pow(x, 2)+7);
		System.out.println("El valor de Y="+Y);
		System.out.println("************************************************************************************************************************");
	}catch ( java.util.InputMismatchException j) {
		System.out.println("Solo se permiten números ");
	}
	}

}
 