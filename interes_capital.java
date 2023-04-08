package ejerc11_20;

import java.util.Scanner;

public class interes_capital {

	public static void main(String[] args) {
		//  #22 calcular el interés de una capital
		Scanner tc= new Scanner(System.in);
	    float capital, interes_1=0, interes_2=0;
		
		//Recolección de datos
	    try {
	    do {
		System.out.println("Ingrese el monto de su capital");
		capital=  tc.nextFloat();
	    }while (capital<0);
		//Operaciones 
		if (capital<10000) {
			interes_1= (float) (capital*0.06);
			System.out.println("El capital es de = \n "+ capital+ "\n El interes es de = \n"+interes_1);
		}else {
			interes_2= (float) (capital*0.07);
			System.out.println("El capital es de = \n "+ capital+ "\nEl interes es de = \n"+interes_2);
		}
	    }catch ( java.util.InputMismatchException j) {
			System.out.println("Solo se permiten números ");
		}

	}

}
