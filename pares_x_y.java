package ejerc11_20;
import java.util.Scanner;
public class pares_x_y {

	public static void main(String[] args) {
		// #30 pares de ´´´x´´ y ´´y´´
		Scanner tc= new Scanner(System.in);
		
		int x, y;
		try {
		System.out.println("Ingrese el valor de ´´X´´");
		x= tc.nextInt();
		System.out.println("Ingrese el valor de ´´Y´´");
		y=tc.nextInt();
		 System.out.println("-----------------------------------------------------------------------");
          
		  if (x % 2 == 0 && y % 2 == 0) {
	            System.out.println("Ambos números son pares.");
	        } else if (x % 2 == 0 && y % 2 != 0) {
	            System.out.println("El primer número (X) es par y el segundo número (Y) es impar.");
	        } else if (x % 2 != 0 && y % 2 == 0) {
	            System.out.println("El primer número (X) es impar y el segundo número (Y) es par.");
	        } else {
	            System.out.println("Ambos números son impares.");
	        }
		  
	}catch ( java.util.InputMismatchException j) {
		System.out.println("Solo se permiten números ");
	}

}
}