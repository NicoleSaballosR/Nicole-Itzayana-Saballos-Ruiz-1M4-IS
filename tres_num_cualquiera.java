package ejerc11_20;

import java.util.Scanner;

public class tres_num_cualquiera {

	public static void main(String[] args) {
		// #35 tres números cualesquiera y que calcule la suma de ellos y su promedio.
		Scanner tc=new Scanner(System.in);
		
		int a,b,c, suma=0, promedio=0;
		try {
			do {
				System.out.println("Ingrese el valor de 'a' ");
				a=tc.nextInt();
			}while (a<0);
			do {
				System.out.println("Ingrese el valor de 'b' ");
				b= tc.nextInt();
			}while (b<0);
			do {
				System.out.println("Ingrese el valor de 'c' ");
				c=tc.nextInt();
			} while (c<0);
			System.out.println("----------------------------------------------------------------------------------");
			suma= a+b+c;
			promedio= suma/3;
			System.out.println("La suma de sus califocaciones es = \n "+suma );
			System.out.println("Su promedio es de = \n "+promedio);
			System.out.println("----------------------------------------------------------------------------------");
			}catch ( java.util.InputMismatchException j) {
				System.out.println("Solo se permiten números ");
			}
		}

	}


