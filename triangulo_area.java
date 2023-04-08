package ejerc1_10;

import java.util.Scanner;

public class triangulo_area {

	public static void main(String[] args) {
		// #8 Área de un triángulo
		
		Scanner tc= new Scanner(System.in);
		double a, b, c, area=0;
		double perimetro=0, s=0;
		
		//Recolección de datos 
		try {
		do {
		System.out.println("Ingrese el primer lado del triángulo");
		a=tc.nextDouble();
		}while (a<0);
		do { 
		System.out.println("Ingrese el segundo lado del triángulo");
		b=tc.nextDouble();
		} while (b<0);
		do {
		System.out.println("Ingrese el tercer lado del tri+angulo");
		c=tc.nextDouble();
		}while (c<0);
	System.out.println("*******************************************************************************************************");
       perimetro = a+b+c;
       s= perimetro/2;
       
		area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("El área del triángulo es ="+area + "m²");
		System.out.println("***************************************************************************************************");
	}catch ( java.util.InputMismatchException j) {
		System.out.println("Solo se permiten números ");
	}
	}
}
