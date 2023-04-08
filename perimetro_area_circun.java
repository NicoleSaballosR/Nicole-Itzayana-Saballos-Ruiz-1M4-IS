package ejerc1_10;

import java.util.Scanner;

public class perimetro_area_circun {

	public static void main(String[] args) {
		// #2 Determinar el área y perímetro de una circunferencia
     Scanner tc= new Scanner(System.in);
     
     float radio,area,perim;
     float PI=(float) 3.1416;
     try {
    	 do {
     System.out.println("Ingrese el valor del radio");
     radio=tc.nextFloat();
    	 }while (radio<0);
	area= PI*radio*radio;
    perim= 2*PI*radio;
    
    System.out.println("El perímetro de una circunferencia es:"+perim);
    System.out.println("****************************************************************************");
     System.out.println("El área de un circulo es: "+area);
     System.out.println("****************************************************************************");
	}catch ( java.util.InputMismatchException p) {
		System.out.println("Solo se permiten números ");
	}
	}
}
