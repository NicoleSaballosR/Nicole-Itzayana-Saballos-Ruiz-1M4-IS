package ejerc11_20;

import java.util.Scanner;

public class orden_invertido {

	public static void main(String[] args) {
		// #18 orden invertido ejem: 567 Salida 765.
      
		Scanner tc= new Scanner(System.in);
		
		int num;
		int prim_Cifra=0,Seg_Cifra=0,ter_Cifra=0;
		int num_Invertido=0;
		
		//Recolección de datos 
		try {
		do {
		System.out.println("Ingrese un numero que contenga tres cifras");
		num= tc.nextInt();
		} while (num<0);
		System.out.println("-----------------------------------------------------------------------------");
		prim_Cifra= num %10;
		Seg_Cifra= (num/10)%10;
		ter_Cifra= num/100;
		num_Invertido= prim_Cifra*100+Seg_Cifra*10+ter_Cifra;
		
		//Respuesta 
		System.out.println("La cifra invertida es = \n"+ num_Invertido);
		System.out.println("------------------------------------------------------------------------------");
	}catch ( java.util.InputMismatchException t) {
		System.out.println("Solo se permiten números ");
	}
	}

}
