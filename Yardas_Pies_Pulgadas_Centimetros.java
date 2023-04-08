package ejerc11_20;

import java.util.Scanner;

public class Yardas_Pies_Pulgadas_Centimetros {

	public static void main(String[] args) {

		// #13 Convertir Y yardas, F pies y I pulgadas a Centímetros.
		
				Scanner tc= new Scanner(System.in);
				
				double Y,F,I, Centimetros_Y=0, Centimetros_F=0;
				double Centi_I=0;
				int opc;
				
				//Recolección de datos 
				
				opc= tc.nextInt();
				System.out.println("Que unidad desea trasformar a centimetros \n 1-Yardas \n 2-Pies \n 3-Pulgadas \n 4-Salida  ");
				try {
                do {
				switch (opc) {
				
				case 1:
				System.out.println("Ingrese el valor en Yardas");
				Y=tc.nextDouble();
				Centimetros_Y= Y*0.9144*100;
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println("El valor en Centimetros es = \n"+ Centimetros_Y+"Cm");
				System.out.println("-------------------------------------------------------------------------------");
				
				case 2:
					System.out.println("Ingrese el valor en Pies");
					F=tc.nextDouble();
					Centimetros_F= F*30.48;
					System.out.println("-------------------------------------------------------------------------------");
					System.out.println("El valor en Centimetros es = \n"+ Centimetros_F+"Cm");
					System.out.println("-------------------------------------------------------------------------------");
					
				case 3:
					System.out.println("Ingrese el valor en Pulgadas");
					I=tc.nextDouble();
					Centi_I= I*2.54;
					System.out.println("-------------------------------------------------------------------------------");
				    System.out.println("El valor en Centimetros es = \n"+ Centi_I+"Cm");
					System.out.println("-------------------------------------------------------------------------------");
					
				case 4: 
					
					System.out.println("Salida");
				}
                }while (opc!=4);
				} catch ( java.util.InputMismatchException j) {
					System.out.println("Solo se permiten números ");
				}
	
	}

}
