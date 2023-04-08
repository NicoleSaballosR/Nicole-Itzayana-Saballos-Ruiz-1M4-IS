package ejerc11_20;

import java.util.Scanner;

public class valor_del_Coseno {

	public static void main(String[] args) {
		// #11 Valor del Coseno
		
		Scanner tc=new Scanner (System.in);
		
		double  num;
		
		//Recolección de resultado
		try {
		do {
		System.out.println("Digite el número que desee evaluar");
		num=tc.nextInt();
		}while (num<0);
		System.out.println("--------------------------------------------------------------------------------------------------");
		//Operación 
		Math.cos(num);
        //Respuestas 
		System.out.println("El coseno es = \n "+Math.cos(num));
		System.out.println("--------------------------------------------------------------------------------------------------");
		} catch ( java.util.InputMismatchException j) {
			System.out.println("Solo se permiten números ");
		}
	}

}
