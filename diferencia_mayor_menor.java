package ejerc11_20;

import java.util.Scanner;

public class diferencia_mayor_menor {

	public static void main(String[] args) {
		// #29 diferencia entre el mayor y el menor 
		Scanner tc = new Scanner(System.in);
		
		int num1, num2;
		int dif=0;
		int mayor=0, menor=0;
		
		try {
		do {
		System.out.println("Ingrese el primer número");
		num1= tc.nextInt();
		System.out.println("Ingrese el segundo número");
		num2= tc.nextInt();
		System.out.println("******************************************************************************************");
		} while (num1<0);
		 if (num1>num2) {
			 mayor = num1;
			 menor = num2;
		 }
		 else {
			 mayor= num2;
		     menor= num1;
		 } 
       //operación 
		 
		 dif= mayor-menor;
		 System.out.println("La diferencia entre cada numero es = \n "+ dif);
	}catch ( java.util.InputMismatchException j) {
		System.out.println("Solo se permiten números ");
	}
		
	}
}
