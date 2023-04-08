package ejerc11_20;

import java.util.Scanner;

public class dif_entre_triangulos {

	public static void main(String[] args) {
		// #31 diferenciación entre triángulos 
		
		Scanner tc= new Scanner(System.in);
         
		try {
		float L1 = 0,L2 = 0, L3 = 0;
		System.out.println("Ingrese el primer lado");
		L1= tc.nextFloat();
		System.out.println("Ingrese el segundo lado");
		L2= tc.nextFloat();
		System.out.println("Ingrese el tercer lado");
		L3=tc.nextFloat();
			if (L1==L2&& L2==L3) {
				System.out.println("Es un triángulo Equilatero");
			}
			else if ((L1==L2 && L2!=L3) || (L1!=L2 && L2==L3) ) {
				System.out.println("Es un triángulo Isósceles");
			}
			else {
				System.out.println("Es un triángulo Escaleno");
			}
		}catch ( java.util.InputMismatchException j) {
			System.out.println("Solo se permiten números ");
		}
	}

}
