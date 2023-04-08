package ejerc11_20;

import java.util.Scanner;

public class Pantalones {

	public static void main(String[] args) {
		// #27 Pantalones y su precio 
		
		Scanner tc=new Scanner(System.in);
		
		int n,total_1=0, total_2=0;
		
		try {
		do {
		System.out.println("Ingrese la cantidad de pantaloes que desea comprar");
		n=tc.nextInt();
		}while (n<0);
        System.out.println("-------------------------------------------------------------------------");
        //Operaciones 
        if (n>=3) {
      total_1= n*10;
      System.out.println("El precio de los  pantalones por ser 3 o mas salen a 10 dólares \n"+n);
        System.out.println("El costo total es = \n "+total_1);
        }else { 
        	total_2= n*12;
      System.out.println("El precio de los pantalones por ser menos de 3 salen a 12 dólares \n "+n);
      System.out.println("El costo total es = \n"+total_2);
        }
        System.out.println("--------------------------------------------------------------------------");
		} catch ( java.util.InputMismatchException j) {
			System.out.println("Solo se permiten números ");
		}
	}

}
