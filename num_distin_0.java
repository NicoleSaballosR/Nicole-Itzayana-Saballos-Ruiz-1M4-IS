package ejerc1_10;

import java.util.Scanner;

public class num_distin_0 {

	public static void main(String[] args) {
		// #42 números distintos de 0
		
		Scanner tc= new Scanner(System.in);
		int n, numeros, suma=0, conteo=0;
		
		try {
		do {
		System.out.println("Introduce el valor de n");
		n= tc.nextInt();
		}while (n<0);
		for (int i = 0; i < n; i++) {
            System.out.print("Introduce un número distinto de 0: ");
            numeros= tc.nextInt();
            if (numeros > 0) {
                suma += numeros;
            } else if (numeros < 0) {
                conteo++;
            }
	}
		 System.out.println("La suma de los números positivos es: " + suma);
         System.out.println("El número de números negativos es: " + conteo);

         tc.close();

}catch ( java.util.InputMismatchException j) {
	System.out.println("Solo se permiten números ");
}
}
}