package ejerc1_10;

import java.util.Scanner;

public class entre_2_100 {
	public static void main(String[] args) {
		// #38 Escriba un programa que calcule cuantos números impares hay entre 20 y 100 e igualmente a cuantos asciende la suma de ellos.
           Scanner tc= new Scanner(System.in);
           int contador=0, suma=0;
            try {
           for (int i = 21; i <= 99; i += 2) {
               contador++;
               suma += i;
           }
           System.out.println("Cantidad de números impares: " + contador);
           System.out.println("Suma de los números impares: " + suma);
	}catch ( java.util.InputMismatchException i) {
		System.out.println("Solo se permiten números ");
 }

	}

}
