package ejerc11_20;

import java.util.Scanner;

public class Verifique_X {

	public static void main(String[] args) {
		// #21 Verifique X
		
		Scanner tc= new Scanner(System.in);
        float X;
        double Resul_1=0, Resul_2=0;
        //Recolección de datos 
        try {
        do {
        System.out.println("Ingrese el valor de ´´X´´");
        X=tc.nextFloat();
        }while (X<0);
        System.out.println("---------------------------------------------------------------------------------------");
        if (X<0) {
        	Resul_1= Math.pow(X, 4);
        	System.out.println("El resultado de ´´X´´ negativas es = \n"+ Resul_1);
        } else {
        	Resul_2= Math.pow(X, 2);
        	System.out.println("El resultado de ´´X´´ positiva es = \n"+ Resul_2);
        }
        System.out.println("---------------------------------------------------------------------------------------");
	}catch ( java.util.InputMismatchException j) {
		System.out.println("Solo se permiten números ");
	}
	}

}
