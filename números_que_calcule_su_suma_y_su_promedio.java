package ejerc1_10;

import java.util.Scanner;

public class números_que_calcule_su_suma_y_su_promedio {
	public static void main(String[] args) {
		// #36 Escriba un programa que lea “n” números que calcule su suma y su promedio.
        Scanner tc= new Scanner(System.in);
        int n, suma=0, numeros;
        double promedio=0;
        
        try {
        do{
        System.out.println("Ingrese la cantidad de valores que desee sumar y promediar");
        n=tc.nextInt();
        }while (n<0);
        
        System.out.println("Ingrese " + n + " números:");
  
        for (int i = 0; i < n; i++) {
           numeros= tc.nextInt();
            suma += numeros;
        }
        promedio = (double) suma / n;

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
       } catch ( java.util.InputMismatchException r) {
   		System.out.println("Solo se permiten números ");
   	}
	}
}

