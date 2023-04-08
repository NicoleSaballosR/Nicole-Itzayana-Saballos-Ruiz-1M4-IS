package ejerc1_10;

import java.util.Scanner;

public class volt_min_volt_max {

	public static void main(String[] args) {
		// #45 voltaje minímo y maximo
		Scanner tc= new Scanner(System.in);
		int n, voltaje = 0, min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE, suma = 0;
		double promedio=0;
		// recoleccion de datos 
		
		try {
		do {
		 System.out.println("Ingrese la cantidad de voltajes que desee evaluar");
		 n= tc.nextInt();
		}while (n<0);
		for (int i=1; i<=n; i++) {
			 System.out.print("Ingrese el voltaje " + i + ": ");
			 voltaje= tc.nextInt();
		}
		 if (voltaje < min) {
             min = voltaje;
         }
		 else {
             max = voltaje;
         }  
         suma += voltaje;
         
         promedio = (double) suma / n;
         System.out.println("El voltaje mínimo es: " + min);
         System.out.println("El voltaje máximo es: " + max);
         System.out.println("El promedio de voltajes es: " + promedio);
     } catch ( java.util.InputMismatchException p) {
    		System.out.println("Solo se permiten números ");
     }

		}

	}


